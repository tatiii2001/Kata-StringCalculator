package org.example.com.example.demo

class StringCalculatorKata {
    fun add(numbers: String): Int {
        var result = 0
        if(!numbers.isEmpty()){
            val arrayNumber = numbers.split(",", "\n")
            for (number in arrayNumber){
                val num = number.toInt()
                if(num > 0){
                    result += if(num < 1000) num else 0
                }else{
                    println("Error el numero no puede ser negativo $num")
                    result = 0
                }
            }
        }
        return  result
    }

    fun addDifferentDelimiters(s: String): Int {
        var result = 0
        val matchResult = Regex("//([^\\n])").find(s)
        val delimiter = matchResult?.groups?.get(1)?.value
        val matches = Regex("(?<=\n)(.*)").find(s)?.groups?.get(1)?.value
        if (matches != null) {
            val numbers = matches.split("$delimiter")
            for (number in numbers){
                result += number.toInt()
            }
        }

        return result
    }


}
