package org.example;

public class Client {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int day_of_registration;
    private int month_of_registration;
    private int year_of_registration;

    public Client(int id, String name, String surname, int age,
                  int day_of_registration, int month_of_registration, int year_of_registration) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.day_of_registration = day_of_registration;
        this.month_of_registration = month_of_registration;
        this.year_of_registration = year_of_registration;
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

    public int getDay_of_registration() {
        return day_of_registration;
    }

    public void setDay_of_registration(int day_of_registration) {
        this.day_of_registration = day_of_registration;
    }

    public int getMonth_of_registration() {
        return month_of_registration;
    }

    public void setMonth_of_registration(int month_of_registration) {
        this.month_of_registration = month_of_registration;
    }

    public int getYear_of_registration() {
        return year_of_registration;
    }

    public void setYear_of_registration(int year_of_registration) {
        this.year_of_registration = year_of_registration;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", day_of_registration=" + day_of_registration +
                ", month_of_registration=" + month_of_registration +
                ", year_of_registration=" + year_of_registration +
                '}';
    }
}
