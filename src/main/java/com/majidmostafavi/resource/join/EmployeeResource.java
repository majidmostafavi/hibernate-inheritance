package com.majidmostafavi.resource.join;

import com.majidmostafavi.entity.join.Employee;
import com.majidmostafavi.service.join.EmployeeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/api/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    EmployeeService service;

    @GET
    public List<Employee> getAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        Employee employee = service.findById(id);
        return employee == null
                ? Response.status(Response.Status.NOT_FOUND).build()
                : Response.ok(employee).build();
    }

    @POST
    public Response create(Employee employee) {
        service.create(employee);
        return Response.status(Response.Status.CREATED).entity(employee).build();
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