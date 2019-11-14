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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PrimaryController implements Initializable {
    
    @FXML
    private Label lblLastnameTxt;
    @FXML
    private Label lblError;
    @FXML
    private Label lblFirstName;
    @FXML
    private Label lblLastName;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblPhone;
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

    private ObservableList<Contact> contacts;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblError.setText("");
        contacts = FXCollections.observableArrayList();
        lvContacts.setItems(contacts);
        lvContacts.getSelectionModel().selectedItemProperty().addListener(e -> {
            Contact review = lvContacts.getSelectionModel().getSelectedItem();
            if(review == null)
            {
                return;
            }
            lblFirstName.setText(review.firstname);
            lblLastName.setText(review.lastname);
            lblEmail.setText(review.email);
            lblPhone.setText(review.phone);
            txtFirstName.setText(review.firstname);
            txtLastName.setText(review.lastname);
            txtEmail.setText(review.email);
            txtPhone.setText(review.phone);
        });
    }

    public void setEmpty() {
        txtEmail.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhone.setText("");
    }
    

    @FXML
    private void handleAddContactEventAction(ActionEvent event) {
        if (txtLastName.getText().equals("")) {
            lblError.setTextFill(Color.FIREBRICK);
            lblLastnameTxt.setTextFill(Color.FIREBRICK);
            lblError.setText("Sorry, you need to type in a Lastname.");
            
            setEmpty();
        } else {
            String firstName = txtFirstName.getText();
            String lastName = txtLastName.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            Contact c1 = new Contact(firstName, lastName, email, phone);
            contacts.add(c1);
            setEmpty(); 
        }
    }

    @FXML
    private void handleRemoveContact(ActionEvent event) {
        Contact selectedContact = lvContacts.getSelectionModel().getSelectedItem();
        contacts.remove(selectedContact);
    }

    @FXML
    private void handleUpdateContact(ActionEvent event) {
        Contact selected = lvContacts.getSelectionModel().getSelectedItem();
        Contact updated = new Contact(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), txtPhone.getText());

        //Contact temp = selected;
        //tempC.setFirstname(txtFirstName.getText());
        //selected.setLastname(txtLastName.getText());
        //selected.setEmail(txtEmail.getText());
        //selected.setPhone(txtPhone.getText());
        contacts.add(updated);
        contacts.remove(selected);

    }

}
