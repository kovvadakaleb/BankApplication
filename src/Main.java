import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          Scanner jesus = new Scanner(System.in);
          HDFCAccount obj1 = new HDFCAccount("Kaleb","Kaleb@123",2300.0);

          SBIAccount obj2 = new SBIAccount("Bujji","Bujji@123",1000);
          System.out.println(obj2.getBalance());

          System.out.println(obj2.withdraw(jesus.nextDouble(), jesus.next()));
          System.out.println(obj2.addmoney(1000.0));
          System.out.println(obj2.changepassword("Bujji@123","Bujji@123"));
          System.out.println(obj2.changepassword("Bujji@123","Bujji@453"));
          System.out.println(obj2.calculateinterest(-1));
          System.out.println(obj2.calculateinterest(0.5));

        }
    }
