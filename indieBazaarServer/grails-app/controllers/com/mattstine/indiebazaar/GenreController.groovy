package com.mattstine.indiebazaar

class GenreController {

  def scaffold = Genre

  def browse = {
    def genre = Genre.get(params.id)

    render(contentType: "text/json") {
      artists = array {
        for (artist in genre.artists) {
          anArtist id:artist.id, name:artist.name
        }
      }
    }
  }
}
