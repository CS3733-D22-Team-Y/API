package edu.wpi.teamY;

import java.io.IOException;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

  public static Stage primaryStage;

  private static int xCoord;
  private static int yCoord;
  private static int windowWidth;
  private static int windowHeight;
  private static String cssPath;
  private static String destLocationID;
  private static String originLocationID;

  /**
   * Initializes the parameters that specify the properties of the window.
   *
   * @param temp_xCoord The x-coordinate the window will be located at.
   * @param temp_yCoord The y-coordinate the window will be located at.
   * @param temp_windowWidth The desired width of the window. -1 will give the preferred width.
   * @param temp_windowHeight The desired height of the window. -1 will give the preferred height.
   * @param temp_cssPath The path to the CSS file to style the window.
   * @param temp_destLocationID The path the destination location ID (idk what this is).
   * @param temp_originLocationID The path the origin location ID (idk what this is).
   */
  public static void initialize(
      int temp_xCoord,
      int temp_yCoord,
      int temp_windowWidth,
      int temp_windowHeight,
      String temp_cssPath,
      String temp_destLocationID,
      String temp_originLocationID) {
    xCoord = temp_xCoord;
    yCoord = temp_yCoord;
    windowWidth = temp_windowWidth;
    windowHeight = temp_windowHeight;
    cssPath = temp_cssPath;
    destLocationID = temp_destLocationID;
    originLocationID = temp_originLocationID;
  }

  public static String getDestLocationID() {
    return destLocationID;
  }

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

    primaryStage.setX(xCoord);
    primaryStage.setY(yCoord);
    primaryStage.setWidth(windowWidth);
    primaryStage.setHeight(windowHeight);

    FXMLLoader loader =
        new FXMLLoader(Objects.requireNonNull(Main.class.getResource("APITable.fxml")));
    AnchorPane mainScene = loader.load();
    Scene scene = new Scene(mainScene, windowWidth, windowHeight);

    scene
        .getStylesheets()
        .add((Objects.requireNonNull(Main.class.getResource(cssPath))).toExternalForm());
    scene.getStylesheets().add(App.class.getResource(cssPath).toExternalForm());
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
