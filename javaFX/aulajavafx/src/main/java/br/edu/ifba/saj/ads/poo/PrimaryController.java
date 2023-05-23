package br.edu.ifba.saj.ads.poo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    private void btnEntrar() throws IOException {
        App.setRoot("secondary");
    }


    @FXML
    private Button btnEntrar;

    @FXML
    private Label lblCadastrese;

    @FXML
    private Label lblEsqueceuSenha;

    @FXML
    private TextField txtSenha;

    @FXML
    private TextField txtUser;

    @FXML
    void btnEntrar(ActionEvent event){

    }
    }

    
