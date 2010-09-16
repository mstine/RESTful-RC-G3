package com.mattstine.indiebazaar

class ArtistController {

  def scaffold = Artist

  def browse = {
    def artist = Artist.get(params.id)

    render(contentType: "text/json") {
      albums = array {
        for (album in artist.albums) {
          anAlbum id:album.id, title:album.title
        }
      }
    }
  }
}
