package com.rhuanrocha.resource;

import com.rhuanrocha.business.PersonBusiness;
import com.rhuanrocha.model.Person;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/persons")
public class PersonResource {

    @Inject
    private PersonBusiness personBusiness;

    @GET
    public Response findAllPersons(){

        return Response
                .ok( personBusiness.findAll() )
                .build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNewPerson(@NotBlank @FormParam("firstName") String firstName,
                                @NotBlank @FormParam("lastName") String lastName){

        Person person = personBusiness.save(Person.build( firstName, lastName ));

        return Response
                .created(URI.create("persons/"+person.getId()))
                .build();

    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id){

        return Response
                .ok( personBusiness.findById(id))
                .build();

    }

}
