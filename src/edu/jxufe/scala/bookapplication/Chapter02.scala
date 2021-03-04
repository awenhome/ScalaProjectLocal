package edu.jxufe.scala.bookapplication
import scala.io.Source

object Chapter02 {
  def main(args: Array[String]): Unit = {
    //1.任务2.2任务实现
    val yidong=Array(1340,1341,1342,1343,1344,1345,1346,1347,1348,135,136,137,138,139,150,151,152,157,158,159,182,183,184,187,188,178,147,1705)
    val liantong=Array(130,131,132,155,156,185,186,176,145,1709)
    val dianxin=Array(133,1349,153,180,181,189,1700,177)
    def identify(x:Int)={
      if(yidong.contains(x)){
        println("这个号码是属于中国移动类型的")
      }else if(liantong.contains(x)){
        println("这个号码是属于中国联通类型的")
      }else if(dianxin.contains(x)){
        println("这个号码是属于中国电信类型的")
      }else{
        println("这个号码不属于中国号码")
      }
    }

    identify(133)
    //2.任务2.3任务实现:统计广州号码段数量
    def count(area:String)={
      val arr=Array("115036,1477799,广东,广州,中国移动,020,510000","115038,1477801,广东,东莞,中国移动,0769,511700","115033,1477796,广东,广州,中国移动,020,510000","115032,1477795,广东,东莞,中国移动,020,510000")
      var sum=0
      for(a<-arr;if a.contains(area)){
        sum+=1
      }
      println(sum)
    }

    count("广州")
    //3.任务2.4任务实现：根据归属地对号码段分组
    val phone:List[String]=List("70999,1371001,广东,广州,中国移动,020,510000","71000,1371002,广东,广州,中国移动,020,510000","71348,1371350,广东,深圳,中国移动,0755,518000","71349,1371351,广东,深圳,中国移动,0755,518000")
    phone.groupBy(x=>x.split(",")(3)).map(x=>println(x))
    //4.任务2.5任务实现
    object Phone{
      def checkPhone(){
        val phone=for(line<-Source.fromFile("data\\opt\\2016phonelocation.txt").getLines) yield line
        val phoneList:List[String]=phone.toList
        println("请输入要查找的号码段：")
        var num:String=Console.readLine
        for(line <- phoneList;if line.contains(num)){
          println(line)
        }
      }
    }
    Phone.checkPhone()
  }
}
