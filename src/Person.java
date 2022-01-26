import lombok.*;

@Data
public class Person {
    private String name;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    private String lastName;
    private int age;
}
