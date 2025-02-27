// Miriam Fix
// Zahlen - AB "Übungen zu Arrays"

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    lotto();
  }

  static void zahlen() {
    int array[];
    array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    for (int j = 0; j < array.length; j++) {
      System.out.println(array[j]);
    }
  }

  static void ungeradeZahlen() {
    int array[];
    array = new int[10];
    int j = 1;
    for (int i = 0; i < array.length; i++) {
      array[i] = j;
      j = j + 2;
    }
    for (int k = 0; k < array.length; k++) {
      System.out.println(array[k]);
    }
  }

  static void palindrom() {
    Scanner input = new Scanner(System.in);
    String number = input.next();
    String[] split = number.split("");
    int[] numDivided = new int[split.length];
    for (int i = 0; i < split.length; i++) {
      numDivided[i] = Integer.parseInt(split[i]);
    }
    for (int j = numDivided.length - 1; j >= 0; j--) {
      System.out.print(numDivided[j]);
    }
  }

  static void lotto() {
    int nums[] = { 3, 7, 12, 18, 37, 42 };
    boolean twelve = false, thirteen = false;

    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == 12) {
        twelve = true;
      }
      if(nums[i] == 13) {
        thirteen = true;
      }
    }
    if(twelve) {
      System.out.println("Die Zahl 12 ist in der Ziehung enthalten.");
    } else  {
      System.out.println("Die Zahl 12 ist nicht in der Ziehung enthalten.");
    }
    if(thirteen) {
      System.out.println("Die Zahl 13 ist in der Ziehung enthalten.");
    } else {
      System.out.println("Die Zahl 13 ist nicht in der Ziehung enthalten.");
    }
  }
}
