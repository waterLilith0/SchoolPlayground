public class Operatoren {
  public static void main(String [] args){
    /* 1. Vereinbaren Sie zwei Ganzzahlen.*/
    int num1;
    int num2;

    System.out.println("UEBUNG ZU OPERATOREN IN JAVA\n");
    /* 2. Weisen Sie den Ganzzahlen die Werte 75 und 23 zu
          und geben Sie sie auf dem Bildschirm aus. */
    num1 = 75;
    num2 = 23;
    System.out.println("Num1: " + num1 + " Num2: " + num2);

    /* 3. Addieren Sie die Ganzzahlen
          und geben Sie das Ergebnis auf dem Bildschirm aus. */
    System.out.println("Result: " + (num1 + num2));

    /* 4. Wenden Sie alle anderen arithmetischen Operatoren auf die
          Ganzzahlen an und geben Sie das Ergebnis jeweils auf dem
          Bildschirm aus. */
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);

    /* 5. Ueberprüfen Sie, ob die beiden Ganzzahlen gleich sind
          und geben Sie das Ergebnis auf dem Bildschirm aus. */
    System.out.println(num1 == num2);

    /* 6. Wenden Sie drei anderen Vergleichsoperatoren auf die Ganzzahlen an
          und geben Sie das Ergebnis jeweils auf dem Bildschirm aus. */
    System.out.println(num1 < num2);
    System.out.println(num1 > num2);
    System.out.println(num1 != num2);

    /* 7. Ueberprüfen Sie, ob die beiden Ganzzahlen im  Interval [0;50] liegen
          und geben Sie das Ergebnis auf dem Bildschirm aus. */
    System.out.println((num1 <= 50 && num1 >= 0) && (num2 <= 50 && num2 >= 0));

  }//main
}// Operatoren
