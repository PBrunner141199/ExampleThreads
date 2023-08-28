package noThreads;



public class Main {
  public static void main(String[] args) {
    BurgerTask cutBuns = new BurgerTask("John", "cuts buns");
    BurgerTask cutIngredients = new BurgerTask("Lucy", "cuts ingredients");
    BurgerTask fryPatties = new BurgerTask("Tyler", "fries Patties");
    //Die Schritte werden nacheinander ausgeführt
    cutBuns.start();
    cutIngredients.start();
    fryPatties.start();

  }

}