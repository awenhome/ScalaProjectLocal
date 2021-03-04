package edu.jxufe.scala.bookapplication.demo

/**伴生类和伴生对象：在同一个源文件中定义，且伴生类名称==伴生对象名称(源文件名称建议跟类名一样，但不是必须的）
 *   特性：伴生类与伴生对象可以互相访问其私有成员
 */
class Person(val name:String) {
  private def getSkill() = name+",s skill is"+Person.skill

}

object Person{
  private val skill = "basketball"
  private val person = new Person("Tracy")
  def printSkill = println(person.getSkill())

  def main(args: Array[String]): Unit = {
    Person.printSkill
  }
}