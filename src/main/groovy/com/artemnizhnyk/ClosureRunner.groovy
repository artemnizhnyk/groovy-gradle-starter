package com.artemnizhnyk

import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
        Closure closure = {
            it + it
        }

        Closure closure1 = {->
            println "hello"
        }

        Closure closure2 = { value = 78 ->
            value + value
        }
//        def result = closure.call(5)
        def result = closure(5)
        println "----------"
        Stream.of(1,2,3,4,5)
        .map { closure }
        .map { String.&valueOf }
        .forEach{System.out.&println}
        println "----------"
        println result
        println "----------"
        closure1()
        println "----------"
        int x = 10
        check(x>0) {
            println (++x)
        }

        println x

    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
