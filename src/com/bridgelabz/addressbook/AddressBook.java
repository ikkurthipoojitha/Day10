package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface {
    Scanner s = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();


    public void operation(ArrayList<Person> arrayRead) {
        list = arrayRead;
        boolean status = true;
        do {
            System.out.println("Choose Operation you want to do");
            System.out.println("1. Add\t2. Edit\t3. delete\t4. Back");
            switch (s.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    status = false;
                    break;
            }
        } while (status);
    }

    public void add() {
        Person person = new Person();
        Address address = new Address();
        System.out.println("Enter the First name:");
        String fname = s.next();
        person.setFname(fname);

        System.out.println("Enter the Last name:");
        String lname = s.next();
        person.setLname(lname);

        System.out.println("Enter the mail:");
        String mail = s.next();
        person.setMail(mail);

        System.out.println("Enter the Phone Number:");
        Long phone = s.nextLong();
        person.setPhonenumber(phone);

        System.out.println("Enter the City:");
        String city = s.next();
        address.setCity(city);

        System.out.println("Enter the Zip:");
        long zip = s.nextLong();
        address.setZip(zip);

        System.out.println("Enter the State:");
        String state = s.next();
        address.setState(state);
        person.setAddress(address);
        list.add(person);

    }

    public void edit() {
        System.out.println("Enter your First name:");
        String fname = s.next();

        Iterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (fname.equals(person.getFname())) {
                Address address = person.getAddress();
                System.out.println("Choose field you want to add:");
                System.out.println("1.Last Name\t2.Phone Number\t3.Mail\t4.City\t5.Zip\t6. State");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.setLname(s.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.setPhonenumber(s.nextLong());
                        break;
                    case 3:
                        System.out.println("Re-Correct your mail");
                        person.setMail(s.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your City");
                        address.setCity(s.next());
                        break;
                    case 5:
                        System.out.println("Re-Correct your Zip");
                        address.setZip(s.nextLong());
                        break;
                    case 6:
                        System.out.println("Re-Correct your State");
                        address.setState(s.next());
                        break;
                }

            }
        }

    }

    public void delete() {
        System.out.println("Enter your First name:");
        String fname = s.next();

        Iterator<Person> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();

            if (fname.equals(person.getFname())) {
                list.remove(person);
            }
        }
    }

    public void sortByLastname() {
        Collections.sort(list, Sort.compareLastName);
    }

    public ArrayList<Person> list() {
        return list;
    }

    public void print() {
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


    public static class Sort {
        static Comparator<Person> compareLastName = new Comparator<Person>() {
            public int compare(Person one, Person two) {
                return one.getLname().compareTo(two.getLname());
            }
        };

    }
}