package com.mattstine.indiebazaar

class Artist {

    String name
    Genre genre

    static hasMany = [albums:Album]

    static constraints = {
    }
}
