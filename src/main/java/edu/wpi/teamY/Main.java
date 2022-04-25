package edu.wpi.teamY;

import org.hibernate.service.spi.ServiceException;

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

  public static void run(int xCoord, int yCoord, int windowWidth, int windowLength, String cssPath, String destLocationID, String originLocationID) throws ServiceException {
    App.launch(App.class);
  }
}
