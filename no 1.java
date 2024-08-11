java
class BalexCompany {
   public void calculatePay(double basePay, double hoursWorked) {
      if (hoursWorked > 60) {
         System.out.println("Error: Employee cannot work more than 60 hours in a week.");
         return;
      }
      double overtime = Math.max(0, hoursWorked - 40);
      double regularPay = Math.min(basePay * hoursWorked, 40 * basePay);
      double totalPay = regularPay + overtime * 1.5 * basePay;
      if (totalPay < 8 * hoursWorked) {
         System.out.println("Error: Base pay must not be less than the minimum wage ($8 an hour).");
         return;
      }
      System.out.println("Total pay: $" + String.format("%.2f", totalPay));
   }
}
public class Main {
   public static void main(String[] args) {
      BalexCompany company = new BalexCompany();
      company.calculatePay(7.50, 35);
      company.calculatePay(8.20, 47);
      company.calculatePay(10.00, 73);
   }
}