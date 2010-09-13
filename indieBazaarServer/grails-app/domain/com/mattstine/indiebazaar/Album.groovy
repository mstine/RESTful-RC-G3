package com.mattstine.indiebazaar

class Album {

    Artist artist
    String title

    static hasMany = [songs:Song]

    static constraints = {
    }
}
