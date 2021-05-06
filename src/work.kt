fun main(){
person("jane",20)
   student(7)
   student(20)
   student(30)
   number(20,3)

}
fun person(name:String,Age:Int) {

   println("my name is$name and Iam$Age years old.")
}
fun  student(age:Int) {
   if (age <= 6) {
      println("serve a glass of milk")
   } else if (age <= 15) {
      println("serve a bottle of Fanta orange")

   } else {
      println("serve  a bottle of Cocacola")
   }
}
fun namelist(name1:String,name2:String,name3:String,name4:String):Int{
   var names=arrayOf(name1,name2,name3,name4)
   var word=0
   for(name in names){
      if(name.length>4){
         word ++
      }
   }
   return word
}
fun number(a:Int,b:Int ) {
   var multiple=(a*b%2)
   var divide=(a/b%2)
   var join=(divide and  multiple)
   print(join)
}


class Human(var name:String ,var Age: Int)
fun eat(foodWeight:Int){
   var foodWeight=weight

}

