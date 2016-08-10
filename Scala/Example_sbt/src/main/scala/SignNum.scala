/**
 * Created by swamys01 on 04/04/2016.
 */
class SignNum {

  def findSignNum(num: Int) = {
    var signNum = 0;
    if(num > 0) {
      signNum = 1
    } else {
      if(num < 0) {
        signNum = -1
      }
    }

    signNum
  }

  def positiveNumTest(): Unit = {
    val num = 10
    println(num + "=>" +findSignNum(num))
  }

  def negativeNumTest(): Unit = {
    val num = -10
    println(num + "=>" +findSignNum(num))
  }

  def zeroNumTest(): Unit = {
    val num = 0
    println(num + "=>" +findSignNum(num))
  }

  def main(args: Array[String]) {
    positiveNumTest()
    negativeNumTest()
    zeroNumTest()
  }
}
