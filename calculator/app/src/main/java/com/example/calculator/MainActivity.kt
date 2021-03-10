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

        btnLeftBracket.setOnClickListener(){
            screen += "("
            updateScreen(screen)
        }

        btnRightBracket.setOnClickListener(){
            screen +=")"
            updateScreen(screen)
        }

        btnUndo.setOnClickListener(){
            screen = screen.dropLast(1)
            updateScreen(screen)
        }

        btnPlus.setOnClickListener(){
            screen += "+"
            updateScreen(screen)

        }

        btnMinus.setOnClickListener(){
            screen += "-"
            updateScreen(screen)

        }

        btnMultiply.setOnClickListener(){
            screen += "X"
            updateScreen(screen)

        }

        btnDivide.setOnClickListener(){
            screen += "/"
            updateScreen(screen)

        }

        btnPowerOff.setOnClickListener(){
            screen += "^"
            updateScreen(screen)
        }

        btnEqual.setOnClickListener(){
            screen += "="
            updateScreen(screen)

        }
    }

    private fun updateScreen(screen: String){
        tvResult.text = screen
    }
}