class UrlMappings {

  static mappings = {

    "/library/$customerId?/album/$albumId?"(controller: "library") {
      action = [POST: "addAlbum"]
    }

    "/library/$customerId?/song/$songId?"(controller: "library") {
      action = [POST: "addSong"]
    }


    "/$controller/$action?/$id?" {
      constraints {
        // apply constraints here
      }
    }


    "/"(view: "/index")
    "500"(view: '/error')
  }
}
