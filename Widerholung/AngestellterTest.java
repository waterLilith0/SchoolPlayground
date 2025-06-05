public class AngestellterTest
{
//------------Hauptprogramm---------------
public static void main(String[] args)
{
Angestellter ang1 = new Angestellter();
Angestellter ang2 = new Angestellter();
//Setzen der Attribute
ang1.setName("Meier");
ang1.setGehalt(4500);
ang2.setName("Petersen");
ang2.setGehalt(6000);
//Bildschirmausgaben
System.out.println("Name: " + ang1.getName());
System.out.println("Gehalt: " + ang1.getGehalt() + " Euro");
System.out.println("\nName: " + ang2.getName());
System.out.println("Gehalt: " + ang2.getGehalt() + " Euro");
}//main
}//class