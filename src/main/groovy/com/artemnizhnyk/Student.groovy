package com.artemnizhnyk

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

//@ToString
//@TupleConstructor
//@EqualsAndHashCode
@Canonical
//@Immutable
//@Builder
//@Slf4j
class Student implements WithId{
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "select * from Student where $field = $fieldValue"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject
            println owner
            println delegate
            Closure second = {
                println thisObject
                println owner
                println delegate
            }
            second()
        }
        closure
    }
}
