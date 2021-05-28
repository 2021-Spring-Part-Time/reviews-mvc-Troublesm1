package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String review_one_name;
    private String pic_one;
    private String category;
    private String synopsis;
    private String date;

    public Long getId() {
        return id;
    }

    public String getReview_one_name() {
        return review_one_name;
    }

    public String getPic_one() {
        return pic_one;
    }

    public String getCategory() {
        return category;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getDate() {
        return date;
    }

    public Review(long id, String review_one_name, String pic_one, String review_one_category, String synopsis, String date) {
        this.id = id;
        this.review_one_name = review_one_name;
        this.pic_one = pic_one;
        this.category = review_one_category;
        this.synopsis = synopsis;
        this.date = date;
    }
}
