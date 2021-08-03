package day37_CustomClasses;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public String size;
    public String gender;
    public String color;

    public void eat(String food){
        System.out.println(name+ " is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public void setInfo(String dogName, String dogBreed, String dogGender, String dogColor, String dogSize, int dogAge){
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        color = dogColor;
        size = dogSize;
        age = dogAge;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("gender = " + gender);
        System.out.println("color = " + color);
        System.out.println("size = " + size);
        System.out.println("age = " + age);
    }

}
