import java.util.*

fun main() {
    var myHappyPlace=Hotel("Leruat","Kajiado")
    var menu=(arrayOf("Fries","Buffalo wings","Lamb chops",""))
    println(Arrays.toString(menu))
    myHappyPlace.accomodation("Residential")

    var chillSpot=Restuarant("Honey & Dough","Westlands")
    var menus=(arrayOf("Tacos","Shawarma","Pizza"))
    println(Arrays.toString(menus))

    var myBar=Bar("BClub","Kilimani")
    myBar.openHours("Weekdays from 6PM to 8PM","Weekends from 2pm to 7.30PM ")
    var menyus=(arrayOf("Glen Fidich","Black Label","Jack Daniels"))
    println(Arrays.toString(menyus))



}
open class RefreshmentPlaces(val name:String,val location: String){
    open fun declaration(){
        println("Click and Eat!Order now!")
    }
  open fun foodMenu(menu:Array<String>) {

   }
   open  fun drinksMenu(menus:Array<String>) {

    }

}
 class Restuarant(var name:String, var location:String)

class Hotel(var name:String, var location:String){
     fun declaration() {
        println("A home away from Home!")
    }

    fun accomodation(roomOption:String){
       var room="Standard"
       var room2="Exclusive"
       var room3="Suite"

       if (roomOption=="Standard"){
           println(2000)
       }
       else if (roomOption=="Exclusive"){
           println(4000)

       }
       else if (roomOption=="Suite"){
           println(6000)
       }
       else{
           println("Service not Available!")
       }

   }

   }
class Bar( var name:String, var location: String){
    fun declaration() {
        println("Welcome!")
    }
    fun openHours(statement1:String,statement2: String){
        println(statement1+" "+statement2)
    }

}


