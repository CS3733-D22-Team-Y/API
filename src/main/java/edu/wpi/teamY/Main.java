package edu.wpi.teamY;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    CSVRW.loadFromCSV(EntryType.LOCATION);
    CSVRW.loadFromCSV(EntryType.EMPLOYEE);
    // DBManager.save(new SecurityService("0", "0", "0", "0", "0"));
    App.launch(App.class, args);
  }

  public static void run(
      int xCoord,
      int yCoord,
      int windowWidth,
      int windowLength,
      String cssPath,
      String destLocationID,
      String originLocationID)
      throws IOException {
    /*
    Ddb backend = Ddb.getInstance();
    FXMLLoader loader = new FXMLLoader(Main.class.getResource("views/services/InternalTransportation.fxml"));
    GridPane mainScene = (GridPane)loader.load();
    Scene scene = new Scene((Parent)mainScene, windowWidth, windowLength);
    InternalTransportationController controller = (InternalTransportationController)loader.getController();
    controller.setLocationDefault(destLocationID);
    scene
        .getStylesheets()
        .add(((URL)Objects.<URL>requireNonNull(Main.class.getResource(cssPath))).toExternalForm());
    Stage stage = new Stage();
    scene.getStylesheets().add(App.class.getResource(cssPath).toExternalForm());
    stage.setScene(scene);
    stage.setX(xCoord);
    stage.setY(yCoord);
    stage.setWidth(windowWidth);
    stage.setHeight(windowLength);
    stage.show();

     */
  }
}
