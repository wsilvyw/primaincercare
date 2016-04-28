/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicontrollers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import primaincercare.MyFamilyFamework;

/**
 *
 * @author Admin
 */
public class AutentificareController implements Initializable, ControlledScreen {
    
    @FXML
    ScreensController myController; 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goToHomeScreen(MouseEvent event) {
        myController.setScreen(MyFamilyFamework.MAIN_SCREEN);
    }
    
    @Override
    public void setScreenParent(ScreensController screenParent) {
       myController = screenParent;
    }
    
}
