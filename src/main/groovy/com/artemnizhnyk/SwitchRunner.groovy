package com.artemnizhnyk

class SwitchRunner {

    static void main(String[] args) {
        int x = 12
        switch (x) {                //method isCase
            case String:
                println(0)
                break
            case 5:
                println(1)
                break
            case new Person(29):
                println 5
                break
            case ~/\d+/:
                println(2)
                break
            case {it % 5 == 0}:
                println(3)
                break
            case [1, 3, 5, 9]:
                println(4)
                break
            default:
                println("None")
                break
        }

        if (x in [1, 3, 6, 8, 12]) {      //method isCase
            println x
        }
    }
}
