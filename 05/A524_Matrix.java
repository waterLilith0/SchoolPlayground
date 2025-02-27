
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A524_Matrix {
  public static void main(String[] args) {
    // variables
    int num;
    Scanner input = new Scanner(System.in);

    // input
    System.out.println("Bitte geben Sie eine Zahl zwischen 2 und 9 ein: ");
    num = input.nextInt();

    // processing
    for (int i = 0; i <= 99; i++) {
      String test = i + "";
      List<String> currentNum = Arrays.asList(test.split(""));
      if(currentNum.size() > 1) {
        if(Integer.parseInt(currentNum.get(0)) + Integer.parseInt(currentNum.get(1)) == num) {
          System.out.print("* ");
        }
        else if(currentNum.contains(num + "") || i % num == 0) {
          System.out.print("* ");
        } else {
          System.out.print(i + " ");
        }
      } else if(currentNum.contains(num + "") || i % num == 0) {
        System.out.print("* ");
      } else {
        System.out.print(i + " ");
      }
      
      if(currentNum.get(0).contains("9") && currentNum.toArray().length == 1) {
        System.out.println();
      } else if(currentNum.toArray().length > 1) {
        if(currentNum.get(1).contains("9")) {
          System.out.println();
        }
      } 
    }

    // output
  }
}
