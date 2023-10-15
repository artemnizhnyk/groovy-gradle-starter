package com.artemnizhnyk
@Category(Student.class)
class DefaultStudentsMethods {

    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
