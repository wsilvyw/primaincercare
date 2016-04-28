/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primaincercare;

import guicontrollers.ScreensController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class MyFamilyFamework extends Application {

    public static final String MAIN_SCREEN = "HomePage";
    public static final String MAIN_SCREEN_FXML = "/gui/HomePage.fxml";
    public static final String AUTENTIFICARE_SCREEN = "Autentificare";
    public static final String AUTENTIFICARE_SCREEN_FXML
            = "/gui/Autentificare.fxml";
    public static final String LOADINGSINGIN_SCREEN = "LoadingSingIn";
    public static final String LOADINGSINGIN_SCREEN_FXML
            = "/gui/LoadingSingIn.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {

        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(MyFamilyFamework.MAIN_SCREEN,
                MyFamilyFamework.MAIN_SCREEN_FXML);
        mainContainer.loadScreen(MyFamilyFamework.AUTENTIFICARE_SCREEN,
                MyFamilyFamework.AUTENTIFICARE_SCREEN_FXML);
        mainContainer.loadScreen(MyFamilyFamework.LOADINGSINGIN_SCREEN,
                MyFamilyFamework.LOADINGSINGIN_SCREEN_FXML);

        mainContainer.setScreen(MyFamilyFamework.AUTENTIFICARE_SCREEN);

        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root, 400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
