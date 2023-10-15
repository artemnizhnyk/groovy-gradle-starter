package com.artemnizhnyk

class ConditionRunner {
    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   not empty
     * Number/Char      != 0
     * reference        != null
     */
    static void main(String[] args) {
        int x = 10

        boolean booleanResult = x > 0
        if (x) {
            println x
        }

        def person = new Person(16)
        if (person) {
            println person.getId()
        }

        println person?.id
        println"(------------)"
        x = 0
        def result = x ? x : 1//if x != null/0 use - x, else use - 1
        def result2 = x ?: 4
        println result
        println result2

    }
}
