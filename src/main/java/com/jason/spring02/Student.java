package com.jason.spring02;

/**
 * @program: java_Spring_0823
 * @description: 學生
 * @author: Liu
 * @create: 2018-08-24
 */
public class Student extends Person{
    /**
        * 身高
        */
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public Student(String name,int height,Address address) {
        this.name = name;
        this.height = height;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                ", name='" + name + '\'' +address+
                '}';
    }

    public void init(){
        System.out.println("物件創建");
    }
    public void  over(){
        System.out.println("物件回收");
    }
}
