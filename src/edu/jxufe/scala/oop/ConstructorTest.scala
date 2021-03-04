package edu.jxufe.scala.oop

object ConstructorTest {
  //类的定义就是主构造器，类可以有多个辅助构造器
  class Counter(var name:String)  //定义一个带字符串参数的简单类,自动创建了一个name变量，且自动具有读写的方法
  class Counter2(name:String) //此时的name只是取到传参的作用，类的内部没有自动定义name这个变量
  def main(args: Array[String]): Unit = {
    var myCounter = new Counter("Runner")
    println(myCounter.name)
    myCounter.name_=("Timer")
    myCounter.name = "Timer"  //更直观地调动写方法，和上句等效
    println(myCounter.name)
  }

}
