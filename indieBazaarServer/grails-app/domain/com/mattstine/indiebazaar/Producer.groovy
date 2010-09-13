package com.mattstine.indiebazaar

class Producer {

    String username
    String password
    String email

    static hasMany = [artists:Artist]

    static constraints = {
    }
}
