import java.util.UUID;

public class SBIAccount implements BankAccount{

    private String Account;

    private String Name;

    private String Password;

    private double Balance;

    final String IFSC = "SBIN002617";

    final double Interest = 5.5;

    public SBIAccount(String name, String password, double balance) {
        Name = name;
        this.Password = password;
        this.Balance = balance;
        this.Account = String.valueOf(UUID.randomUUID());
    }

    public SBIAccount() {
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public String getIFSC() {
        return IFSC;
    }

    public double getInterest() {
        return Interest;
    }

    @Override
    public String fetchbalance(String Password) {
        if(this.Password.equals(Password)){
            return "Your Current balance is :"+this.Balance;
        }
        else{
            return "Invalid Password";
        }
    }

    @Override
    public String addmoney(double amount) {
         this.Balance += amount;
         return "Your amount added -> Your balance is : "+this.Balance;
    }

    @Override
    public String withdraw(double amount, String Password) {
       if(this.Password.equals(Password)){
           if(amount>this.Balance){
               return "InSufficient Funds -> Your balance : "+this.Balance;
           }
           this.Balance -= amount;
           return "Amount Deducted Successfully -> Your balance : "+this.Balance;
       }
       else {
           return "Invalid Password";
       }
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.Password.equals(oldpassword)){
            this.Password = newpassword;
            return "Your Password Updated SuccessFully";
        }
        else{
            return "The Password You Entered Doesn't Match with Oldpassword ";
        }
    }

    @Override
    public String calculateinterest(double year) {
        double totalinterest  = (this.Balance*year*Interest)/100.0;
        return "Your Interet for 5 years : "+totalinterest;
    }
}
