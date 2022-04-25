package edu.wpi.teamY;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class NewSceneLoading {
  // Hashmap of scenes, key: path, content: scene
  private static final HashMap<String, Scene> allScenes = new HashMap<>();

  // Function to load scene
  public static void addScene(String path) throws IOException {
    if (!allScenes.containsKey(path)) {
      Parent root = FXMLLoader.load(Objects.requireNonNull(App.class.getResource(path)));
      Scene newScene = new Scene(root);
      allScenes.put(path, newScene);
    }
  }

  public static void removeScene(String path) {
    if (allScenes.containsKey(path)) {
      allScenes.remove(path);
    }
  }

  public static void addMultipleScenes(String... paths) throws IOException {
    for (String currPath : paths) {
      addScene(currPath);
    }
  }

  // Function to reload scene
  public static void reloadScene(String pathToReload) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(App.class.getResource(pathToReload)));
    Scene newScene = new Scene(root);
    allScenes.remove(pathToReload);
    allScenes.put(pathToReload, newScene);
  }

  public static void loadScene(String path) {
    Scene currScene = allScenes.get(path);

    App.getInstance().setScene(currScene);
  }

  public static void loadSidebar(AnchorPane sidebarPane) throws IOException {
    sidebarPane.getChildren().clear();
  }

  private static void addSidebarHelper(Scene currScene) throws IOException {
    if (currScene.lookup("#sidebarPane") != null) {
      AnchorPane mainPane = (AnchorPane) currScene.lookup("#sidebarPane");
    }
  }
}
