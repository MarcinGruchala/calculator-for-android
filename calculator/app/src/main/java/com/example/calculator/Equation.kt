package com.example.calculator

class Equation(var notation: String = "") {

//    val numbers = mutableListOf<Number>()
//    val operation = mutableListOf<Char>()
//
    fun addElement(newElement: String){
        notation += newElement
    }

    fun removeLastElement(){
        notation = notation.dropLast(1)
    }
//
//    fun updateOperations(operation: Char){
//        //operation.add()
//    }
//
//    fun updateNumber(){
//        //numbers.add()
//    }

    fun solve(){
        val equationElements: MutableList<Char> = notation.toMutableList()
        val integerElements: List<Char> = listOf('0','1','2','3','4','5','6','7','8','9')
        val operationElements: List<Char> = listOf('+','-','/','X', '^')
        for (index in equationElements.indices){
            when(equationElements[index]){
                in integerElements-> {}
                in operationElements -> {}
                '(',')' -> {}
                '=' -> {}
            }
        }
    }
}