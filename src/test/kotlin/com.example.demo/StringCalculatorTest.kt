package com.example.demo

import org.example.com.example.demo.StringCalculatorKata
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringCalculatorTest {

    @Test
    fun addEmptyString() {
        val sum = StringCalculatorKata()
        val result = sum.add("")
        assertEquals(0, result)
    }

    @Test
    fun addOneNumber() {
        val sum = StringCalculatorKata()
        val result = sum.add("2")
        assertEquals(2, result)
    }

    @Test
    fun addTwoNumbers() {
        val sum = StringCalculatorKata()
        val result = sum.add("2,2")
        assertEquals(4, result)
    }

    @Test
    fun addNumberSeparateWithDifferentIcons() {
        val sum = StringCalculatorKata()
        val result = sum.add("5,2\n8")
        assertEquals(15, result)
    }

    @Test
    fun supportDifferentDelimiters() {
        val sum = StringCalculatorKata()
        val result = sum.addDifferentDelimiters("//;\n1;2")
        assertEquals(3, result)
    }

    @Test
    fun addNumbersNegative() {
        val sum = StringCalculatorKata()
        val result = sum.add("-8,-2")
        assertEquals(0, result)
    }

    @Test
    fun addNumbersBiggerThan1000() {
        val sum = StringCalculatorKata()
        val result = sum.add("1002,8")
        assertEquals(8, result)
    }
}