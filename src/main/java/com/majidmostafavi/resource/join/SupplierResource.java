package com.majidmostafavi.resource.join;
import com.majidmostafavi.entity.join.Supplier;
import com.majidmostafavi.service.join.SupplierService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/api/suppliers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SupplierResource {

    @Inject
    SupplierService service;

    @GET
    public List<Supplier> getAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        Supplier supplier = service.findById(id);
        return supplier == null
                ? Response.status(Response.Status.NOT_FOUND).build()
                : Response.ok(supplier).build();
    }

    @POST
    public Response create(Supplier supplier) {
        service.create(supplier);
        return Response.status(Response.Status.CREATED).entity(supplier).build();
    }



    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        boolean deleted = service.delete(id);
        return deleted
                ? Response.noContent().build()
                : Response.status(Response.Status.NOT_FOUND).build();
    }
}