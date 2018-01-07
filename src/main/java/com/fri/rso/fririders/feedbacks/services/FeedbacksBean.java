package com.fri.rso.fririders.feedbacks.services;



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

    @Inject
    @DiscoverService(value="display-bookings", version = "1.0.x", environment = "dev")
    private Optional<String> bookingsUrl;

    private String accommodationsUrl = "http://accommodations:8081/v1/accommodations";
}
