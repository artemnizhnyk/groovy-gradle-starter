package com.artemnizhnyk

import org.codehaus.groovy.runtime.DefaultGroovyMethods

import java.lang.reflect.Method

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
//        println "Hello"
        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student, student, "Test2")

        println student.metaClass

        student.metaClass.abc = "Test property"
        student.metaClass.test = {
            println "It's a new method"
        }
        student.test()
        student.class.metaClass.newMethod = {
            println "New method in class Student"
        }
        student.newMethod()
        println student.metaClass
    }
}
