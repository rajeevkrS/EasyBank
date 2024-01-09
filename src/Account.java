package EasyBank.src;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    // Constructor
    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    // Deposite Money Method
    public void depositMoney(double DepositedMoney){
        this.Balance += DepositedMoney;
        System.out.println("Deposite Is Successful!, New Balance is Rs."+ this.Balance);
    }

    // Withdraw Money Method
    public void withdrawMoney(double WithDrawalMoney){
        // If the withdrawal amount is greater than its balance
        if (this.Balance - WithDrawalMoney < 0) {
            System.out.println("Withdraw Unsuccessful! only Rs."+ this.Balance +" is left.");            
        }
        else{
            this.Balance -= WithDrawalMoney;
            System.out.println("Withdraw Successful! Current Balance is Rs."+ this.Balance);
        }
    }


    // -----Getters & Setters------
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

}
