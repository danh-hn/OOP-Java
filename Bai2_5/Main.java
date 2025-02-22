package Bai2_5;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Danh", 'm');
        System.out.println(c1);

        Account a1 = new Account(2511, c1, 20000);
        System.out.println(a1);

        System.out.println("customer name: "+ a1.getCustomerName());
        System.out.println("deposit: "+ a1.deposit(12000));
        System.out.println("withdraw: "+ a1.withdraw(12000));
    }
}