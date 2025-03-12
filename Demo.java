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
    }
}
