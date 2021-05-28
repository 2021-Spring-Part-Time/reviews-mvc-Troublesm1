package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    @Test
    public void shouldFindReviewOne() {
        Review reviewOne = new Review (1L, "review one name", "pic one", "review one category", "synopsis", "date");
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

}
