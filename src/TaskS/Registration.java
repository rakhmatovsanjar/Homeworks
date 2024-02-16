package TaskS;

import java.util.Scanner;

public class Registration {
    private final Person person;
    private final Scanner scanner;

    public Registration() {
        person = new Person();
        scanner = new Scanner(System.in);
    }

    public void registration() {
        System.out.print("Ismini kiriting: ");
        person.setName(scanner.nextLine());
        System.out.print("Yoshini kiriting: ");
        person.setAge(scanner.nextInt());
        person.setLogin(true);
    }

    public Person getPerson() {
        return person;
    }
}
