package edu.jxufe.scala.oop


class Counter {  //类默认缺省是public
  var name = ""
  var step:Int = 0
  def this(name:String){ //辅助构造器1
    this()  //调用主构造器，默认有。类外部调用方式：new Counter
    this.name = name
  }
  def this(name:String, step:Int){//辅助构造器2
    this(name) //调用辅助构造器1
    this.step=step
  }

  private var privateValue = 0
  //方法定义方式：def  方法名（参数列表）：返回结果类型=｛方法体｝
  def value = privateValue   //这是定义类的一个方法，相当于java中get方法
  def value_=(newValue:Int): Unit ={  //相当于java中set方法
    if(newValue>0) privateValue = newValue
  }

  private var privateValue2 = 0

  def privateValueMethod = privateValue2   //这是定义类的一个方法，相当于java中get方法
  def privateValueMethod_=(newValue:Int): Unit ={  //相当于java中set方法
    if(newValue>0) privateValue2 = newValue
  }

//  def increment(step:Int):Unit = {value+=step}  //无返回值的，定义时可以省略  ：Unit =
  def increment(step:Int){value+=step}
  def current():Int = {value}   //不需要像java一样写return value；如果定义的时候方法名后面带了圆括号，调用时候加圆括号和省略圆括号都可以
  def current2:Int = {value}   //如果定义的时候没加圆括号，那么调用时不能加圆括号
}


