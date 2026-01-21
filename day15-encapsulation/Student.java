
/* Encapsulation - Keeping data safe by hiding it and allowing access only through proper methods
It is used in real projects like Bank Applications, E-commerce applications, login systems, API's, Springboot entities etc.
*/



public class Student {

    // Data is hidden
    private String name;
    private int age;
    private int marks;


     // No-argument constructor
    public Student() {
    }

    
    // Setter methods (to set values)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        // Validation logic
        if (age > 0) {
            this.age = age;
        }
    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    // Getter methods (to get values)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }
}
