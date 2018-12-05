package com.example

class Person {
    String name
    Map prefs = [:]

    static constraints = {
	     name nullable: true, blank: true
       prefs nullable: true, blank: true
    }
}
