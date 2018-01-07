package com.fri.rso.fririders.feedbacks.services;



import com.fri.rso.fririders.feedbacks.database.Database;
import com.fri.rso.fririders.feedbacks.entities.Feedback;
import com.fri.rso.fririders.feedbacks.entities.User;
import com.kumuluz.ee.discovery.annotations.DiscoverService;
import com.kumuluz.ee.logs.LogManager;
import com.kumuluz.ee.logs.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class FeedbacksBean {

    private Logger logger = LogManager.getLogger(FeedbacksBean.class.getName());

    private static Client client = ClientBuilder.newClient();

    @Inject
    private AuthBean authBean;

    public List<Feedback> getAccommodationFeedbacks(long aId){
        List<Feedback> feedbacks = Database.getFeedbacks();
        List<Feedback> accFeedbacks = new ArrayList<>();
        for (Feedback f : feedbacks){
            if(f.getAccommodationId() == aId)
                accFeedbacks.add(f);
        }
        return accFeedbacks;
    }

    public List<Feedback> getUserFeedbacks(String uId){
        List<Feedback> feedbacks = Database.getFeedbacks();
        List<Feedback> usrFeedbacks = new ArrayList<>();
        for (Feedback f : feedbacks){
            if(f.getUserId().equals(uId))
                usrFeedbacks.add(f);
        }
        return usrFeedbacks;
    }

    public void addAccommodationFeedback(Feedback f) throws Exception{
        Database.addFeedback(f);
    }
}
