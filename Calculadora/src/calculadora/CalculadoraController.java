/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;

/**
 * FXML Controller class
 *
 * @author Michele
 */
public class CalculadoraController implements Initializable {
      @FXML
      private TextField n1;
      @FXML
      private TextField n2;
      @FXML
      private Button multi;
      @FXML
      private Button div;
      @FXML
      private Button soma;
      @FXML
      private Button sub;
      @FXML
      private TextField Resultado;
      
      @FXML
    private void multiplicar (ActionEvent e){
         double num1 = Double.parseDouble(n1.getText());
         double num2 = Double.parseDouble(n2.getText());
         
         Resultado.setText(" " + (num1 * num2));
    }
    
     @FXML
    private void divisao (ActionEvent e){
         double num1 = Double.parseDouble(n1.getText());
         double num2 = Double.parseDouble(n2.getText());
       
     Resultado.setText(" " + num1 / num2);
    }
    
    @FXML
    private void somar (ActionEvent e){
         double num1 = Double.parseDouble(n1.getText());
         double num2 = Double.parseDouble(n2.getText());
       
    Resultado.setText(" " + (num1 + num2));
    }
    
     @FXML
    private void subtrair (ActionEvent e){
         double num1 = Double.parseDouble(n1.getText());
         double num2 = Double.parseDouble(n2.getText());
       
     Resultado.setText(" " + (num1 - num2));
    }
    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
