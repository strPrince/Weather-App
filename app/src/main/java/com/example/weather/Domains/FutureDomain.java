package com.example.weather.Domains;

public class FutureDomain {
    private String date;
    private String status;
    private String picPath;
    private int highTemp;
    private  int lowTemp;

    public FutureDomain(String date, String status, String picPath, int highTemp, int lowTemp) {
        this.date = date;
        this.status = status;
        this.picPath = picPath;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }
}
