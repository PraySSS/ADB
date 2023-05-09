package com.example.lib;


//public class Main {
//    public static void main(String[] args) {
//        Phone iPhone=new Phone("iPhone11",4,12,6);
//
//        System.out.println(iPhone.getName());
//        iPhone.playMusic("GG");
//
//        Phone Xiaomi=new Phone("Black Shark",16);
//    }
//}

public class Phone{
    String name;
    int screenSize;
    int memoryRam;
    int camera;

    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void playMusic(String trackName){
        System.out.println("Playing: "+trackName);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}