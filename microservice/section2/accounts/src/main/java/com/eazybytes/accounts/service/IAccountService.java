package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {


    /**
     * Create account.
     *
     * @param customerDto the customer dto
     */
    void createAccount(CustomerDto customerDto);

    /**
     * Fetch account customer dto.
     *
     * @param mobileNumber the mobile number
     * @return the customer dto
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     * Update account boolean.
     *
     * @param customerDto the customer dto
     * @return the boolean
     */
    boolean updateAccount(CustomerDto customerDto);

}
