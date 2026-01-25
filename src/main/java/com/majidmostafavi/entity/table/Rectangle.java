package com.majidmostafavi.entity.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "RECTANGLE")
public class Rectangle extends Shape {
    @Column(name = "WIDTH")
    private double width;
    @Column(name = "LENGTH")
    private double length;
}
