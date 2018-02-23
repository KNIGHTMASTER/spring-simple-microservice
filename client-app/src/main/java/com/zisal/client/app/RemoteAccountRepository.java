package com.zisal.client.app;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class RemoteAccountRepository implements AccountRepository {

    @Autowired
    private IAccountApiClient accountApiClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteAccountRepository.class);

    @HystrixCommand(groupKey = "account-service", fallbackMethod = "accountServiceDown")
    @Override
    public List<Account> getAllAccounts() {
        return accountApiClient.getAllAccounts();
    }

    @Override
    public Account getAccount(String number) {
        return accountApiClient.getAccount(number);
    }

    public List<Account> accountServiceDown() {
        LOGGER.info("Account Service Down");
        List<Account> result = new ArrayList<>();
        result.add(new Account());
        return result;
    }
}
