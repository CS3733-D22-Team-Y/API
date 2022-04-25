package edu.wpi.teamY;

public class Main {
  public static void main(String[] args) {
    CSVRW.loadFromCSV(EntryType.LOCATION);
    CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    run();
  }

  public static void run() {
    App.launch(App.class);
  }
}
