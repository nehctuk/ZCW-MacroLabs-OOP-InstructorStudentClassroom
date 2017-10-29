package io.zipcoder.interfaces;

public class Person {
    final long id;
    String name;

    public Person(long id) {
        this.id = id;
    }
    public Person(String name, long id) {
        this(id);
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

