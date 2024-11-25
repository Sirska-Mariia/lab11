//package ucu.edu.ua.task1;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Singular;
//import util.list;
//
//@SuperBuilder
//public class Student {
//    public static void main(String[] args) extends Human {
//        Student.student = Student.Builder();
//        private String firstName;
//        private String lastName;
//        @Singular
//
//    }
//
//
//}
//

 
package ucu.edu.ua.task1;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
@Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Singular
    private List<Integer> grades;
    private int height;    
    @Singular("mouse")
    private List<String> mice;
    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.grades = builder.grades;
        this.height = builder.height;
    }
    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private LocalDate dob;
        private List<Integer> grades;
        private int height;

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public StudentBuilder setDob(LocalDate dob) {
            this.dob = dob;
            return this;
        }
        public StudentBuilder setGrades(List<Integer> grades) {
            this.grades = grades;
            return this;
        }
        public StudentBuilder setHeight(int height) {
            this.height = height;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }
}
 
 