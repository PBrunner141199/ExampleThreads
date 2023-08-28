package threads;

public class Main {
  public static void main(String[] args)  {
    //John, Lucy und Tyler bekommen Aufgaben, zum Herstellen von Burgern zugewiesen
    Thread cutBuns = new Thread(new BurgerThread("John", "cuts buns"));
    Thread cutIngredients = new Thread(new BurgerThread("Lucy", "cuts ingredients"));
    Thread fryPatties = new Thread(new BurgerThread("Tyler", "fries Patties"));

    //John, Lucy und Tyler starten unabhängig mit ihren Aufgaben
    cutBuns.start();
    cutIngredients.start();
    fryPatties.start();
  }

}