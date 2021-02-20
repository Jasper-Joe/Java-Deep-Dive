import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // sort in reversed order
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        // filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        // all person has age greater than 5
        boolean res = people.stream()
                .allMatch(person -> person.getAge() > 5);

        // max
        people.stream().max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresent(System.out::println);



    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond",20,Gender.MALE),
                new Person("Alina Smith",33,Gender.FEMALE),
                new Person("Helen White",57,Gender.FEMALE),
                new Person("Alex Boz",14,Gender.MALE),
                new Person("Jamie Goa",99,Gender.MALE),
                new Person("Anna Cook",7,Gender.FEMALE),
                new Person("Zelda Brown",120,Gender.FEMALE)
        );
    }
}
