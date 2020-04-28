package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    ImageView image_test;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image test = new Image("/res/test.jpg");
        image_test.setImage(test);
    }
}
