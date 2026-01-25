package com.majidmostafavi.entity.table;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long  id;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "COLOR")
    private Color color;
}
