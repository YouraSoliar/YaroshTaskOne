package com.yarosh.task;

import java.util.ArrayList;

public class Util {

    public static TestObject remap(TestObject testObject) {
        if (testObject.getName() == Name.NAME2 && testObject.getType() == Type.TYPE1) {
            testObject.setType(Type.TYPE3);
        }
        if (testObject.getName() == Name.NAME2 && testObject.getType() == Type.TYPE2) {
            testObject.setType(Type.TYPE1);
        }
        if (testObject.getName() == Name.NAME1 && testObject.getType() == Type.TYPE3) {
            testObject.setType(Type.TYPE2);
        }
        return testObject;
    }

    public static ArrayList<TestObject> sort(ArrayList<TestObject> testObjects) {
        ArrayList<TestObject> sortedTestObjects = new ArrayList<>();

        Type[] typesValues = {Type.TYPE2, Type.TYPE1, Type.TYPE3};

        for (int i = 0; i < Type.values().length; ++i) {
            for (TestObject testObject : testObjects) {
                if (testObject.getType().equals(typesValues[i])) {
                    sortedTestObjects.add(testObject);
                }
            }
        }

        return sortedTestObjects;
    }
}
