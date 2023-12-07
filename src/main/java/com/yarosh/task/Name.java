package com.yarosh.task;

public enum Name {
    NAME1("Name1"),
    NAME2("Name2"),
    NAME3("Name3");

    private String name;
    private Name(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
}
