public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 20, 660615001);
        student1.printStudent();
        student1.enroll("Computer Science");
        
        student1.printCourse();
    }
}
