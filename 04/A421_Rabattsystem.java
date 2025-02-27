// Miriam Fix

import java.util.Scanner;

public class A421_Rabattsystem {
  public static void main(String[] args) {
    double orderPrice;
    double discount;
    Scanner input = new Scanner(System.in);

    System.out.println("Bitte geben Sie Ihren Bestellwert ein: ");
    orderPrice = input.nextDouble();

    if(orderPrice > 0 && orderPrice <= 100) {
      discount = 0.1;
    } else if (orderPrice > 100 && orderPrice < 500) {
      discount = 0.15;
    } else {
      discount = 0.2;
    }

    System.out.printf("Der Bestellwert abzüglich Rabatt beträgt %.2f EUR.", orderPrice - (orderPrice * discount));
  }
}
