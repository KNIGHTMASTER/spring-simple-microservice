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

    @Autowired
    private AccountConverter accountConverter;

    @RequestMapping("/accounts")
    public AccountDTO[] all() {
        LOGGER.info("accounts-server all() invoked");
        List<AccountDTO> accountDTOs = accountConverter.mapEntitiesToDTO(accountRepository.findAll());
        LOGGER.info("accounts-server all() found: " + accountDTOs.size());
        return accountDTOs.toArray(new AccountDTO[accountDTOs.size()]);
    }

    @RequestMapping("/accounts/{id}")
    public AccountDTO byId(@PathVariable("id") String id) {
        LOGGER.info("accounts-server byId() invoked: " + id);
        AccountDTO accountDTO = accountConverter.mapEntityToDTO(accountRepository.findByNumber(id));
        LOGGER.info("accounts-server byId() found: " + accountDTO);
        return accountDTO;
    }
}
