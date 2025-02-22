package Bai2_1;

public class Main {
    public static void main(String[] args) {
        Author ahTeck =  new Author("Tan Ah Tek ", "ahteck@nowhere.com ", 'm');
        System.out.println(ahTeck);

        Book book1 = new Book(" Java for Teck ", ahTeck, 99);
        System.out.println(book1);
    }
}
