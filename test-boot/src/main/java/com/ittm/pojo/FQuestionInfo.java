package com.ittm.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FQuestionInfo {
    protected Long id;
    protected String title;
    protected String catory;
    protected int open;
    protected String author;

    protected int viewNum;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    protected Date createTime;
    protected int star = 0;
    protected int status = 0;

    public FQuestionInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCatory(String catory) {
        this.catory = catory;
    }

    public String getCatory() {
        return catory;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getOpen() {
        return open;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getStar() {
        return star;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
