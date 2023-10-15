package com.artemnizhnyk

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {
        def file = new File(".gitignore")
        println file.text

        file.each { line -> println line }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText

            //write
            def file2 = new File("text.txt")
            file2.text = "Some text"
            file2 << "New line" << System.lineSeparator()
//            file2.withOutputStream {}
            println "---------------------------"
            def srcDir = new File("src")
            srcDir.eachDir {println it}
            println "---------------------------"
            srcDir.eachDirRecurse {println it}
            println "---------------------------"
            srcDir.eachFile(FileType.FILES) {println it}
        }
    }
}
