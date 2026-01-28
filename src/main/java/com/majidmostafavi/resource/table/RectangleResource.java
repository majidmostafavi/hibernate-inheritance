package com.majidmostafavi.resource.table;

import com.majidmostafavi.entity.table.Rectangle;
import com.majidmostafavi.service.table.RectangleService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/rectangle")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RectangleResource {
    @Inject
    RectangleService service;
    @GET
    public List<Rectangle> getAll() {
        return service.findAll();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Rectangle rectangle) {
        service.persist(rectangle);
    }
}
