public class Demo {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Noah Seven", 30, "M");
        System.out.println("Initial state: " + person);

        // Update the person's details using setters
        person.setName("Noah Nine");
        person.setAge(31);
        person.setGender("F");

        // Print the updated state
        System.out.println("Updated state: " + person);

         // Create a Student object
         Student student = new Student("David Simms", 20, "M", "S12345", 3.75);
         System.out.println("Initial state: " + student);
 
         // Update the student's details using setters
         student.setIdNum("S54321");
         student.setGPA(3.95);
 
         // Print the updated state
         System.out.println("Updated state: " + student);

          // Create a Teacher object
        Teacher teacher = new Teacher("Sarah Buckle", 40, "F", "Chemistry", 55000.00);
        System.out.println("Initial state: " + teacher);

        // Update the teacher's details using setters
        teacher.setSubject("Physics");
        teacher.setSalary(60000.00);

        // Print the updated state
        System.out.println("Updated state: " + teacher);

        // Create a CollegeStudent object
        CollegeStudent collegeStudent = new CollegeStudent("Alex Turner", 19, "M", "UCB456", 3.8, 2, "Computer Science");
        System.out.println("Initial state: " + collegeStudent);

        // Update the college student's details using setters
        collegeStudent.setYear(3);
        collegeStudent.setMajor("Mathematics");

        // Print the updated state
        System.out.println("Updated state: " + collegeStudent);
    }
}
