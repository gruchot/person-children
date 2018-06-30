package pl.gru.parent_children.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private AdultOrChild adultOrChild;
    private Set<Person> children = Collections.emptySet();

    public Person(String name, String surname, int age, Sex sex, AdultOrChild adultOrChild) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.adultOrChild = adultOrChild;
        children = new HashSet<>();
    }

    public void addChild(Person child){
        this.children.add(child);
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AdultOrChild getAdultOrChild() {
        return adultOrChild;
    }

    public void setAdultOrChild(AdultOrChild adultOrChild) {
        this.adultOrChild = adultOrChild;
    }

    public Set<Person> getChildren() {
        return children;
    }

    public void setChildren(Set<Person> children) {
        this.children = children;
    }


}
