package com.gratitude.agradecimientos.domain;

import java.util.Date;
import java.util.List;

public class Post {
    private int postId;
    private int userId;
    private Date date;
    private List<ThanksPost> ThanksList;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ThanksPost> getThanksList() {
        return ThanksList;
    }

    public void setThanksList(List<ThanksPost> thanksList) {
        ThanksList = thanksList;
    }
}
