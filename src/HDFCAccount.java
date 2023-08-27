import java.util.UUID;

public class HDFCAccount implements BankAccount{

    private String Account;

    private String Name;

    private String MyPassword;

    @Override
    public String toString() {
        return "HDFC{" +
                "Account='" + Account + '\'' +
                ", Name='" + Name + '\'' +
                ", MyPassword='" + MyPassword + '\'' +
                ", Mybalance=" + Mybalance +
                ", Interest=" + Interest +
                ", IFSCCODE='" + IFSCCODE + '\'' +
                '}';
    }

    private double Mybalance;
    final double Interest = 7;

    final String IFSCCODE = "HDFC0002456";





    public HDFCAccount(String name, String myPassword, double mybalance) {
        Name = name;
        this.MyPassword = myPassword;
        this.Mybalance = mybalance;
        this.Account = String.valueOf(UUID.randomUUID());
    }

    public String getAccount() {
        return this.Account;
    }

    public void setAccount(String account) {
        this.Account = account;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getMyPassword() {
        return this.MyPassword;
    }

    public void setMyPassword(String myPassword) {
        this.MyPassword = myPassword;
    }

    public double getMybalance() {
        return this.Mybalance;
    }

    public void setMybalance(double mybalance) {
        this.Mybalance = mybalance;
    }

    public double getInterest() {
        return Interest;
    }

    public String getIFSCCODE() {
        return IFSCCODE;
    }

    @Override
    public String fetchbalance(String Password) {
        if(this.MyPassword.equals(Password)){
            return "Your Balance : "+this.Mybalance;
        }
        else{
            return "Invalid Password";
        }
    }

    @Override
    public String addmoney(double amount) {
        this.Mybalance += amount;
        return "Amount Added Successfully -> Your Balance : "+this.Mybalance;

    }

    @Override
    public String withdraw(double amount, String Password) {
        if(this.MyPassword.equals(Password)){
            if(amount>this.Mybalance){
                return "Insufficient Funds -> Your Balance : "+this.Mybalance;
            }

                this.Mybalance -= amount;
                return "Your amount Deducted Successfully -> Your Balance : "+this.Mybalance;

        }
        else{
           return "Invalid Password";
        }
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
       if(this.MyPassword.equals(oldpassword)){
           this.MyPassword = newpassword;
           return "Password Updated Successfully";
       }
       else{
           return "Invalid oldpassword";
       }
    }

    @Override
    public String calculateinterest(double year) {
       double totalinterest = (this.Mybalance*year*Interest)/100.0;
       return "Your Interest For 4 years : "+totalinterest;
    }
}
