package com.example.myapplication.phone;

public class PhoneRecycle {
    String CPU;
    String RAM;
    String ROM;
    String camera;
    String display;
    String battery;
    int imageUrl;

    public PhoneRecycle(String CPU, String RAM, String ROM, String camera, String display, String battery, int imageUrl){
        this.CPU = CPU;
        this.RAM = RAM;
        this.ROM = ROM;
        this.camera = camera;
        this.display = display;
        this.battery = battery;
        this.imageUrl = imageUrl;
    }

    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() { return RAM; }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getROM() { return ROM; }
    public void setROM(String ROM) {
        this.ROM = ROM;
    }

    public String getCamera() { return camera; }
    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getDisplay() { return display; }
    public void setDisplay(String display) {
        this.display = display;
    }

    public String getBattery() { return battery; }
    public void setBattery(String battery) {
        this.display = battery;
    }

    public int getImageUrl() { return imageUrl; }
    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
