package com.archi.wade.model;
import javax.persistence.*;

@Table(name="wade")
public class Wade {
    private int id;
    private String chinese;
    private String wade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getWade() {
        return wade;
    }

    public void setWade(String wade) {
        this.wade = wade;
    }

    public Wade(int id, String chinese, String wade) {
        this.id = id;
        this.chinese = chinese;
        this.wade = wade;
    }
}
