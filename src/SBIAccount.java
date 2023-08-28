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
        setPassword(password);
        setBalance(balance);
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
        if (password.length() > 7) {
            this.Password = password;
        }
        else{
            System.out.println("Password should be minimum 8 Characters");
        }
    }
    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        if (balance > -1) {
            this.Balance = balance;
        }
        else{
            System.out.println("Balance should not be negative");
        }
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
        if (amount > 0) {
            this.Balance += amount;
            return "Your amount added -> Your balance is : " + this.Balance;
        }
        else{
            return "Amount not be negative";
        }
    }

    @Override
    public String withdraw(double amount, String Password) {
       if(this.Password.equals(Password)) {
           if (amount > this.Balance) {
               return "InSufficient Funds -> Your balance : " + this.Balance;
           }
           else if (amount < 0) {
               return "Amount not be negative";
           }

               this.Balance -= amount;
               return "Amount Deducted Successfully -> Your balance : " + this.Balance;

       }
       else {
           return "Invalid Password";
       }
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.Password.equals(oldpassword)){
            if(!newpassword.equals(oldpassword)) {
                this.Password = newpassword;
                return "Your Password Updated SuccessFully";
            }
            else{
                return "Your oldpassword and newpassword not be same!!!";
            }
        }
        else{
            return "The Password You Entered Doesn't Match with Oldpassword ";
        }
    }

    @Override
    public String calculateinterest(double year) {
        if(year>0) {
            double totalinterest = (this.Balance * year * Interest) / 100.0;
            return "Your Interet for given years : " + totalinterest;
        }
        else{
            return "year not be negative";
        }
    }
}
