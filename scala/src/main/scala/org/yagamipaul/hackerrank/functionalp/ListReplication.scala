package org.yagamipaul.hackerrank.functionalp

import scala.collection.mutable.ListBuffer

object ListReplication extends App {

  def f(num: Int, arr: List[Int]): List[Int] = {
    var list = new ListBuffer[Int]
    arr.foreach(i => (0 until num).foreach(_ => list+=i) )
    return list.toList
  }

  var n = scala.io.StdIn.readInt
  println(f(n, List(1,2,3)))
}
