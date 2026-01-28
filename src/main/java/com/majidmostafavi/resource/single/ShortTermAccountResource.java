package com.majidmostafavi.resource.single;

import com.majidmostafavi.entity.single.ShortTermAccount;
import com.majidmostafavi.service.single.BankAccountService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/short-term-accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ShortTermAccountResource {

    @Inject
    BankAccountService service;

    @GET
    public List<ShortTermAccount> getAll() {
        return service.getShortTermAccounts();
    }

    @POST
    @Transactional
    public void create(ShortTermAccount account) {
        service.persist(account);
    }
}