package com.juanpickselov.pragprog.model;

import java.io.Serializable;

/**
 * Created by tomgou on 4/6/2017.
 */
public class Tip implements Serializable {

    private static final long serialVersionUID = 1L;
    private String tipId;
    private String tip;
    private String tipDescription;

    public String getTipId() {
        return tipId;
    }

    public void setTipId(String tipId) {
        this.tipId = tipId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getTipDescription() {
        return tipDescription;
    }

    public void setTipDescription(String tipDescription) {
        this.tipDescription = tipDescription;
    }

    public String toString() {
        return new StringBuilder("Tip: ID=\"").append(this.getTipId()).append("\", Tip=\"").append(this.getTip()).append("\", Tip Description=\"").append(this.getTipDescription()).append("\"").toString();
    }
}
