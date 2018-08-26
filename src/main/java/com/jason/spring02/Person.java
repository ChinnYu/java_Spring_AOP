package com.jason.spring02;

/**
 * @program: java_Spring_0823
 * @description: 人
 * @author: Liu
 * @create: 2018-08-24
 */
public abstract class Person {
    public String name;
    public Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


