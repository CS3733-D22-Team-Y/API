package edu.wpi.teamY;

public class Main {
  public static void main(String[] args) {
    CSVRW.loadFromCSV(EntryType.LOCATION);
    CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    App.launch(App.class, args);
  }
}
