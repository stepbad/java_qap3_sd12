public class Student extends Person {
    // Additional instance variables for Student
    protected String myIdNum; // Student ID Number
    protected double myGPA;   // Grade Point Average

    // Constructor for Student
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // Use the Person superclass constructor
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter for ID number
    public String getIdNum() {
        return myIdNum;
    }

    // Setter for ID number
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // Getter for GPA
    public double getGPA() {
        return myGPA;
    }

    // Setter for GPA
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // Override toString() to include Student-specific details
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
