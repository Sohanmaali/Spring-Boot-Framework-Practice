package com.example.Spring_Test.autoW;

public class Address {
    private String street;
    private String pincode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public Address(String street, String pincode) {
        this.street = street;
        this.pincode = pincode;
    }

    public Address() {
       super();
    }
}
