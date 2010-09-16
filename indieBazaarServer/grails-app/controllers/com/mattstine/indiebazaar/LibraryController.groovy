package com.mattstine.indiebazaar

class LibraryController {

  def scaffold = Library


  def addAlbum = {
    def customer = Customer.get(params.customerId)
    def album = Album.get(params.albumId)

    customer.library.addToAlbums(album)

    if (customer.library.save()) {
      renderResponse("OK")
    } else {
      renderResponse("ERROR")
    }
  }

  def addSong = {
    def customer = Customer.get(params.customerId)
    def song = Song.get(params.songId)

    customer.library.addToSongs(song)

    if (customer.library.save()) {
      renderResponse("OK")
    } else {
      renderResponse("ERROR")
    }
  }

  private def renderResponse(def code) {
    render(type: "text/json") {
      responseCode: code
    }
  }
}
