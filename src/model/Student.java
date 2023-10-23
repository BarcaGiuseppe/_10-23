package model;

public class Student extends Person{

    protected Integer studentID;
    protected Integer gradeLevel;
    public Student(String nome, String cognome, Integer age, Integer studentId, Integer gradeLevel) {
        super(nome, cognome, age);
        this.studentID = studentId;
        this.gradeLevel = gradeLevel;
    }

    public Integer getStudentID(){
        return this.studentID;
    }

    public Integer getGradeLevel(){
        return this.gradeLevel;
    }

    public void happyBirthday(){
        this.age += 1;
    }

    @Override
    public String toString(){
        return super.toString()+", StudentID: "+this.studentID+", GradeLevel: "+this.gradeLevel;
    }
}
