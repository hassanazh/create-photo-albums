object Solutions {
  def solution(t: Array[Int]): Int = {
    // write your code in Scala 2.12

    val tSize = t.length
    val minIndex = t.indexOf(t.min)

    if(Math.abs(t(minIndex-1)-t(minIndex)) >= Math.abs(t(minIndex + 1)-t(minIndex)))
        minIndex + 2
      else
        minIndex + 1
  }

  def main(args: Array[String]): Unit = {
    val array1 = Array(5, -2, 3, 8, 6)

    println(solution(array1))

    val array2 = Array(-5, -5, -5, -42, 6, 12)
  }
}
