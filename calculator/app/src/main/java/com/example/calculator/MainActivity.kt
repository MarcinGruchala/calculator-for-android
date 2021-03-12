package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var screen = ""
        var equation = Equation()

        btnZero.setOnClickListener(){
            val clickedSign = "0"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnOne.setOnClickListener() {
            val clickedSign =  "1"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)

        }

        btnTwo.setOnClickListener(){
            val clickedSign =  "2"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnThree.setOnClickListener(){
            val clickedSign =  "3"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnFour.setOnClickListener(){
            val clickedSign =  "4"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnFive.setOnClickListener(){
            val clickedSign =  "5"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnSix.setOnClickListener() {
            val clickedSign =  "6"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnSeven.setOnClickListener(){
            val clickedSign =  "7"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnEight.setOnClickListener(){
            val clickedSign =  "8"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnNine.setOnClickListener(){
            val clickedSign =  "9"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnDot.setOnClickListener(){
            val clickedSign =  "."
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnLeftBracket.setOnClickListener(){
            val clickedSign =  "("
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnRightBracket.setOnClickListener(){
            val clickedSign = ")"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnUndo.setOnClickListener(){
            screen = ""
            equation.clear()
            updateScreen(screen)
        }

        btnPlus.setOnClickListener(){
            val clickedSign =  "+"
            screen += clickedSign
            equation.addElement(clickedSign)

            updateScreen(screen)

        }

        btnMinus.setOnClickListener(){
            val clickedSign =  "-"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)

        }

        btnMultiply.setOnClickListener(){
            val clickedSign =  "X"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)

        }

        btnDivide.setOnClickListener(){
            val clickedSign =  "/"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)

        }

        btnPowerOff.setOnClickListener(){
            val clickedSign =  "^"
            screen += clickedSign
            equation.addElement(clickedSign)
            updateScreen(screen)
        }

        btnEqual.setOnClickListener(){
            val clickedSign =  "="
            equation.addElement(clickedSign)
            equation.decode()
            screen += clickedSign + equation.solve()
            updateScreen(screen)
        }
    }

    private fun updateScreen(screen: String){
        tvLowerScreen.text = screen
    }
}