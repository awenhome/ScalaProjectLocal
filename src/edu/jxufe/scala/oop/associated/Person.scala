package edu.jxufe.scala.oop.associated

/**
 * class和object类名一样，则互为伴生类，相互之间可以调用对方成员变量
 */
class Person {
  private var _age = 2
  def age_=(num: Int) = this._age = num
  def age = _age
  def printObj { println(s"I can see ${Person.obj}") }  //如果不是伴生类，这个地方不能直接调动Person.obj
}


object Person {
  // access the private class field 'age'
  def double(p: Person) = p._age * 2
  private val obj = "Person's object"
}

//object Person2 {
//  // access the private class field 'age'
//  def double(p: Person) = p._age * 2   //不是伴生类，p._age会报错
//  private val obj = "Person's object"
//}

object Driver extends App {
  //伴生对象可以引用类的私有变量
  val p = new Person
  println(p.age)
  p.age = 10
  println(Person.double(p)) // prints 20

  //类可以引用伴生对象的私有变量
  p.printObj    //prints I can see Person's object
}