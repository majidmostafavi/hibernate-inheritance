package com.majidmostafavi.entity.single;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.Period;

@Entity
@DiscriminatorValue("JuniorAccount")
public class JuniorAccount extends AbstractBankAccount {

    @Column(name = "INTEREST")
    private Double interest;
    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Override
    double calculateInterest() {
        Period period = Period.between(birthDate, LocalDate.now());
        return balance = balance * period.getYears()*interest;
    }
}
