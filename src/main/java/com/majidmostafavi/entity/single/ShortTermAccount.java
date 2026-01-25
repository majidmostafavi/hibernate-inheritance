package com.majidmostafavi.entity.single;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ShortTermAccount")
public class ShortTermAccount  extends AbstractBankAccount{

    @Column(name = "INTEREST")
    private Double interest;


    @Override
    double calculateInterest() {
        return balance * interest;
    }
}
