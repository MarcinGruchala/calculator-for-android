package com.example.calculator

class Equation(var notation: String = "") {

    //private val integerElements: List<Char> = listOf('0','1','2','3','4','5','6','7','8','9')
    private val operationElements: List<Char> = listOf('+','-','/','X', '^','=')
    val numbers = mutableListOf<Double>()
    val operations = mutableListOf<Char>()

    fun addElement(newElement: String){
        notation += newElement
    }

    fun removeLastElement(){
        notation = notation.dropLast(1)
    }


    fun decode(){
        numbers.clear()
        operations.clear()
        val equationElements: MutableList<Char> = notation.toMutableList()
        var numberStart = 0 // current number beginning index
        var numberEnd = 0 // current Operation Index
        var currentNumber = 0.0
        for (index in equationElements.indices){
            when(equationElements[index]){
                in operationElements -> {
                    numberEnd = index
                    numbers.add(notation.subSequence(numberStart,numberEnd).toString().toDouble())
                    operations.add(notation[index])
                    numberStart = numberEnd + 1
                }
            }
        }
    }

    fun solve(): Number {
        var operationsResult: Double = numbers[0]
        for (index in operations.indices){
            when(operations[index]){
                '+' -> {
                    operationsResult += numbers[index+1]
                }
                '-' -> {
                    operationsResult -= numbers[index+1]
                }
                'X' ->{

                }
                '/' ->{

                }
                '=' -> return  operationsResult
            }
        }
        return operationsResult
    }
}