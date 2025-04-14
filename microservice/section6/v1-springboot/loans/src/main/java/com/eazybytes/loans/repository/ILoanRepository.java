package com.eazybytes.loans.repository;

import com.eazybytes.loans.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ILoanRepository extends JpaRepository<Loan, Long> {
    Optional<Loan> findByMobileNumber(String mobileNumber);

    Optional<Loan> findByLoanNumber(String loanNumber);
}