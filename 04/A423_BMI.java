// Miriam Fix

import java.util.Scanner;

public class A423_BMI {
  public static void main(String[] args) {
    double weight;
    double height;
    double bmi;
    String sex;
    String out = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Bitte geben Sie Ihre Körpergröße in cm an: ");
    height = input.nextInt();
    System.out.println("Bitte geben Sie jetzt Ihr Gewicht in kg an: ");
    weight = input.nextInt();
    System.out.println("Als letztes geben Sie bitte Ihr Geschlecht an m/w: ");
    sex = input.next();

    bmi = weight / Math.pow(height / 100, 2);
    if(sex.equals("m")) {
      if(bmi < 20) {
        out = "Untergewicht";
      } else if(bmi >= 20 && bmi < 25) {
        out ="Normalgewicht";
      } else if(bmi >= 25) {
        out ="Übergewicht";
      }
    } else if (sex.equals("w")) {
      if(bmi < 19) {
        out = "Untergewicht";
      } else if(bmi >= 19 && bmi < 24) {
        out ="Normalgewicht";
      } else if(bmi >= 24) {
        out ="Übergewicht";
      }
    } else {
      System.out.println("Please only choose between m and w");
    }

    System.out.println(bmi);
    System.out.println("Sie haben " + out);
    System.out.printf("BMI: %.2f", bmi);
  }
}
