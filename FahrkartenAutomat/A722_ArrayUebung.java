public class A722_ArrayUebung {
  public static void main(String args[]) {

    // 1. Deklaration eines Arrays für ganze Zahlen.
    int wholeNum[];

    // 2. Initialisierung des Arrays mit 100 Elementen.
    wholeNum = new int[100];

    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
    for (int num : wholeNum) {
      System.out.println(num);
    }

    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
    for (int i = 0; i < wholeNum.length; i++) {
      wholeNum[i] = i + 1;
    }

    // 5. Geben Sie den Wert an der 89. Position des Arrays aus.  
    System.out.println(wholeNum[89]);        

    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
    wholeNum[49] = 1060;

    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
    wholeNum[0] = 2023;
    wholeNum[wholeNum.length - 1] = 2023;

    // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
    for (int j = 0; j < wholeNum.length; j++) {
      System.out.printf("Index: %d - Inhalt: %d \n", j, wholeNum[j]);
    }

    // 8. Berechnung des Durchschnitts aller Arrayelemente
    double sum = 0;
    for (int k : wholeNum) {
      sum = sum + k;
    }
    System.out.println(sum);
    System.out.println(sum / wholeNum.length);

  }
}