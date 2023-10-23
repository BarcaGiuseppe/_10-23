package Controller;

import View.View;
import model.Person;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    View view;
    String showmenu;
    List<Person> persons;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
        /*List<Person> listpersons = new ArrayList<Person>();
        Person student = new Student("giu","ba",52, 52, 52);
        listpersons.add(student);*/
    }

    public Controller() {
        this.persons = new ArrayList<Person>( 20 );
        this.view = new View();
    }
    public void run() {
        while( !( showmenu = this.view.showMenu()).equals( "exit" ) ) {
            switch (showmenu) {
                case "1":
                    String student = this.view.addStudent();
                    if ( student.equals("exit"))
                        System.exit(0);
                    try{
                        Integer.parseInt(student.split(" ")[2]);
                        Integer.parseInt(student.split(" ")[3]);
                        Integer.parseInt(student.split(" ")[4]);
                        if ( student.split(" ")[0] != null && student.split(" ")[1] != null )
                            addStudent(student);
                        break;
                    }catch (Exception e){
                        view.showError(e);
                        break;
                    }
                case "2":
                    String teacher = this.view.addTeacher();
                    if ( teacher.equals("exit"))
                        System.exit(0);
                    try{
                        Integer.parseInt(teacher.split(" ")[2]);
                        Integer.parseInt(teacher.split(" ")[4]);
                        if ( teacher.split(" ")[0] != null && teacher.split(" ")[1] != null && teacher.split(" ")[3] != null )
                            addTeacher(teacher);
                        break;
                    }catch (Exception e) {
                        view.showError(e);
                        break;
                    }
                case "3":
                    this.view.listPeople( persons );
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
    public void addStudent( String input ){
        Student student = new Student(input.split(" ")[0], input.split(" ")[1], Integer.parseInt(input.split(" ")[2]), Integer.parseInt(input.split(" ")[3]), Integer.parseInt(input.split(" ")[4]));
        persons.add(student);
        System.out.println("Student added");
    }

    public void addTeacher( String input ){
        Teacher teacher = new Teacher(input.split(" ")[0], input.split(" ")[1], Integer.parseInt(input.split(" ")[2]), input.split(" ")[3], Integer.parseInt(input.split(" ")[4]) );
        persons.add(teacher);
        System.out.println("Teacher added");
    }
    public List<Person> getPersons(){
        return this.persons;
    }
    public void setPersons(List<Person> persons){
        this.persons = persons;
    }
}
