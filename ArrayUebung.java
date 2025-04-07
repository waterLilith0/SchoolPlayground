class ArrayUebung {
  public static void main(String[] args) {
    int[] arr1 = new int[1001];
    for(int i = 0; i <= 1000; i++) {
      arr1[i] = i * 5;
    }
  
    for(var x : arr1) {
      System.out.println(x);
    }
  }

void vergleich1(int num1, int num2) {
  if (num1 == num2) {
    System.out.println("Equal");
  } else {
    System.out.println("Unequal");
  }
}

void vergleich2(int[] arr1, int[] arr2) {
  if (arr1.length == arr2.length) {
    boolean equal = true;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) {
        equal = false;
        break;
      }
    }
    if (equal) {
      System.out.println("Equal");
    } else {
      System.out.println("Unequal");
    }
  }
}
}