package model;

public class Person {

    protected String firstName;
    protected String lastName;
    protected Integer age;

    public Person(String nome, String cognome, Integer age) {
        this.firstName = nome;
        this.lastName = cognome;
        this.age = age;
    }

    public String getFirstName (){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Integer getAge(){
        return this.age;
    }

    public void happyBirthday(){
        this.age+=1;
    }

    @Override
    public String toString(){
        return "FirstName: "+this.firstName+", LastName: "+this.lastName+", Age: "+this.age;
    }
}
