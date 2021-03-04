package edu.jxufe.scala.bookapplication.demo

case class People(name:String, age:Int)  //可以放在外面定义

object TestCaseObject {
  def main(args: Array[String]): Unit = {

    val alice = new People("Alice",25)
    val bob = new People("Bob",22)
    val mike = new People("mike",24)

    for (person <- List(mike,alice,bob)){
      person match{
        case People("Alice",25)=>println("Hi,Alice")
        case People("Bob",22)=>println("Hi,Bob")
        case People("mike",24)=>println("name:"+person.name+"\t"+"age:"+person.age)
      }
    }
  }
}
