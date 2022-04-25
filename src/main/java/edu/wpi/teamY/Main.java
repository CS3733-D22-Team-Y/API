package edu.wpi.teamY;

import org.hibernate.service.spi.ServiceException;

public class Main {
  public static void main(String[] args) {
    // CSVRW.loadFromCSV(EntryType.LOCATION);
    // CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    run(0, 0, 600, 400, "", "Bruh Estates", "");
  }

  public static void run(
      int xCoord,
      int yCoord,
      int windowWidth,
      int windowLength,
      String cssPath,
      String destLocationID,
      String originLocationID)
      throws ServiceException {
    CSVRW.loadFromCSV(EntryType.LOCATION);
    CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    App.initialize(
        xCoord, yCoord, windowWidth, windowLength, cssPath, destLocationID, originLocationID);
    App.launch(App.class);
  }
}
