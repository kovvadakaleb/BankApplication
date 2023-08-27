// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          HDFCAccount obj1 = new HDFCAccount("Kaleb","Kaleb@123",2300.0);

          HDFCAccount obj2 = new HDFCAccount("Bujji","Bujji@123",1000.0);
          System.out.println(obj1.fetchbalance("Kaleb@123"));
          System.out.println(obj2.fetchbalance("Bujji@123"));
          System.out.println(obj1.getName());
          System.out.println(obj2.getName());
          System.out.println(obj1.addmoney(2500));
          System.out.println(obj2.addmoney(3000));
          System.out.println(obj1.getAccount());
          System.out.println(obj2.getAccount());
         obj1.setName("pandu");
         obj1.setMybalance(6000);
         System.out.println(obj1);
        }
    }
