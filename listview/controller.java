package listview;

import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class controller implements Initializable {

    @FXML
    private ListView<String> llist;

    @FXML
    private ListView<String> rlist;

    @FXML
    private Button lbtn;

    @FXML
    private Button rbtn;  

    @FXML
    ObservableList listLeft;
    ObservableList listRight;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listLeft = FXCollections.observableArrayList("Volvo","Toyota","Mazda","Ford","BMW");
        listRight = FXCollections.observableArrayList();
        
        llist.setItems(listLeft);
        rlist.setItems(listRight);
        
        lbtn.setOnAction((ActionEvent event)->{
            if(llist.getSelectionModel().getSelectedItem()!=null) {
                listRight.add(llist.getSelectionModel().getSelectedItem());
                listLeft.remove(llist.getSelectionModel().getSelectedItem());
            }
        });
        
        rbtn.setOnAction((ActionEvent event)->{
            if(rlist.getSelectionModel().getSelectedItem()!=null) {
                listLeft.add(rlist.getSelectionModel().getSelectedItem());
                listRight.remove(rlist.getSelectionModel().getSelectedItem());
            }
        });
    }

}
