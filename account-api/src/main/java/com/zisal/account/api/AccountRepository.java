package com.zisal.account.api;

import java.util.List;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface AccountRepository {

    List<Account> getAllAccounts();

    Account getAccount(String number);

}
