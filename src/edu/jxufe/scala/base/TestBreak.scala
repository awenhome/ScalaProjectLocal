package edu.jxufe.scala.base
import util.control.Breaks._
object TestBreak {
  def main(args: Array[String]): Unit = {
    val array = Array(1,3,10,5,4)
    println("相当于java中break")
    breakable{
      for(i<- array){
        if(i>5) break
        println(i)
      }
    }

    println("相当于java的continue")
    for(i<- array){
    breakable{
        if(i>5) break // 跳出breakable，终止当次循环，相当于java的continue
        println(i)
      }
    }
  }
}
