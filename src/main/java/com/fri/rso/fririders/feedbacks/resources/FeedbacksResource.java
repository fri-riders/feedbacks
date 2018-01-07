package com.fri.rso.fririders.feedbacks.resources;

import com.fri.rso.fririders.feedbacks.entities.User;
import com.kumuluz.ee.logs.LogManager;
import com.kumuluz.ee.logs.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("feedbacks")
public class FeedbacksResource {

    private Logger logger = LogManager.getLogger( FeedbacksResource.class.getName() );


    @GET
    @Path("/{accommodationId}")
    public Response getAccommodationFeedbacks(@PathParam("accommodationId") String aId) {
        logger.info("REST CALL: getAccommodationFeedbacks");
        return null;
    }

}
