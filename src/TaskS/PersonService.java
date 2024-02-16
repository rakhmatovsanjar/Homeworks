package TaskS;

import java.util.Scanner;

public class PersonService {

    Scanner scanner = new Scanner(System.in);
    Person person = new Person();
    Registration registration = new Registration();
    AditPerson aditPerson = new AditPerson();

    public void getService() {
        boolean k = true;
        while (k) {
            System.out.print("""
                    1 -> Ro'yxatdan o'tish
                    2 -> Tahrirlash
                    3 -> Foydalanuvchini ekranga chiqarish
                    0 -> chiqish;
                    Tanlang... """);
            switch (scanner.nextInt()) {
                case 1 -> {
                    registration.registration();
                    person=registration.getPerson();
                }
                case 2 -> {
                    if (registration.isLogin()) {
                        aditPerson.editPerson();
                        person=aditPerson.getPerson();
                    } else {
                        System.out.println("Foydalanuvchi ro'yxatdan o'tmagan ");
                    }
                }
                case 3 -> System.out.println(person);
                case 0 -> k = false;
            }
        }
    }
}
