package com.artemnizhnyk

class MissingMethodRunner {
    static void main(String[] args) {
        def student = new Student(age: 18)
//        student.test()
        println student.abc

        def map = ["1":11, "2":22, "abc":34]
        println map."1"
        println map."abc"

        student.findByAge(90)

    }
}
