package com.artemnizhnyk

class Person {
    Integer id

    Person(final Integer id) {
        this.id = id
    }

    boolean isCase(Object switchValue) {
        println "invoke isCase: " + switchValue
        false
    }
}
