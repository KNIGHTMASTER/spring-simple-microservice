package com.zisal.account.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Repository
public class StubAccountRepository implements AccountRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(StubAccountRepository.class);

    private Map<String, Account> accountsByNumber = new HashMap<String, Account>();

    public StubAccountRepository() {
        Account account = new Account(1000L, "5115", "Devloper" );
        accountsByNumber.put("5115", account);

        account = new Account(2000L, "2089", "Analyst");
        accountsByNumber.put("2089", account);

        account = new Account(3000L, "1286", "Manager" );
        accountsByNumber.put("1286", account);

        LOGGER.info("Created StubAccountRepository");
    }

    @Override
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accountsByNumber.values());
    }

    @Override
    public Account getAccount(String number) {
        return accountsByNumber.get(number);
    }
}
