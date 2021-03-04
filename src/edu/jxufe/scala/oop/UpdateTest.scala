package edu.jxufe.scala.oop

object UpdateTest {
  def main(args: Array[String]): Unit = {
    val myStrArr  = new Array[String](3)
//    myStrArr(0)="BigData"  //执行了下句  等号转换为update函数执行
    myStrArr.update(0,"BigData")
    println(myStrArr(0))
  }
}
