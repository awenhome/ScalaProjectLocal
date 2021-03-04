package edu.jxufe.scala.oop

class TestApplyClass {
  def apply(param:String){
    println("apply method called:"+param)
  }
}

object Driver{
  def main(args: Array[String]): Unit = {
    val applyObj = new TestApplyClass()
    applyObj("ok")   //自动调用类中定义的apply方法,等同下句
    applyObj.apply("ok")
  }

}
