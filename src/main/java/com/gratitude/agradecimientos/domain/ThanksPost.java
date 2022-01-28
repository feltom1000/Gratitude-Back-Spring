package com.gratitude.agradecimientos.domain;

import java.util.Date;

public class ThanksPost {
    private int postId;
    private int thanksId;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getThanksId() {
        return thanksId;
    }

    public void setThanksId(int thanksId) {
        this.thanksId = thanksId;
    }
}
