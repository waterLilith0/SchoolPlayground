// Miriam Fix
// A731

import java.util.Scanner;

public class A731_Suche {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int searchNum = input.nextInt();

    int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
    suche(zahlenArray, searchNum);
       
  }

  static void suche(int[] zahlenArray, int wert) {
    boolean found = false;
    for (int i = 0; i < zahlenArray.length; i++) {
      if(zahlenArray[i] == wert) {
        found = true;
      }
    } 
    if (found) {
      System.out.println("Gefunden");
    } else {
      System.out.println("Nicht Gefunden");
    }
  }
}
