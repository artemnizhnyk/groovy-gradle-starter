package com.artemnizhnyk

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
//        String regex = "\\w+ \\d+"
        String regex = /(\w+) (\d+)/

        Pattern pattern = Pattern.compile(regex)
        Matcher matcher = pattern.matcher(value)
        println matcher.findAll()
        println '---------'
        Pattern pattern1 = ~regex
        println '---------'
        Matcher matcher1 = value =~ regex
        println matcher1.findAll()
        println '---------'
        boolean result = value ==~ regex
        println '---------'
        println matcher1[0][0]
        println matcher1[1][2]
        println matcher1[2][1]
    }
}
