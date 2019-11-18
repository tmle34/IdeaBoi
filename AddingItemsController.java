package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AddingItemsController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private TableView<Items> tableView;
    @FXML
    private TableColumn<Items, String> idColumn;
    private TableColumn<Items, String> nameColumn;
    private TableColumn<Items, String> quantityColumn;
    private TableColumn<Items, String> priceColumn;
    private TableColumn<Items, String> discountColumn;
    private TableColumn<Items, String> typeColumn;

}
