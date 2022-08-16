package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private String discType;
    private int capacity;
    public ArrayList<String> contents = new ArrayList<>();

    private int remainingCapacity;
    public BaseDisc(String name, String discType, int capacity) {
        this.name = name;
        this.discType = discType;
        this.capacity = capacity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addContents(String item){
        contents.add(item);
        capacity--;
        remainingCapacity = capacity;
    }

    public int getRemainingCapacity(){
        return remainingCapacity;
    }
    public ArrayList<String> getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "This disc, " + name + ", has a ";
    }
}
