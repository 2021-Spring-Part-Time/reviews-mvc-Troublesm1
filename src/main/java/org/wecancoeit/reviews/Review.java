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

    public Review(long id, String review_one_name, String pic_one, String review_one_category, String synopsis, String date) {
        this.id = id;
        this.review_one_name = review_one_name;
        this.pic_one = pic_one;
        this.category = review_one_category;
        this.synopsis = synopsis;
        this.date = date;
    }
}
