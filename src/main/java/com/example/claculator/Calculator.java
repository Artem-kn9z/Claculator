package com.example.claculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.*;

public class Calculator {

    private double equalNumber = 0;
    private  int maxLenght = 9;
    private int operator = -1;
    @FXML
    private TextField countingPlace;

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
