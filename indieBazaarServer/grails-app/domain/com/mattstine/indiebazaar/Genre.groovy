package com.mattstine.indiebazaar

class Genre {

    String name

    static hasMany = [artists:Artist]

    static constraints = {
    }
}
