package com.majidmostafavi.repository.single;

import com.majidmostafavi.entity.single.AbstractBankAccount;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class BankAccountRepository  implements PanacheRepository<AbstractBankAccount> {
    public List<AbstractBankAccount> findByType(Class<?> type) {
        return find("type(this) = ?1", type).list();
    }
}
