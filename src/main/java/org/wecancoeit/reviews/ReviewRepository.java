package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review A = new Review(1L,"CompTIA A+", "/images/a+.jpg","IT Basics","Introduction to All things IT","April 2019");
        Review B = new Review(2L,"CompTIA Network+", "/images/net+.jpg","Computer Networking Basics","Introduction to Computer Networking"," December 2019");
        Review C = new Review(3L,"CompTIA Security+", "images/sec+.jpg","Cyber Security Basics","Cyber security basics","December 2020");
        Review D = new Review(4L,"AWS Cloud Practitioner", "images/cloud.jpg","Amazon Web Services","Introduction to AWS Cloud"," March 2021");

        reviewsList.put(A.getId(), A);
        reviewsList.put(B.getId(), B);
        reviewsList.put(C.getId(), C);
        reviewsList.put(D.getId(), D);

    }

    public ReviewRepository(Review ...reviewToAdd) {
        for (Review review: reviewToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
