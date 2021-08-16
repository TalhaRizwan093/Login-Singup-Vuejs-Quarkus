package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("Signup")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")

public class SignupEndpoint {

    @Inject SignupRepository SignupRepository;

    @POST
    public Response create(Signup customer) {
        SignupRepository.createCustomer(customer);

        if(customer.getUser_name()!=null)
        {
            return Response.ok(true).build();
        }

        return Response.ok(false).build();
    }


}
