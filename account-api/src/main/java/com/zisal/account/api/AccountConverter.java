package com.zisal.account.api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/15/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class AccountConverter {

    AccountDTO mapEntityToDTO(Account p_Account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAmount(p_Account.getAmount());
        accountDTO.setNumber(p_Account.getNumber());
        accountDTO.setName(p_Account.getName());
        return accountDTO;
    }

    List<AccountDTO> mapEntitiesToDTO(List<Account> p_Accounts) {
        List<AccountDTO> result = new ArrayList<>();
        for (Account account : p_Accounts) {
            result.add(mapEntityToDTO(account));
        }
        return result;
    }
}
