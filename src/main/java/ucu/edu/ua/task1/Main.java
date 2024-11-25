package ucu.edu.ua.task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //  Student student = Student.Builder();
       // System.out.println("Hello world!");

        Student student = new Student.StudentBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setDob(LocalDate.of(2000, 1, 1))
                .setGrades(Arrays.asList(85, 90, 92))
                .setHeight(180)
                .build();
        System.out.println(student);
    }

}