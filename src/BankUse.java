package EasyBank.src;

public class BankUse {
    public static void main(String[] args) {
        
        Account a1 = new Account("123456", 0.0, "Raj", "raj@xyz.com", "789456123");
    
        Account a2 = new Account("852369", 500.0, "Mac", "mac@xyz.com", "564789123");
    
        a1.depositMoney(100);
        a1.depositMoney(1000);
        
        a1.withdrawMoney(500);

        a2.withdrawMoney(500);
    }
}
