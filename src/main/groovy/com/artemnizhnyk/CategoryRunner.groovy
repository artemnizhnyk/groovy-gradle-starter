package com.artemnizhnyk

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentsMethods.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }
    }
}
