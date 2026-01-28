package com.majidmostafavi.service.join;

import com.majidmostafavi.entity.join.Employee;
import com.majidmostafavi.repository.join.EmployeeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class EmployeeService {

    @Inject
    EmployeeRepository repository;

    public List<Employee> findAll() {
        return repository.listAll();
    }

    public Employee findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Employee create(Employee employee) {
        repository.persist(employee);
        return employee;
    }


    @Transactional
    public boolean delete(Long id) {
        return repository.deleteById(id);
    }
}