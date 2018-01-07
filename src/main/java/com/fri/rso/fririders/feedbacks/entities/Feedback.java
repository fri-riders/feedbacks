package com.fri.rso.fririders.feedbacks.entities;

import java.util.Date;

public class Feedback {

    private long id;
    private long accommodationId;
    private String userId;
    private int accommodationRating;
    private int locationRating;
    private int hostRating;
    private Date date;
    private String message;

    public Feedback(long id, long accommodationId, String userId, int accommodationRating, int locationRating, int hostRating, Date date, String message) {
        this.id = id;
        this.accommodationId = accommodationId;
        this.userId = userId;
        this.accommodationRating = accommodationRating;
        this.locationRating = locationRating;
        this.hostRating = hostRating;
        this.date = date;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(long accommodationId) {
        this.accommodationId = accommodationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAccommodationRating() {
        return accommodationRating;
    }

    public void setAccommodationRating(int accommodationRating) {
        this.accommodationRating = accommodationRating;
    }

    public int getLocationRating() {
        return locationRating;
    }

    public void setLocationRating(int locationRating) {
        this.locationRating = locationRating;
    }

    public int getHostRating() {
        return hostRating;
    }

    public void setHostRating(int hostRating) {
        this.hostRating = hostRating;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
