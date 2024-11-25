package ucu.edu.ua.task2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString @AllArgsConstructor
public class Client {

    private static int counter = 0;
    private int id = counter ++;
    private String name;
    private int age;
    private LocalDate dob;
    private String gender;
    public Client(String name, int age, LocalDate dob, String gender) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
    }
    public Object getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
    

}
