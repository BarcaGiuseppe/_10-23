package model;

public class Teacher extends Person{
    protected String classroom;
    protected Integer salary;

    public Teacher(String nome, String cognome, Integer age, String classroom, Integer salary) {
        super(nome, cognome, age);
        this.classroom = classroom;
        this.salary = salary;
    }

    public String getClassroom(){
        return this.classroom;
    }

    public Integer getSalary(){
        return this.salary;
    }

    public void happyBirthday(){
        this.age += 1;
    }

    @Override
    public String toString(){
        return super.toString()+", Classroom: "+this.classroom+", Salary: "+this.salary;
    }
}
