package com.majidmostafavi.resource.single;
import com.majidmostafavi.entity.single.LongTermAccount;
import com.majidmostafavi.service.single.BankAccountService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/api/long-term-accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LongTermAccountResource {

    @Inject
    BankAccountService service;

    @GET
    public List<LongTermAccount> getAll() {
        return service.getLongTermAccounts();
    }

    @POST
    @Transactional
    public void create(LongTermAccount account) {
        service.persist(account);
    }
}