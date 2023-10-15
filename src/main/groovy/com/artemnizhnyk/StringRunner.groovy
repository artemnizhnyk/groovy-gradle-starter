package com.artemnizhnyk

def name = "Artem"
def value = 'Hello'

def stringValue = "Hello $value $name"

println "$name $value joj"

char charValue = 'H'

int a = 5

println "Kekea ${getWithPrefix(name)}"

def getWithPrefix(String name) {
    "prefix-" + name
}

println name[2]
println name[-1]
println name[0..3]
println name * 3
println name - 'Ar'
println name - 'tem'