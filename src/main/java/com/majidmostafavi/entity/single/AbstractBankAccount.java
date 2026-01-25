package com.majidmostafavi.entity.single;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type")
@Table(name = "BANK_ACCOUNT")
public abstract class AbstractBankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
    @Column(name = "BALANCE")
    protected Double balance;

    abstract double calculateInterest();

}
