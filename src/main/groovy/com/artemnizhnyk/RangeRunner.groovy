package com.artemnizhnyk

class RangeRunner {
    static void main(String[] args) {

        def range = 2..<8
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each {
            println it
        }

        ('a'..'d').each {System.out.&println}

        (WeekDay.MO..WeekDay.FR).each {println it}
    }
}
