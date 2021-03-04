//package edu.jxufe.scala.oop
//
///**
// * @description  单例对象，使用object去定义单例对象
// * @特点      相当于java中静态类，不用实例化，可以直接用
// */
//object Person {
//  private var lastId = 0 //一个人的身份编号
//  def newPersonId() ={
//    lastId+=1
//    lastId   //返回值，不需要return
//  }
//  /**
//   * 同一个代码文件内容中有class和object的名称一样，则互为伴生类，伴生类彼此可以访问对方内部成员变量
//   */
//  class Person (val name:String){
//    private val id = Person.newPersonId()  //调用了伴生对象中的方法
//    def idValue=id
//    def info(): Unit ={
//      printf("The id of %s is %d.\n",name,id)
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//    //调用特点:1直接调用，不需要实例化；2.静态属性，会记录其中变量上次的结果
//    printf("The first person id:%d.\n",Person.newPersonId())
//    printf("The second person id:%d.\n",Person.newPersonId())
//    printf("The third person id:%d.\n",Person.newPersonId())
//
//    val person1 = new Person("Lilei")
//    val person2 = new Person("Hanmei")
//    println(person1.idValue)  //伴生类直接调用伴生对象中的idValue
//    person1.info()
//    person2.info()
//  }
//
//}
//
//
