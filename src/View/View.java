package View;

import model.Person;

import java.util.List;
import java.util.Scanner;

public class View {
    private String input;
    private String student;
    private String teacher;
    public View() {
    }
    public String showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome"+"\n"+
                "Insert:"+"\n"+
                "1. Add studente"+"\n"+
                "2. Add teacher"+"\n"+
                "3. Show list people"+"\n");
        input = scanner.nextLine();
        //showError(Input);
        //System.out.println(input);
        return input;
    }
    public String addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 1. Insert student:");
        this.student = scanner.nextLine();
        return student;
    }
    public String addTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 2. Insert teacher:");
        this.teacher = scanner.nextLine();
        return teacher;
    }
    public <person> void listPeople(List<Person> persons){

        System.out.println("Select 3 option. List of persons:");
        for(Person person : persons){
            System.out.println(persons.indexOf(person)+")"+person.toString());
        }
        System.out.println("\n");
    }
    public void showError(Exception e){
        System.out.println("Error: "+e);
    }
}
