
    import java.util.*;

    class Person {
        String name;
        int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            // Comparing based on names lexicographically (alphabetical order)
            return p1.getName().compareTo(p2.getName());
        }
    }

    public class Persons {
        public static void main(String[] args) {
            List<Person> people = Arrays.asList(
                    new Person("Alice", 30),
                    new Person("Bob", 25),
                    new Person("Charlie", 35),
                    new Person("Bob", 28)
            );

            // Sorting using the custom name comparator
            Collections.sort(people, new NameComparator());

            System.out.println(people);
        }
    }


