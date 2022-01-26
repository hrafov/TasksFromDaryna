import java.util.*;
import java.util.stream.Collectors;
public class HelloWorld {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 41));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        System.out.println(
        personList.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.getName().isEmpty() && !name.getLastName().isEmpty())
                .filter(age -> age.getAge() > 0)
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toCollection(LinkedList::new)).get(0));
    }
}