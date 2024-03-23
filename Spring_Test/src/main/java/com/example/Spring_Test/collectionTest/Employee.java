package com.example.Spring_Test.collectionTest;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Employee {
    private String name;
    private List <String> phone;
    private Set <String> address;
    private Map <String, String> course;

    public String getName() {
        return name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }
}
