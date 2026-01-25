package com.majidmostafavi.entity.single;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("LongTermAccount")
public class LongTermAccount extends AbstractBankAccount{

    @Column(name = "DURATION")
    private Double duration;
    @Column(name = "INTEREST")
    private Double interest;


    @Override
    double calculateInterest() {
        return balance * duration*interest;
    }
}
