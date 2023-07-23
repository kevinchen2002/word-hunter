package com.example.client.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class ServerPageController {
    @FXML
    public Label serverIPLabel;

    @FXML
    public ListView<String> playerView;

    private ObservableList<String> playerList = FXCollections.observableList(new ArrayList<>());

    @FXML
    public void initialize(){
        playerView.setItems(playerList);
        for (int i = 0; i < 10000; i++){
            playerList.add("Naoto");
            playerList.add("Kevin");
            playerList.add("Jonathan");
            playerList.add("Lynn");
            playerList.add("Joel");
        }
    }

    public void changeServerIPLabel(int serverIP){
        this.serverIPLabel.setText("" + serverIP);
    }
}