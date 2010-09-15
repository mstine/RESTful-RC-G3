package com.mattstine.indiebazaar

class AlbumController {

  def scaffold = Album

  def browse = {
    def album = Album.get(params.id)

    render(contentType: "text/json") {
      songs = array {
        for (song in album.songs) {
          aSong id:song.id, title:song.title
        }
      }
    }
  }
}
