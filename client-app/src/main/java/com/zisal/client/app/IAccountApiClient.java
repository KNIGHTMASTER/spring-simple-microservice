package com.zisal.client.app;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@FeignClient(name = "account-api", configuration = FeignConfig.class)
@Headers("Accept: application/json")
public interface IAccountApiClient {

    @GetMapping(path = "/accounts")
    List<Account> getAllAccounts();

    @GetMapping("/accounts/{accountNumber}")
    Account getAccount(@PathVariable(value = "accountNumber") String accountNumber);
}
