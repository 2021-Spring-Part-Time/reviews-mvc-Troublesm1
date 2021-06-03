package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String pic;
    private String category;
    private String synopsis;
    private String date;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPic() {
        return pic;
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

    public Review(long id, String name, String pic, String category, String synopsis, String date) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.category = category;
        this.synopsis = synopsis;
        this.date = date;
    }
}
