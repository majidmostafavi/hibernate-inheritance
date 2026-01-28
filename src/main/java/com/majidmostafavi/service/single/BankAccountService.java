package com.majidmostafavi.service.single;


import com.majidmostafavi.entity.single.AbstractBankAccount;
import com.majidmostafavi.entity.single.JuniorAccount;
import com.majidmostafavi.entity.single.LongTermAccount;
import com.majidmostafavi.entity.single.ShortTermAccount;
import com.majidmostafavi.repository.single.BankAccountRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class BankAccountService {

    @Inject
    private BankAccountRepository repository;

    public List<JuniorAccount> getJuniorAccounts() {
        return repository.findByType(JuniorAccount.class)
                .stream()
                .map(JuniorAccount.class::cast)
                .toList();
    }

    public List<LongTermAccount> getLongTermAccounts() {
        return repository.findByType(LongTermAccount.class)
                .stream()
                .map(LongTermAccount.class::cast)
                .toList();
    }

    public List<ShortTermAccount> getShortTermAccounts() {
        return repository.findByType(ShortTermAccount.class)
                .stream()
                .map(ShortTermAccount.class::cast)
                .toList();
    }
    public void persist(AbstractBankAccount entity) {
        repository.persist(entity);
    }

}
