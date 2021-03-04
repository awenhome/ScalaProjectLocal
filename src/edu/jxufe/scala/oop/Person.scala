package edu.jxufe.scala.oop



/**
 * class和object类名一样，则互为伴生类，相互之间可以调用对方成员变量
 */
class Person(val name:String){
  private val id = Person.newPersonId()  //调用了伴生对象中的方法
  def info(): Unit ={
    printf("The id of %s is %d.\n",name,id)
  }
  def printObj { println(s"I can see ${Person.obj}") }
}

/**
 * @description  单例对象，使用object去定义单例对象
 * @特点      相当于java中静态类，不用实例化，可以直接用
 */
object Person {
  private var lastId = 0 //一个人的身份编号
  private val obj = "Person's object"
  def double(p: Person) =p.id*2
  def newPersonId() ={
    lastId+=1
    lastId   //返回值，不需要return
  }

  def main(args: Array[String]): Unit = {
    //调用特点:1直接调用，不需要实例化；2.静态属性，会记录其中变量上次的结果
//    printf("The first person id:%d.\n",Person.newPersonId())
//    printf("The second person id:%d.\n",Person.newPersonId())
//    printf("The third person id:%d.\n",Person.newPersonId())

    val person1 = new Person("Lilei")
    val person2 = new Person("Hanmei")
    person1.info()
    person2.info()
  }
}


