package edu.wpi.teamY;

import java.io.IOException;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

  public static Stage primaryStage;

  public static double windowX;
  public static double windowY;

  // changes active scene
  public void setScene(Scene scene) {
    primaryStage.setScene(scene);
  }

  private static App instance;

  // Summons instances for scene change implementation
  public static App getInstance() {
    return instance;
  }

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override
  public void start(Stage primaryStage) throws IOException {

    // run(1, 1, 1, 1, "", " ", "");
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("APITable.fxml")));
    Scene scene = new Scene(root);

    primaryStage.setScene(scene);
    primaryStage.show();
  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
  /*
  public static void run(
      int xCoord,
      int yCoord,
      int windowWidth,
      int windowLength,
      String cssPath,
      String destLocationID,
      String originLocationID)
      throws IOException {

    windowX = xCoord;
    windowY = yCoord;
    primaryStage.setMinWidth(windowWidth);
    primaryStage.setMinHeight(windowLength);

    Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("APITable.fxml")));
    Scene scene = new Scene(root);
    // Ddb backend = Ddb.getInstance();
    /*
    FXMLLoader loader =
        new FXMLLoader(Objects.requireNonNull(Main.class.getResource("APITable.fxml")));
    GridPane mainScene = (GridPane) loader.load();
    Scene scene = new Scene((Parent) mainScene, windowWidth, windowLength);

    scene
        .getStylesheets()
        .add(((URL) Objects.<URL>requireNonNull(Main.class.getResource(cssPath))).toExternalForm());
    Stage stage = new Stage();
    scene.getStylesheets().add(App.class.getResource(cssPath).toExternalForm());
    stage.setScene(scene);
    stage.setX(xCoord);
    stage.setY(yCoord);
    stage.setWidth(windowWidth);
    stage.setHeight(windowLength);
    stage.show();


  }
  */
}
