package edu.jxufe.scala.base

import java.io.PrintWriter
import scala.io.Source
object ScalaFileIO {
  def main(args: Array[String]): Unit = {
    //写入
    val outputFile = new PrintWriter("./data/textfile/test.txt")
    outputFile.println("hello world")
    outputFile.println("Spark is good")
    outputFile.close()

    // 读取
    val inputFile = Source.fromFile("./data/textfile/word.txt")
    val lines = inputFile.getLines()
    for(line<-lines) println(line)
  }
}
