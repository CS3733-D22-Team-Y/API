package edu.wpi.cs3733.d22.teamY.api;

import org.hibernate.service.spi.ServiceException;

public class API {
  public static void main(String[] args) {
    // CSVRW.loadFromCSV(EntryType.LOCATION);
    // CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    if (args.length < 2) {
      run(100, 100, 620, 450, "", "destLocationID", "");
    } else {
      run(
          Integer.parseInt(args[0]),
          Integer.parseInt(args[1]),
          Integer.parseInt(args[2]),
          Integer.parseInt(args[3]),
          args[4],
          args[5],
          args[6]);
    }
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
