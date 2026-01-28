package com.majidmostafavi.repository.table;

import com.majidmostafavi.entity.table.Circle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CircleRepository implements PanacheRepository<Circle> {

}
