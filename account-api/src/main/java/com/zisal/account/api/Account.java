package com.zisal.account.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Data
public class Account implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -8634754122916943867L;

    public Account() {
    }

    public Account(Long amount, String number, String name) {
        this.amount = amount;
        this.number = number;
        this.name = name;
    }

    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("number")
    private String number;

    @JsonProperty("name")
    private String name;
}
