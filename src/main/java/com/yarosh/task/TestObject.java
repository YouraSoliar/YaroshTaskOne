package com.yarosh.task;

public class TestObject {

    private Type type;
    private Name name;

    public TestObject(Type type, Name name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MapObject{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
