package com.artemnizhnyk.ex.task1

import com.artemnizhnyk.Student

class Task1 {
    static void main(String[] args) {
//        new HashSet<>([1, 2, 3, 4, 4])

        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate

            delegate.metaClass.invokeConstructor(values)
        }
        def hashSet = HashSet.make([1, 2, 3, 4, 4])
        def student = Student.make("Ivan", "Ivanov", 20)
        def student2 = Student.make()

        println hashSet
        println student
        println student2
    }
}
