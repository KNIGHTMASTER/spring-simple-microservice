package com.zisal.account.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping("/accounts")
    public Account[] all() {
        LOGGER.info("accounts-server all() invoked");
        List<Account> accounts = accountRepository.getAllAccounts();
        LOGGER.info("accounts-server all() found: " + accounts.size());
        return accounts.toArray(new Account[accounts.size()]);
    }

    @RequestMapping("/accounts/{id}")
    public Account byId(@PathVariable("id") String id) {
        LOGGER.info("accounts-server byId() invoked: " + id);
        Account account = accountRepository.getAccount(id);
        LOGGER.info("accounts-server byId() found: " + account);
        return account;
    }
}
