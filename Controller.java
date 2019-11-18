package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.lang.String;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private ActionEvent event;

//Add Button Code
    @FXML
    void pressAdd(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/AddButton.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.NONE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Add");
            stage.setScene(new Scene(root1));
            stage.show();
            nonBtnClick(event);

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

// Update Button Code
    @FXML
    void pressUpdate(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/UpdateButton.fxml"));
            Parent root2 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.NONE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Update");
            stage.setScene(new Scene(root2));
            stage.show();
            nonBtnClick(event);

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
// Remove Button Code
    @FXML
    void pressRemove(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/RemoveButton.fxml"));
            Parent root3 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.NONE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Remove");
            stage.setScene(new Scene(root3));
            stage.show();


        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Remove");
    }
// Print Button Code .. idk what she wants this to do we should ask where she wants the output to print out actually.
    @FXML
    void pressPrint(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("/sample/sample.fmxl"));
            Parent root4 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.NONE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Print");
            stage.setScene(new Scene(root4));
            stage.show();
            nonBtnClick(event);

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
// Back Button Code I use it for all new screens to return back to main screen.
    @FXML
    void pressBack(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("sample/sample.fxml"));
            Parent root5 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.NONE);
            stage.initStyle(StageStyle.DECORATED);
            stage.setTitle("Print");
            stage.setScene(new Scene(root5));
            stage.show();
            nonBtnClick(event);

        }
        catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print");
    }
// Code I used to get rid of main screen when you you press button I didnt include this on Remove button bc its a pop-up window.
    @FXML
    private void nonBtnClick(ActionEvent event){
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
// Code for Enter Button when you figure out how to do input and output from text fields into text area.
    @FXML
    private void Btn_Enter(){
        String textArea = "";
        //print output from below textfields somehow here in enter button.

    }



// text field boxes names
    @FXML private TextField Code_S; // Item Code textfield
    @FXML private TextField Name_S; // Item Name textfield
    @FXML private TextField Quant_S; // Item Quantity textfield
    @FXML private TextField Price_S; // Item Price textfield
    @FXML private TextField Disc_S; // Item Discount textfield

    @FXML
    private TableView<Items> tableView;
    @FXML private TableColumn<Items, String> idColumn;
    @FXML private TableColumn<Items, String> nameColumn;
    @FXML private TableColumn<Items, String> quantityColumn;
    @FXML private TableColumn<Items, String> priceColumn;
    @FXML private TableColumn<Items, String> discountColumn;
    @FXML private TableColumn<Items, String> typeColumn;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<Items,String>("FirstName"));

    }

}
