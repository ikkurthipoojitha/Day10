package com.bridgelabz.addressbook;

public class Person {
    private String fname;
    private String lname;
    private long phonenumber;

    private String mail;
    private Address address;

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public String toString() {
        return "Person [fname=" + fname + ", lname=" + lname + ", mail = "+ mail +", address="
                + address + "]";
    }

}
