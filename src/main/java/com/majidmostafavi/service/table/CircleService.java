package com.majidmostafavi.service.table;

import com.majidmostafavi.entity.table.Circle;
import com.majidmostafavi.repository.table.CircleRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CircleService {
    @Inject
    private CircleRepository circleRepository;

    public List<Circle> findAll() {
        return circleRepository.listAll();
    }

    public void persist(Circle circle) {
        circleRepository.persist(circle);
    }

}
