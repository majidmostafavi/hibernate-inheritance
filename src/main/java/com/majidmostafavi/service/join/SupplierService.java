package com.majidmostafavi.service.join;

import com.majidmostafavi.entity.join.Supplier;
import com.majidmostafavi.repository.join.SupplierRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SupplierService {

    @Inject
    SupplierRepository repository;

    public List<Supplier> findAll() {
        return repository.listAll();
    }

    public Supplier findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Supplier create(Supplier supplier) {
        repository.persist(supplier);
        return supplier;
    }



    @Transactional
    public boolean delete(Long id) {
        return repository.deleteById(id);
    }
}
