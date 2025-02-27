// Miriam Fix
// A734

public class A734_SelectionSort {
  public static void main(String[] args) {
    int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
    selectionsort(liste);
  }

  public static void print(int[] liste) {
    for (int i = 0; i < liste.length; i++) {
      System.out.print(liste[i] + ", ");
    }
  }

  public static void selectionsort(int[] liste) {
    print(liste);
    System.out.println();
    for (int i = 0; i < liste.length; i++) {
      int min = liste[i], indexMin = i;
      for (int j = i; j < liste.length; j++) {
        if (liste[j] < min) {
          min = liste[j];
          indexMin = j;
        }
      }
      int temp = min;
      liste[indexMin] = liste[i];
      liste[i] = temp;
      print(liste);
      System.out.println("");
    }

  }
}
