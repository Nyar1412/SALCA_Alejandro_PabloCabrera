/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salca_alejandro_pablocabrera;

import java.io.InputStream;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Pablo Cabrera - wifewef23@gmail.com
 */
public class SALCA_Alejandro_PabloCabrera extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        boolean ret = true;
        String [] error = { "" };
        ret = configurar(stage, error);
        if (ret) {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (ret == false) {
            System.out.println(error[0]);
        }
    }

    public boolean configurar(Stage stage, String [] error) {
        boolean ret = true;
        stage.setTitle("SALCA");
        ObservableList<Image> observableList = stage.getIcons();
        // https://icon-icons.com/es/download/24729/PNG/256/
        InputStream inputStream
                = SALCA_Alejandro_PabloCabrera.class.getResourceAsStream(
                "/recursos/icons8-carpeta-26.png");
        Image image = new Image(inputStream);
        observableList.add(image);        
        return ret;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
