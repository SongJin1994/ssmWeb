package com.song.web.model;

/**
 * Created by sj124 on 2016/9/1.
 */
public class User {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "id:"+this.getId()+",name:"+this.getName()+",age:"+this.getAge();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
