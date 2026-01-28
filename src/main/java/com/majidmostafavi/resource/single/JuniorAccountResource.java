package com.majidmostafavi.resource.single;

import com.majidmostafavi.entity.single.JuniorAccount;
import com.majidmostafavi.service.single.BankAccountService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/junior-accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class JuniorAccountResource {

    @Inject
    BankAccountService service;

    @GET
    public List<JuniorAccount> getAll() {
        return service.getJuniorAccounts();
    }

    @POST
    @Transactional
    public void create(JuniorAccount account) {
        service.persist(account);
    }
}