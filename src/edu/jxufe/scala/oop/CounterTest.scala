package edu.jxufe.scala.oop

object CounterTest {
  def main (args: Array[String] ): Unit = {
    var a = 3.+(5)  //调用+方法，参数是5
    a=3+5   //简写：中缀调用法

    val myCounter = new Counter
    myCounter.value_=(10)   //为privateValue设置新的值
    myCounter.value = 5   //调用了value_方法，相当于myCounter.value_=(5)
    println(myCounter.value)
    myCounter.increment(3)  //调用方法
    println(myCounter.current()) //调用无参函数，返回
    println(myCounter.current)   //无参数的方法，圆括号可以省略
//    println(myCounter.current2()) //定义时无圆括号，调用时加上会报错
    println(myCounter.current2)  //定义时无圆括号，调用时一定不能有圆括号

    myCounter.privateValueMethod_=(3)
    println(myCounter.privateValueMethod)
  }
}
