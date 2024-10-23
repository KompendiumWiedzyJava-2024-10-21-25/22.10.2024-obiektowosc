public class Eksperyment {
    public static void main(String[] args) {
        int[] tab1 = new int[5];

        System.out.println(tab1[0]);
        System.out.println(tab1[1]);
        System.out.println(tab1[2]);
        System.out.println(tab1[3]);
        System.out.println(tab1[4]);

        Client[] clients = new Client[5];

        System.out.println(clients[0]);
        System.out.println(clients[1]);
        System.out.println(clients[2]);
        System.out.println(clients[3]);
        System.out.println(clients[4]);

        Client c = new Client();
        System.out.println(c.name);
        System.out.println(c.age);

        String s = "ABCD";
        System.out.println(s.length());
        //System.out.println(c.name.length());
    }
}
