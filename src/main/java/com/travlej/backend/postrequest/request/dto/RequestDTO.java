package com.travlej.backend.postrequest.request.dto;

import java.util.Date;

public class RequestDTO {

    private String correctionId;
    private String title;
    private java.util.Date date;
    private String writer;
    private String context;

    public RequestDTO() {}

    public RequestDTO(String correctionId, String title, Date date, String writer, String context) {
        this.correctionId = correctionId;
        this.title = title;
        this.date = date;
        this.writer = writer;
        this.context = context;
    }

    public String getCorrectionId() {
        return correctionId;
    }

    public void setCorrectionId(String correctionId) {
        this.correctionId = correctionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "RequstDTO{" +
                "correctionId='" + correctionId + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", writer='" + writer + '\'' +
                ", context='" + context + '\'' +
                '}';
    }

}
