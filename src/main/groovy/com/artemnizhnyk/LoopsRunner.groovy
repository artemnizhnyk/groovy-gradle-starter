package com.artemnizhnyk

class LoopsRunner {
    static void main(String[] args) {
//        while / for
        def list = [1, 9, 5, 4]

        for (i in 0..<list.size()) {
            println(i)
        }

        println "-------"

        for (Integer value : list) {
            println(value)
        }

        println "-------"

        for (value in list) {
            println(value)
        }

        println "-------"

        0.upto(list.size()) {
            println it
        }

        println "-------"

        list.size().downto(0) {
            println it
        }

        println "-------"

        list.size().times {
            println list.get(it)
        }

        println "-------"

        0.step(5, 1) {
            println it
        }
    }
}
