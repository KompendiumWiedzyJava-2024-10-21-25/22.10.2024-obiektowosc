public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Client() {

    }

    int sum(int a, int b) {
        System.out.println("Przyszlo a: " + a);
        System.out.println("Przyszlo b: " + b);
        System.out.println("Licze ...");
        //
        //
        //
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    long sum(long a, long b) {
        return a + b;
    }

    void sayName() {
        System.out.println(this.name);
    }
}
