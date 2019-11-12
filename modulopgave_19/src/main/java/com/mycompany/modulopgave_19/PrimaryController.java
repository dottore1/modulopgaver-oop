package com.mycompany.modulopgave_19;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPhone;

    @FXML
    private Button btnAddContact;

    @FXML
    private Button btnDeleteContact;

    @FXML
    private ListView<Contact> lvContacts;

    ObservableList<Contact> contacts;
    
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        contacts = FXCollections.observableArrayList();
        lvContacts.setItems(contacts);
    }

    @FXML
    private void handleAddContactEventAction(ActionEvent event) {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        Contact c1 = new Contact(firstName, lastName, email, phone);
        contacts.add(c1);
    }

    @FXML
    private void handleRemoveContact(ActionEvent event) {
        Contact selectedContact = lvContacts.getSelectionModel().getSelectedItem();
        contacts.remove(selectedContact);
    }

 
}
