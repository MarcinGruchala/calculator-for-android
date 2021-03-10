package com.example.calculator

class Equation(var notation: String = "") {

    fun addElement(newElement: String){
        notation += newElement
    }

    fun removeLastElement(){
        notation = notation.dropLast(1)
    }
}