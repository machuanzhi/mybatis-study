package com.smk.pay.macz.model;

/**
 * Project mybatis-study
 * Created by chuanzhi.mcz
 * Date 2016/8/11 9:49
 */
public class Comment {

    private Integer id;

    private Integer postId;

    private String name;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
