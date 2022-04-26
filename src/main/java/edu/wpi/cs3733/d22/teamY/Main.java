package edu.wpi.cs3733.d22.teamY;

import org.hibernate.service.spi.ServiceException;

public class Main {
  public static void main(String[] args) {
    // CSVRW.loadFromCSV(EntryType.LOCATION);
    // CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    //run(100, 100, 620, 450, "", "destLocationID", "");
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
