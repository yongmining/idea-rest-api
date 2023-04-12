package com.travlej.backend.postrequest.request.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Request")
@Table(name = "REQUEST")
public class Request {

    @Id
    @Column(name = "CORRECTION_ID")
    private String correctionId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DATE")
    private java.util.Date date;

    @Column(name = "WRITER")
    private String writer;

    @Column(name = "CONTEXT")
    private String context;

    public Request() {}

    public Request(String correctionId, String title, Date date, String writer, String context) {
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
        return "Request{" +
                "correctionId='" + correctionId + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", writer='" + writer + '\'' +
                ", context='" + context + '\'' +
                '}';
    }

}
