// Student.java
public class Student {
    String fname;
    String lname;
    long id;
    long enrolledCourse; // Assume we are taking only one course!
  
    Student(String fname, String lname, long id) {
      this.fname = fname;
      this.lname = lname;
      this.id = id;
    }
  
    void enroll(long enrolledCourse) {
      this.enrolledCourse = enrolledCourse;
    }
  
    void displayEnrolledCourse() {
      System.out.println(enrolledCourse); 
    }
  }