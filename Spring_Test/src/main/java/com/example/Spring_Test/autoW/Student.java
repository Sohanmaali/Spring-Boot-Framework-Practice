package com.example.Spring_Test.autoW;


public class Student {
    private int id ;
    private String name;
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //    private Address address;

//    public Address getAddress() {
//        return address;
//    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public Student(Address address) {
//        this.address = address;
//    }
    public Student() {
       super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
