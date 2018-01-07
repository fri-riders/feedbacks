package com.fri.rso.fririders.feedbacks.database;

import com.fri.rso.fririders.feedbacks.entities.Feedback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Database {

    private static List<Feedback> feedbacks = new ArrayList<>();

    public static List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    // fake feedbacks
    static {
        feedbacks.add(new Feedback(1, 1, "1bd484ed-b5ab-4f88-b57e-3c167d53ecb2",8, 7, 10,
                new Date(), "We were very satisfied with our staying in the hotel. Host was very kind and helpful. This is a place worth visiting."));
        feedbacks.add(new Feedback(2, 1, "88eaeccc-7b77-439f-bba8-2525d2daa7f7",9, 6, 9,
                new Date(), "We were very satisfied with everything except location which is very far away from the city centre."));
        feedbacks.add(new Feedback(3, 2, "1b9aec27-b80c-4baa-8467-2d0a89c5640c",5, 4, 3,
                new Date(), "We do not suggest staying in this hotel. Staff is very rude, hotel is a mess and too expensive."));
        feedbacks.add(new Feedback(4, 3, "1bd484ed-b5ab-4f88-b57e-3c167d53ecb2",7, 10, 9,
                new Date(), "Accommodation itself is nothing special and a bit expensive. But the place is amazing. " +
                "From the bedroom there is a beautiful view on the beach. Apartment is located few meters from the city centre. I will definitely visit this place again."));
    }

    public static Feedback getFeedback(int fId) {
        for (Feedback f: feedbacks) {
            if (f.getId() == fId)
                return f;
        }
        return null;
    }

    public static void addFeedback(Feedback f) throws Exception{
        try {
            feedbacks.add(f);
        }catch (Exception e){
            throw new Exception("Error: inserting feedback in database failed.");
        }
    }

    public static void deleteFeedback(int fId) throws Exception{
        for (Feedback f : feedbacks){
            if(f.getId() == fId) {
                feedbacks.remove(f);
                return;
            }
        }
    }

}
