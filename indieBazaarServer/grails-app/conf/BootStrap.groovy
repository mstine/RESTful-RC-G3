import com.mattstine.indiebazaar.Genre
import com.mattstine.indiebazaar.Artist
import com.mattstine.indiebazaar.Album
import com.mattstine.indiebazaar.Song

class BootStrap {

    def init = { servletContext ->

      new Genre(name:"Alternative").save()
      new Genre(name:"Blues").save()
      new Genre(name:"Christian & Gospel").save()
      new Genre(name:"Classical").save()
      new Genre(name:"Country").save()
      new Genre(name:"Easy Listening").save()
      new Genre(name:"Pop").save()
      new Genre(name:"Metal").save()
      new Genre(name:"Rock").save()
      new Genre(name:"Rap/Hip-Hop").save()

      new Artist(name:"Highwood Mountains", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Poison Ivy", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Lord High Steward of Sweden", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Maincy", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Tripodion", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Timothy C. Idoni", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"4-alpha-glucanotransferase", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"recurring characters", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"Patrick Diamond", genre:Genre.findByName("Alternative")).save()
      new Artist(name:"2/11th Commando Squadron", genre:Genre.findByName("Alternative")).save()
                
      new Album(title:"For The Moment Realizes Itself", artist:Artist.findByName("Highwood Mountains")).save()
      new Album(title:"Another Shall Not Betray Thee", artist:Artist.findByName("Highwood Mountains")).save()
      new Album(title:"Have His Head Examined", artist:Artist.findByName("Highwood Mountains")).save()
      new Album(title:"Children Come Back Home", artist:Artist.findByName("Highwood Mountains")).save()
      new Album(title:"Computers Are Lousy Actors", artist:Artist.findByName("Highwood Mountains")).save()

      new Song(title:"I.J.E.", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Operate Latex", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Tot Where Bambino Above Riot", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Confederation Dragon", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"The Kid Beyond Lamentations", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Compete Deceipt Before Tinkle Cub After Warning Then Cannon Raid Below Gambol Turbulence Challenge Hoo-ha Forever", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Yellow To-do Gray Alligator", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Row Bombard Intrusion 248", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Earth Over Monday Forever", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      new Song(title:"Toddler If Nestling", album:Album.findByTitle("Computers Are Lousy Actors")).save()
      
    }
    def destroy = {
    }
}
