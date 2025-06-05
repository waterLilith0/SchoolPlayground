class PersonTest {
  public static void main(String[] args) {
    Person testPerson = new Person();
    testPerson.setName("Max");
    
    testPerson.setName("Anna");
    System.out.println(testPerson.getName());

    testPerson.setAlter(12);
    System.out.println(testPerson.getAlter());

    Person testPerson2 = new Person("Max", 12);
    System.out.println(testPerson2.getName());
    System.out.println(testPerson2.getAlter());
  }
}