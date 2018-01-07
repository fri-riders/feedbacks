package com.fri.rso.fririders.feedbacks.health;

import com.fri.rso.fririders.feedbacks.config.ConfigProperties;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.inject.Inject;

public class FeedbacksHealthCheck implements HealthCheck{
    @Inject
    private ConfigProperties configProperties;

    @Override
    public HealthCheckResponse call() {

        if (configProperties.isHealthy()) {
            return HealthCheckResponse.named(FeedbacksHealthCheck.class.getSimpleName()).up().build();
        } else {
            return HealthCheckResponse.named(FeedbacksHealthCheck.class.getSimpleName()).down().build();
        }

    }
}
