import java.util.HashSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // A simple custom hash code implementation based on name and age
        int result = 17; // Start with a prime number
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // Custom equals method to define object equality based on name and age
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        // Create two Person objects with the same attributes
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        // Check if the objects are equal
        boolean areEqual = person1.equals(person2);

        // Print the result of equals comparison
        System.out.println("Are person1 and person2 equal? " + areEqual);

        // Create a HashSet to store Person objects
        HashSet<Person> personSet = new HashSet<>();

        // Add both person1 and person2 to the set
        personSet.add(person1);
        personSet.add(person2);

        // Print the size of the HashSet
        System.out.println("HashSet size: " + personSet.size());

        // Since person1 and person2 are equal, HashSet will store only one of them due to hashCode and equals
    }
}
