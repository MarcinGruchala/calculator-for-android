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

    fun clear(){
        notation = ""
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

    fun equationSimplify(){
        var simplify = true
        while (simplify){
            var currentOperationIndex = 0
            for (operationIndex in operations.indices){
                if(operations[operationIndex] == 'X' || operations[operationIndex]=='/'){
                    simplify=true
                    currentOperationIndex = operationIndex
                    break
                }
                else{
                    simplify=false
                }
            }

            if(operations[currentOperationIndex] == 'X' || operations[currentOperationIndex]=='/') {
                var tmpOperationResult = 0.0
                when (operations[currentOperationIndex]) {
                    'X' -> tmpOperationResult = numbers[currentOperationIndex] * numbers[currentOperationIndex + 1]
                    '/' -> tmpOperationResult = numbers[currentOperationIndex] / numbers[currentOperationIndex + 1]
                }

                var operationIndexInNotation = 0
                val equationElements: MutableList<Char> = notation.toMutableList()
                for (notationIndex in equationElements.indices) {
                    if (notation[notationIndex] == operations[currentOperationIndex]) {
                        operationIndexInNotation = notationIndex
                        break
                    }
                }

                var leftOperation = 0
                for (i in operationIndexInNotation - 1 downTo 0 step 1) {
                    if (notation[i] in operationElements) {
                        leftOperation = i
                        break
                    }
                }
                var rightOperation = 0
                for (i in operationIndexInNotation + 1 until notation.length) {
                    if (notation[i] in operationElements) {
                        rightOperation = i
                        break
                    }
                }
                if (leftOperation == 0)
                    notation =
                            tmpOperationResult.toString() + notation.subSequence(rightOperation, notation.length).toString()
                else
                    notation = notation.subSequence(0, leftOperation + 1)
                            .toString() + tmpOperationResult.toString() + notation.subSequence(
                            rightOperation,
                            notation.length
                    ).toString()
                decode()
            }
        }
    }

    fun solve(): Number {
        decode()
        equationSimplify()
        decode()
        var operationsResult: Double = numbers[0]
        for (index in operations.indices){
            when(operations[index]){
                '+' -> {
                    operationsResult += numbers[index+1]
                }
                '-' -> {
                    operationsResult -= numbers[index+1]
                }
                '=' -> return  operationsResult
            }
        }
        return operationsResult
    }
}