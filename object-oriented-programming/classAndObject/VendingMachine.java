package classAndObject;

public class VendingMachine {

    int price;
    int balance;
    int total;

    void showPrompt(){
        System.out.println("Welcome~");
    }

    void insertMoney(){
        balance = balance + 100;
    }

    void showBalance(){
        System.out.println(balance);
    }

    void getFood(){
        if (balance >= price) {
            System.out.println("Here you go.");
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney();
        vm.getFood();
        vm.showBalance();
    }

}
