public class Main {
    public static void main(String[] args) {
//        Account bobsAccount = new Account(); //("12345", 0.0, "Bob Brown", "myemail@bob.com", "(087)-123-4567");
////        bobsAccount.setNumber("12345");
////        bobsAccount.setBalance(0.00);
////        bobsAccount.setCustomerName("Bob Brown");
////        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
////        bobsAccount.setCustomerPhoneNumber("(087)-123-4567");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdraw(100.0);
//
        Account timsAccount = new Account("Tim", "tim@email.com", "(123)-456-7890");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance: " + timsAccount.getBalance());
        timsAccount.withdraw(100.55);


//        VipPerson vipPerson = new VipPerson();
//        System.out.println(vipPerson.getName());
//
//        VipPerson vipPerson2 = new VipPerson("Bob", 25000.00);
//        System.out.println(vipPerson2.getName());
//
//        VipPerson vipPerson3 = new VipPerson("Bob", 100.00, "tim@.com");
//        System.out.println(vipPerson3.getName());
//        System.out.println(vipPerson3.getEmailAddress());

    }
}
