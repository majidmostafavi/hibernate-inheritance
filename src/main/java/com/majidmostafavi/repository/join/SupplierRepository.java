package com.majidmostafavi.repository.join;

import com.majidmostafavi.entity.join.Supplier;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SupplierRepository implements PanacheRepository<Supplier> {
}
