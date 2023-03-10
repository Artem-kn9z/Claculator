package com.example.claculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Calculator {

    private int equalNumber;

    @FXML
    private TextField countingPlace;

    @FXML
    private Button delete;

    @FXML
    private Button deleteOneNumber;

    @FXML
    private Button divison;

    @FXML
    private Button dot;

    @FXML
    private Button equals;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button number0;

    @FXML
    private Button number1;

    @FXML
    private Button number2;

    @FXML
    private Button number3;

    @FXML
    private Button number4;

    @FXML
    private Button number5;

    @FXML
    private Button number6;

    @FXML
    private Button number7;

    @FXML
    private Button number8;

    @FXML
    private Button number9;

    @FXML
    private Button plus;

    @FXML
    void delete(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void deleteOneNumber(ActionEvent event) {
        countingPlace.deleteText(countingPlace.getText().length()-1,countingPlace.getText().length());
    }

    @FXML
    void division(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void dot(ActionEvent event) {
        if(countingPlace.getText().indexOf(".") == -1){
        countingPlace.appendText(".");
        }
    }

    @FXML
    void equals(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void minus(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void multiply(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void number0(ActionEvent event) {
        if(countingPlace.getText().length() != 0)// || )
        countingPlace.appendText("0"); ;
    }

    @FXML
    void number1(ActionEvent event) {
        countingPlace.appendText("1"); ;
    }

    @FXML
    void number2(ActionEvent event) {
        countingPlace.appendText("2"); ;
    }

    @FXML
    void number3(ActionEvent event) {
        countingPlace.appendText("3"); ;
    }

    @FXML
    void number4(ActionEvent event) {
        countingPlace.appendText("4"); ;
    }

    @FXML
    void number5(ActionEvent event) {
        countingPlace.appendText("5"); ;

    }

    @FXML
    void number6(ActionEvent event) {
        countingPlace.appendText("6"); ;

    }

    @FXML
    void number7(ActionEvent event) {
        countingPlace.appendText("7"); ;
    }

    @FXML
    void number8(ActionEvent event) {
        countingPlace.appendText("8"); ;
    }

    @FXML
    void number9(ActionEvent event) {
        countingPlace.appendText("9"); ;
    }

    @FXML
    void plus(ActionEvent event) {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    void inizialize(){
        //countingPlace.setAccessibleText("1234567890.");
        // countingPlace.inputMethodRequestsProperty();
    }
}
