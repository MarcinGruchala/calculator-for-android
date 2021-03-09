package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var screen = ""
        var numberOne = 0
        var numberTwo = 0
        var operation = ""
        var indexOfOperationButton=0
        var result = 0

        btnZero.setOnClickListener(){
            screen += "0"
            updateScreen(screen)
        }

        btnOne.setOnClickListener() {
            screen += "1"
            updateScreen(screen)

        }

        btnTwo.setOnClickListener(){
            screen += "2"
            updateScreen(screen)
        }

        btnThree.setOnClickListener(){
            screen += "3"
            updateScreen(screen)
        }

        btnFour.setOnClickListener(){
            screen += "4"
            updateScreen(screen)
        }

        btnFive.setOnClickListener(){
            screen += "5"
            updateScreen(screen)
        }

        btnSix.setOnClickListener() {
            screen += "6"
            updateScreen(screen)
        }

        btnSeven.setOnClickListener(){
            screen += "7"
            updateScreen(screen)
        }

        btnEight.setOnClickListener(){
            screen += "8"
            updateScreen(screen)
        }

        btnNine.setOnClickListener(){
            screen += "9"
            updateScreen(screen)
        }

        btnDot.setOnClickListener(){
            screen += "."
            updateScreen(screen)
        }

        btnUndo.setOnClickListener(){
            screen = screen.dropLast(1)
            updateScreen(screen)
        }

        btnPlus.setOnClickListener(){
            screen += "+"
            updateScreen(screen)
            numberOne = screen.subSequence(0,screen.length-1).toString().toInt()
            operation = "+"
            indexOfOperationButton = screen.length-1
        }

        btnMinus.setOnClickListener(){
            screen += "-"
            updateScreen(screen)
            numberOne = screen.subSequence(0,screen.length-1).toString().toInt()
            operation = "-"
            indexOfOperationButton = screen.length-1
        }

        btnMultiply.setOnClickListener(){
            screen += "X"
            updateScreen(screen)
            numberOne = screen.subSequence(0,screen.length-1).toString().toInt()
            operation = "X"
            indexOfOperationButton = screen.length-1
        }

        btnDivide.setOnClickListener(){
            screen += "/"
            updateScreen(screen)
            numberOne = screen.subSequence(0,screen.length-1).toString().toInt()
            operation = "/"
            indexOfOperationButton = screen.length-1
        }

        btnEqual.setOnClickListener(){
            screen += "="
            updateScreen(screen)
            numberTwo = screen.subSequence(indexOfOperationButton+1,screen.length-1).toString().toInt()
            when(operation){
                "+" -> result = numberOne+numberTwo
                "-" ->result = numberOne-numberTwo
                "/" ->result = numberOne/numberTwo
                "*" ->result = numberOne*numberTwo
            }
            screen += result.toString()
            updateScreen(screen)
        }
    }

    private fun updateScreen(screen: String){
        tvResult.text = screen
    }

    private fun updateFirstNumber(){

    }


}