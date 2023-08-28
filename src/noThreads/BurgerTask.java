package noThreads;

public class BurgerTask {
  private String who;
  private String todo;

  public BurgerTask(String who, String todo) {
    this.who = who;
    this.todo = todo;
  }

  //Hier wird beschrieben, was passiert, wenn eine Aufgabe abläuft (Es werden 3 Burger gemacht)
  public void start() {
    for (int i = 1; i <= 3; i++) {
      System.out.println(who + ": " + todo + " " + i);

    }

  }
}
