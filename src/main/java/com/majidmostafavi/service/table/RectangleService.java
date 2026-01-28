package com.majidmostafavi.service.table;

import com.majidmostafavi.entity.table.Rectangle;
import com.majidmostafavi.repository.table.RectangleRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class RectangleService {
    @Inject
    private RectangleRepository repository;

    public List<Rectangle> findAll() {
        return repository.listAll();
    }

    public void persist(Rectangle rectangle) {
        repository.persist(rectangle);
    }
}
