package com.example.claculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class Calculator {

    private double equalNumber = 0;
    @FXML
    private TextField countingPlace;
    private int operator = -1;

    @FXML
    void delete() {
        countingPlace.deleteText(0,countingPlace.getText().length());
    }

    @FXML
    void deleteOneNumber() {

        if(countingPlace.getText().length()!=0)
        countingPlace.deleteText(countingPlace.getText().length()-1,countingPlace.getText().length());
//        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
//                "\\src\\main\\java\\programFiles\\AccountHistory", true))
//        {
//            writer.write("");
//            writer.flush();
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
    }

    @FXML
    void dot() {
        if(countingPlace.getText().length() == 0){
            countingPlace.appendText("0.");
        }
        if(countingPlace.getText().indexOf(".") == -1){
        countingPlace.appendText(".");
            try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                    "\\src\\main\\java\\programFiles\\AccountHistory", true))
            {
                writer.append('.');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
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

        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.write(" = " + rez + "\n");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

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
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.write(" - ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void multiply() {
        operator = 3;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.write(" * ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void division() {
        operator = 4;
        if(countingPlace.getText().length() == 0){return;}                             // if coutingPlace clear - return
        equalNumber = Double.parseDouble(countingPlace.getText());
        countingPlace.deleteText(0,countingPlace.getText().length());
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.write(" / ");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number0() {
        if(countingPlace.getText().length() <= 0){
        countingPlace.appendText("0");
            try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                    "\\src\\main\\java\\programFiles\\AccountHistory", true))
            {
                writer.append('0');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    @FXML
    void number1() {
        countingPlace.appendText("1");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('1');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number2() {
        countingPlace.appendText("2");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('2');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number3() {
        countingPlace.appendText("3");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('3');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number4() {
        countingPlace.appendText("4");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('4');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number5() {
        countingPlace.appendText("5");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('5');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number6() {
        countingPlace.appendText("6");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('6');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number7() {
        countingPlace.appendText("7");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('7');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number8() {
        countingPlace.appendText("8");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('8');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void number9() {
        countingPlace.appendText("9");
        try(FileWriter writer = new FileWriter("C:\\Users\\pupok\\IdeaProjects\\Claculator" +
                "\\src\\main\\java\\programFiles\\AccountHistory", true))
        {
            writer.append('9');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void inizialize(){
    }
}
