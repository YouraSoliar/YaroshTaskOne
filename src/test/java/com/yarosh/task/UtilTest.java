package com.yarosh.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UtilTest {

    @Test
    void RemapObjectType1Name2ShouldReturnObjectType3() {
        TestObject object = new TestObject(Type.TYPE1, Name.NAME2);
        TestObject remappedObject = Util.remap(object);
        Assertions.assertEquals(remappedObject.getType(), Type.TYPE3);
    }

    @Test
    void RemapObjectType2Name2ShouldReturnObjectType1() {
        TestObject object = new TestObject(Type.TYPE2, Name.NAME2);
        TestObject remappedObject = Util.remap(object);
        Assertions.assertEquals(remappedObject.getType(), Type.TYPE1);
    }

    @Test
    void RemapObjectType3Name1ShouldReturnObjectType2() {
        TestObject object = new TestObject(Type.TYPE3, Name.NAME1);
        TestObject remappedObject = Util.remap(object);
        Assertions.assertEquals(remappedObject.getType(), Type.TYPE2);
    }

    @Test
    void RemapObjectType1Name1ShouldReturnObjectType1() {
        TestObject object = new TestObject(Type.TYPE1, Name.NAME1);
        TestObject remappedObject = Util.remap(object);
        Assertions.assertEquals(remappedObject.getType(), Type.TYPE1);
    }

    @Test
    void RemapObjectType3Name3ShouldReturnObjectType3() {
        TestObject object = new TestObject(Type.TYPE3, Name.NAME3);
        TestObject remappedObject = Util.remap(object);
        Assertions.assertEquals(remappedObject.getType(), Type.TYPE3);
    }

    @Test
    void SortArrayOfObjectsShouldReturnArrayWithFirstType2SecondType1ThirdType3() {
        TestObject object1 = new TestObject(Type.TYPE1, Name.NAME3);
        TestObject object2 = new TestObject(Type.TYPE2, Name.NAME3);
        TestObject object3 = new TestObject(Type.TYPE3, Name.NAME3);

        ArrayList<TestObject> objectsArrayList = new ArrayList<>();
        objectsArrayList.add(object1);
        objectsArrayList.add(object2);
        objectsArrayList.add(object3);

        ArrayList<TestObject> sortedObjectsArrayList = new ArrayList<>();
        sortedObjectsArrayList.add(object2);
        sortedObjectsArrayList.add(object1);
        sortedObjectsArrayList.add(object3);

        objectsArrayList = Util.sort(objectsArrayList);

        Assertions.assertEquals(sortedObjectsArrayList, objectsArrayList);
    }
}
