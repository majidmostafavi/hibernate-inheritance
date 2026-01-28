package com.majidmostafavi.resource.table;

import com.majidmostafavi.entity.table.Circle;
import com.majidmostafavi.service.table.CircleService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/circle")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CircleResource {
    @Inject
    CircleService service;

    @GET
    public List<Circle> getAll() {
        return service.findAll();
    }

    @POST
    @Transactional
    public void create(Circle v) {
        service.persist(v);
    }
}
