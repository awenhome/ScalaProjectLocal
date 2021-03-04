package edu.jxufe.scala.oop
class Car(name:String){
  def info(){}
  println("Car name is "+name)
}

object Car{
  def apply(name:String) = new Car(name)  //调用伴生类Car的构造函数
}

object MyTestApply {
  def main(args: Array[String]): Unit = {
    val myCar = Car("BMW")  //调用伴生类对象中的apply方法
    myCar.info()
  }

}
