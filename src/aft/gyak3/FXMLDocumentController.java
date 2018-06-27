/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft.gyak3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 *
 * @author MalusSylvestris
 */
public class FXMLDocumentController implements Initializable, Bemenet {
//Összeg
    int ossz;
    
    
//LABELS
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    
    
//SPINERS    
    @FXML
    private Spinner<Integer> spin1;

    @FXML
    private Spinner<Integer> spin2;

    
    private void initSpinner() {
        spin1.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, a));
        spin2.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, b));
        
        
    }
    public void updateSpinner1Value(Integer newValue) {
         spin1.getValueFactory().setValue(newValue);
        
    }
    public void updateSpinner2Value(Integer newValue) {
         spin2.getValueFactory().setValue(newValue);
    }
//BUTTON ACTIONS
    @FXML
    private void adda(ActionEvent event) {
        System.out.println("You clicked A!");
        
        updateSpinner1Value(a);
        
    }
    @FXML
    private void addb(ActionEvent event) {
        System.out.println("You clicked B!");
    
        updateSpinner2Value(b);


    }
    @FXML
    private void addab(ActionEvent event) {
      
        int first = (Integer) spin1.getValue();
        int second = (Integer) spin2.getValue();
        System.out.println("You clicked ADD!");
        int ossz = (first+second);
        label2.setText(" összeg:"+first+'+'+second+"= "+(ossz));
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {

       initSpinner();
    }    
    
}
