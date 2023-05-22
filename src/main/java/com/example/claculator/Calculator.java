package com.example.claculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

import java.io.*;

public class Calculator {

    private double equalNumber = 0;
    private  int maxLenght = 9;
    private int operator = -1;

    @FXML
    private CheckBox BlackWhite;

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

    private void changeBackgroundColor(){
        countingPlace.setStyle("-fx-background-color: #FFFFFF;");
        delete.setStyle("-fx-background-color: #FFFFFF;");
        deleteOneNumber.setStyle("-fx-background-color: #FFFFFF;");
        plus.setStyle("-fx-background-color: #FFFFFF;");
        minus.setStyle("-fx-background-color: #FFFFFF;");
        divison.setStyle("-fx-background-color: #FFFFFF;");
        equals.setStyle("-fx-background-color: #FFFFFF;");
        multiply.setStyle("-fx-background-color: #FFFFFF;");
        dot.setStyle("-fx-background-color: #FFFFFF;");
        number1.setStyle("-fx-background-color: #FFFFFF;");
        number2.setStyle("-fx-background-color: #FFFFFF;");
        number3.setStyle("-fx-background-color: #FFFFFF;");
        number4.setStyle("-fx-background-color: #FFFFFF;");
        number5.setStyle("-fx-background-color: #FFFFFF;");
        number6.setStyle("-fx-background-color: #FFFFFF;");
        number7.setStyle("-fx-background-color: #FFFFFF;");
        number8.setStyle("-fx-background-color: #FFFFFF;");
        number9.setStyle("-fx-background-color: #FFFFFF;");
        number0.setStyle("-fx-background-color: #FFFFFF;");
    }

    @FXML
    void BlackWhite() {
        if(plus.getStyle() != "-fx-background-color: #FFFFFF;"){
            changeBackgroundColor();
        }else return;
    }

    @FXML
    void delete() {                                                                                  //Delete all number
        countingPlace.deleteText(0,countingPlace.getText().length());

    }

    @FXML
    void deleteOneNumber() {                                                        //Delete one character from a number
        if(countingPlace.getText().length()==0){return;}
        countingPlace.deleteText(countingPlace.getText().length()-1,countingPlace.getText().length());
    }

    @FXML
    void dot() {
        if(countingPlace.getText().length() == 0){
            countingPlace.appendText("0.");
        }
        if(countingPlace.getText().indexOf(".") == -1){
        countingPlace.appendText(".");
        }
    }

    @FXML
    void equals() {
        if(countingPlace.getText().length() == 0){                                     // if coutingPlace clear - return
            countingPlace.setText(String.valueOf(equalNumber));
            return;
        }
        double rez = 0;
        switch (operator){
            case 1:             //plus
                    rez = equalNumber + Double.parseDouble(countingPlace.getText());
                break;
            case 2:             //minus
                    rez = equalNumber - Double.parseDouble(countingPlace.getText());
                break;
            case 3:             //multiply
                    rez = equalNumber * Double.parseDouble(countingPlace.getText());
                break;
            case 4:             //division
                    rez = equalNumber / Double.parseDouble(countingPlace.getText());
                break;
            default:
                 return;
        }
        //countingPlace.deleteText(0,countingPlace.getText().length());
        countingPlace.setText(String.valueOf(rez));
        operator = -1;
    }

////////////////////////////////////////initialization of math expression///////////////////////////////////////////////

    @FXML
    void plus() {
        operator = 1;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void minus() {
        operator = 2;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void multiply() {
        operator = 3;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void division() {
        operator = 4;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    ////////////////////////////////////////////////number initialization///////////////////////////////////////////////

    @FXML
    void number0() {
        if(countingPlace.getText().length() <= 0 || countingPlace.getText().length() <= maxLenght){
        countingPlace.appendText("0");
        }
    }

    @FXML
    void number1() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("1");
    }

    @FXML
    void number2() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("2");
    }

    @FXML
    void number3() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("3");
    }

    @FXML
    void number4() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("4");
    }

    @FXML
    void number5() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("5");
    }

    @FXML
    void number6() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("6");
    }

    @FXML
    void number7() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("7");
    }

    @FXML
    void number8() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("8");
    }

    @FXML
    void number9() {
        if(countingPlace.getText().length() > maxLenght){return;}
        countingPlace.appendText("9");
    }
    public void inizialize(){

    }
}
