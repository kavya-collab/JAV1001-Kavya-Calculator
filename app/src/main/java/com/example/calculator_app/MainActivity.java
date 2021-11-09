package com.example.calculator_app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.lang.Math;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String oldNo = "";
    String op = "+";
    boolean isNewOp = true;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);        //default text in editText area
    }

    @SuppressLint("SetTextI18n")
    public void buttonOneEvent(View view) {
        if (isNewOp)                            /*onClicking button 1  it gets the text from button and then displays on editText and  they are the first item in the stack ,can be pressed again */
           ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "1";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonTwoEvent(View view) {
        if (isNewOp)                          /*onClicking button 2  it gets the text from button and they are the first item in the stack ,then displays on editText and can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "2";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonThreeEvent(View view) {
        if (isNewOp)                              /*onClicking button 3  it gets the text from button and they are the first item in the stack ,then displays on editText and can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "3";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonFourEvent(View view) {
        if (isNewOp)                             /*onClicking button 4 it gets the text from button and then displays on editText and can they are the first item in the stack ,be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "4";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonFiveEvent(View view) {
        if (isNewOp)                           /*onClicking button 5  it gets the text from button and then displays on editText and they are the first item in the stack , can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "5";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonSixEvent(View view) {
        if (isNewOp)                              /*onClicking button 6  it gets the text from button and then displays on editText and they are the first item in the stack , can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "6";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonSevenEvent(View view) {
        if (isNewOp)                               /*onClicking button 7 it gets the text from button and then displays on editText and they are the first item in the stack ,can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "7";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonEightEvent(View view) {
        if (isNewOp)                            /*onClicking button 8 it gets the text from button and then displays on editText and they are the first item in the stack ,can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "8";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonNineEvent(View view) {
        if (isNewOp)                              /*onClicking button 9  it gets the text from button and then displays on editText and they are the first item in the stack ,can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "9";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonZeroEvent(View view) {
        if (isNewOp)                             /*onClicking button 0  it gets the text from button and then displays on editText and they are the first item in the stack ,can be pressed again */
            ed1.setText("");
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += "0";
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonDotEvent(View view) {
        if (isNewOp)
            ed1.setText("");                    /*onClicking button .  it gets the text from button and then displays on editText and they are the first item in the stack ,can be pressed again */
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number += ".";
        view.setEnabled(false);
        ed1.setText(number+"");
    }
    @SuppressLint("SetTextI18n")
    public void buttonPlusMinusEvent(View view) {
        if (isNewOp)
            ed1.setText("");                        // onClicking +/- it makes the positive number to negative number
        isNewOp = false;
        String number = String.valueOf(ed1.getText());
        number = "-" + number;
        ed1.setText(number+"");
    }




    @SuppressLint("SetTextI18n")
    public void additionOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();               // onClicking + is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        char lastChar = oldNo.charAt(oldNo.length()-1);
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "+";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }
    @SuppressLint("SetTextI18n")
    public void differenceOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();               // onClicking - is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        char lastChar = oldNo.charAt(oldNo.length()-1);
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "-";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }
    @SuppressLint("SetTextI18n")
    public void multiplyOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();                // onClicking * is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        char lastChar = oldNo.charAt(oldNo.length()-1);
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "*";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }
    @SuppressLint("SetTextI18n")
    public void divisionOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();               // onClicking / is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        char lastChar = oldNo.charAt(oldNo.length()-1);
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "/";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }
    @SuppressLint("SetTextI18n")
    public void moduloOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();                 // onClicking % is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        char lastChar = oldNo.charAt(oldNo.length()-1);
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "%";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }
    @SuppressLint("SetTextI18n")
    public void exponentOperatorEvent(View view){
        isNewOp = true;
        oldNo = ed1.getText().toString();
        char lastChar = oldNo.charAt(oldNo.length()-1);                // onClicking ^ is displayed and it doesn't allow to pressed more than once and the stack waits for second number
        if (!oldNo.isEmpty() && Character.isDigit(lastChar)){
            op = "^";
            ed1.setText(oldNo + op);
            findViewById(R.id.bDot).setEnabled(true);
        }
    }



    @SuppressLint("SetTextI18n")
    public void equalEvent(View view){
        String newNo = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNo)+ Double.parseDouble(newNo); //This is the case of addition and performs addition operation
                break;
            case "-":
                result = Double.parseDouble(oldNo)- Double.parseDouble(newNo);//This is the case of subtraction and performs subtraction operation
                break;
            case "*":
                result = Double.parseDouble(oldNo)* Double.parseDouble(newNo);//This is the case of multoplication and performs multiplication operation
                break;
            case "/":
                result = Double.parseDouble(oldNo)/ Double.parseDouble(newNo);//This is the case of division and performs division operation
                break;
            case "%":
                result = Double.parseDouble(oldNo)% Double.parseDouble(newNo);//This is the case of  modulo and performs modulo operation
                break;
            case "^":
                result = Math.pow(Double.parseDouble(oldNo), Double.parseDouble(newNo));//This is the case of exponent and performs exponent  operation
                break;
            default:
                break;
        }
        if(result == (int)(result))
            ed1.setText((int)result + ""); // Displaying the result on the editText area if it is between two whole numbers then printing in the form of whole number
        else{
            ed1.setText(String.valueOf(result));// otherwise displaying the rsult in decimal format
        }
    }
    public void acEvent(View view) {
        ed1.setText("0");
        findViewById(R.id.bDot).setEnabled(true);// On clicking the AC it clears the text present in the editText area
        isNewOp = true;
    }



}