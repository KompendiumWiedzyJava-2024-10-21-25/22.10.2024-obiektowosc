import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client[] clients = new Client[1000];

        Client c1 = new Client();
        int i = 5;
        Client c2 = new Client();

        Client c3 = c2;


        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 33;
        c1.pesel = 123123123;

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c1.age);
        System.out.println(c1.pesel);

        c2.name = "Wiesiek";
        c2.surname = "Malinowski";
        c2.age = 44;
        c2.pesel = 234234234;

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.pesel);

        System.out.println(c3.name);
        System.out.println(c3.surname);
        System.out.println(c3.age);
        System.out.println(c3.pesel);

        c2.name = "Zbyszek";

        System.out.println(c2.name);
        System.out.println(c3.name);

        Address address = new Address();
        address.city = "Krakow";
        address.street = "Ogrodowa";
        address.no = "33A";

        c1.address = address;

        int toCoWyliczylKlient = c1.sum(5,7);
        System.out.println(toCoWyliczylKlient);
        System.out.println(c2.sum(10, 14));

        c1.sayName();
        c2.sayName();

        Client c4 = new Client();
        c4.name = "Karol";
        c4.sayName();

        System.out.println(c4.sum(3.3, 4.4));
        System.out.println(c4.sum(123123123123L, 123123123123L));

        System.out.println();

        Random random = new Random();

        int losowa = random.nextInt(1, 1001);

        Client c5 = new Client("Bogdan", "Jakis", 33,123123L);
        System.out.println(c5.name);
        System.out.println(c5.surname);
        System.out.println(c5.age);
        System.out.println(c5.pesel);
        System.out.println(c5);
    }
}