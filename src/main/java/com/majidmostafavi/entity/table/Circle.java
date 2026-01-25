package com.majidmostafavi.entity.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CIRCLE")
public class Circle extends Shape {
    @Column(name = "RADIUS")
    private double radius;
}
