package com.archi.wade.model;
import javax.persistence.*;
import java.util.Date;

@Table(name="feedback")
public class Feedback {
    private int id;
    private Date f_date;
    private String feedback;
    private int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getF_date() {
        return f_date;
    }

    public void setF_date(Date f_date) {
        this.f_date = f_date;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Feedback(int id, java.sql.Timestamp f_date, String feedback, int state) {
        this.id = id;
        this.f_date = f_date;
        this.feedback = feedback;
        this.state = state;
    }

    public Feedback(int id,Date f_date, String feedback, int state) {
        this.id = id;
        this.f_date = f_date;
        this.feedback = feedback;
        this.state = state;
    }

    public Feedback(int id,java.sql.Date f_date, String feedback, int state) {
        this.id = id;
        this.f_date = f_date;
        this.feedback = feedback;
        this.state = state;
    }
}
