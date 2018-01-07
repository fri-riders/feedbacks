package com.fri.rso.fririders.feedbacks.resources;

import com.fri.rso.fririders.feedbacks.entities.Feedback;
import com.fri.rso.fririders.feedbacks.entities.User;
import com.fri.rso.fririders.feedbacks.services.FeedbacksBean;
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

    @Inject
    private FeedbacksBean feedbacksBean;

    @GET
    @Path("/accommodation/{accommodationId}")
    public Response getAccommodationFeedbacks(@PathParam("accommodationId") long aId) {
        logger.info("REST CALL: getAccommodationFeedbacks");
        List<Feedback> fbs = feedbacksBean.getAccommodationFeedbacks(aId);
        return Response.ok(fbs).build();
    }

    @GET
    @Path("/user/{userId}")
    public Response getUserFeedbacks(@PathParam("userId") String uId) {
        logger.info("REST CALL: getUserFeedbacks");
        List<Feedback> fbs = feedbacksBean.getUserFeedbacks(uId);
        return Response.ok(fbs).build();
    }

    @POST
    public Response addAccommodationFeedback(Feedback f){
        logger.info("REST CALL: addAccommodationFeedback");
        try {
            feedbacksBean.addAccommodationFeedback(f);
            return Response.ok().build();
        }
        catch (Exception e){
            return Response.status(Response.Status.CONFLICT).entity("Adding feedback in database failed.").build();
        }
    }

}
