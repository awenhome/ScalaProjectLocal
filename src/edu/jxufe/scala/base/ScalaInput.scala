package edu.jxufe.scala.base
import scala.io.StdIn._
object ScalaInput {
  def main(args: Array[String]): Unit = {
    var i = readInt();
    println(i)
    printf("your input number is %d \n",i)
    var str=readLine("please input you name:")
    println("your name is:"+str)

//    val i = 10
//    val f:Double = 3.5452
//    val s = "hello"
//    println(s"$s:i=$i,f=$f")  //s插值字符串
//    println(f"$s:i=$i%-4d,f=$f%.1f")
  }
}
