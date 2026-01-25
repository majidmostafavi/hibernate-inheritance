package com.majidmostafavi.entity.join;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SUPPLIER")
public class Supplier extends Person{

    @Column(name = "ECONOMIC_CODE")
    private Long economicCode;
    @Column(name = "TAX_CODE")
    private Long taxCode;
}
