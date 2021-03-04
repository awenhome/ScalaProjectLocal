package edu.jxufe.scala.base
import java.sql.Timestamp

import scala.collection.immutable._
/**
 * @author pwz
 * @description 数组（Array）/元组（Tuple）/容器(Collection)/序列(Sequence)/集合（Set）/隐射(Map)/迭代器(Iterator)
 */
object TupleTest {
  def main(args: Array[String]): Unit = {
    //1 数组（Array）  具有相同类型的数据集合
    val intValueArr = new Array[Int](3)
    //注意区分Java中赋值，这里用的是圆括号
    intValueArr(0) = 12
    intValueArr(1) = 10
    intValueArr(2) = 5
    for(i<- 0 to 2) println(intValueArr(i))
    println(intValueArr.length)


    val myMatrix = Array.ofDim[Int](3,4)  //3行4列的二维数组:类型实际就是Array[Array[Int]]
    val myCube = Array.ofDim[String](3,2,4)  //Array[Array[Array[Int]]]


    //2 元组：对多个不同类型对象的一种简单封装
    val tupleObj: (String, Int, Double) = ("BigData",2015,45.0)   //turple:(String,Int,Double)
    println(tupleObj._1)
    println(tupleObj._2)
    println(tupleObj._3)

    //3 容器(Collection) 可变容器，不可变容器    ==>特质：Seq(LinearSeq、IndexedSeq)/Map(SortedMap)/Set（SortedSet、BitSet）
    //3.1 List-列表:相同类型不可变容器
   var strList = List("Bigdata","Hadoop","Spark")
    println(strList.tail)
    val otherList = "Apache"::strList   //多个列表挂载在一起形成新列表
    println(otherList.head)
    println(otherList.tail)

    println("List(元组）测试")
    val line = "hello world test awen"
    val ts = Timestamp.valueOf("2020-05-17 00:00:00")
    val words = line.split("\\s+")
    var wordsAndTime: List[(String, Timestamp)] = List()
    for(i <- 0 until words.length) {
      wordsAndTime = (words(i), ts) :: wordsAndTime
    }
    println("wordsAndTime.head:"+wordsAndTime.head)
    println("wordsAndTime.tail:"+wordsAndTime.tail)

    //3.2 向量（Vector）
    val vec1 = Vector(1,2)
    val vec2 = 3+:4+:vec1  //+：   Vector(3,4,1,2)
    val vec3 = vec2:+5     //：+   Vector(3,4,1,2,5)下标从0开始取
    println(vec3(3))

    //3.3 Range:是一种特殊的带索引的不可变数字等差序列  起点、终点、步长
    val r = new Range(1,5,1)  //从1到5，步长为1
    val r2 =1 to 5 //1.to(5)
    val r3 = 1 until 5 //不包含区间的终点值
    val r4:NumericRange[Float] = 0.5f to 5.9f by 0.8f   //从0.5到5.9，步长0.8

    //3.4 Set-集合： 不重复元素的容器  哈希方法找元素
    var mySet = Set("Hadoop","Spark")   //默认创建的是不可变集的对象（scala.collection.immutable） ==|=mySet是var，只是说mySet可以重新赋值，但=后面的集合对象不可变，不可更改里面的元素
    mySet+="Scala"   //生成新的不可变集再赋值给mySet变量
//    mySet.head = "Apache"    //不可变集本身是不能修改里面的值的
    println(mySet)

    val myMutableSet = scala.collection.mutable.Set("Database","BigData")
    myMutableSet+="Cloud Computing"  //改的是可变集本身
    println(myMutableSet)

    //3.4 Map{scala.collection.immutable.Map(默认)和scala.collection.mutable.Map}
    val university = scala.collection.mutable.Map("key1" ->"value1","key2" ->"value2","key3" ->"value3")
    university("key1") = "value1_update"
    println(university("key1"))

  }
}
