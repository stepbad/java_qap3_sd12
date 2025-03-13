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
    }
}
