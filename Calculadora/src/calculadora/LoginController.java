/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 02593659203
 */
public class LoginController implements Initializable {

    @FXML
    private TextField usuario;
    @FXML
    private TextField senha;
    @FXML
    private Button btnacessar;
    @FXML
    private Button btCadastrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void acessar(ActionEvent event) throws IOException {
       
                     abrirTela("Calculadora.fxml", "Calculadora", 598, 426);

        
        
    }
 
      private void abrirTela(String caminho, String titulo, int wigth, int height) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(caminho));
        Scene scene = new Scene(fxmlLoader.load(),wigth,height);
        Stage stage = new Stage();
        stage.setTitle(titulo);
        stage.setScene(scene);
        stage.show();  
    } 

    @FXML
    private void cadastrar(ActionEvent event) {
        
        
    }

   
}

    

