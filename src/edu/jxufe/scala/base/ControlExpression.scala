package edu.jxufe.scala.base

object ControlExpression {
  def main(args: Array[String]): Unit = {
    val x = 6
    val a = if(x>0) 1 else -1;
    println(a)


    var i = 9
    while (i>0){
      i-=1
      printf(s"i is $i \n")
    }

//    for(i <- 1 to 5) println(i)  //生成器  遍历
//    for(i <- 1 to 5 by 2) println(i)  //步长
//    for(i <- 1 to 5 by 2 if i%3==0) println(i)  //守卫表达式
//    for(i <- 1 to 5;j <- 1 to 3) println(i*j)   //多个生成器

    val r:Array[Int]=for(i<-Array(1,2,3,4,5) if i%2==0) yield{println(i);i}   //r: Array[Int] = Array(2, 4)


  }
}
