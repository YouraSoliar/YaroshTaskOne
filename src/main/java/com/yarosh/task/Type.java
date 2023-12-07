package com.yarosh.task;

public enum Type {
    TYPE1("Type1"),
    TYPE2("Type2"),
    TYPE3("Type3");

    private String type;
    private Type(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String toString(){
        return this.type;
    }
}
