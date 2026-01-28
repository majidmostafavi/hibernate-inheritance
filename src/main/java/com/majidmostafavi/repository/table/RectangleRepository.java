package com.majidmostafavi.repository.table;

import com.majidmostafavi.entity.table.Rectangle;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RectangleRepository implements PanacheRepository<Rectangle> {
}
