public class Student{
    String name;
    String lname;
    int age;
    long id;
    String course = "No course";

    Student(String name, String lname, int age, long id) {
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.id = id;
    }

    void printStudent() {
        System.out.println("Name: " + name + " " + lname);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }

    void enroll(String course){
        this.course = course;
    }
    
    void printCourse(){
        System.out.println("Course: " + course);
    }
    
}