package com.zisal.account.api;


import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByNumber(String p_Number);

}
