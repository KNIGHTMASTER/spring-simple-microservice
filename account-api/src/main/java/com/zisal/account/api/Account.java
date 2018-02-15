package com.zisal.account.api;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created on 2/15/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Document(collection = "account")
@Data
public class Account {

    @Id
    private String id;
    private String number;
    private String name;
    private Long amount;
}
