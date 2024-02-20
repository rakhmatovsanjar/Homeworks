package SOLID.TaskS;

import java.util.Scanner;

public class AditPerson {
    private final Person person;
    private final Scanner scanner;

    public AditPerson() {
        person = new Person();
        scanner = new Scanner(System.in);
    }

    public void editPerson() {
        System.out.print("Yangi ismini kiriting: ");
        person.setName(scanner.nextLine());
        System.out.print("Yangi yoshini kiriting: ");
        person.setAge(scanner.nextInt());
    }

    public Person getPerson() {
        return person;
    }
}
