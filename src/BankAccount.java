public interface BankAccount {

    String fetchbalance(String Password);

    String addmoney(double amount);

    String withdraw(double amount,String Password);

    String changepassword(String oldpassword,String newpasword);
    String calculateinterest(double year);
}
