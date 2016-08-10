/**
 * Created by swamys01 on 04/04/2016.
 */
class XToThePowN {

  def findXtoThePowN(x: Int, n:Int): Double = {
    if(n==0) 1
    else {
      if(n>0) {
        if(n%2==0) {
          var y = findXtoThePowN(x, n/2)
          y*y
        }
        else {
          x*findXtoThePowN(x, n-1)
        }
      }
      else {
        1 / findXtoThePowN(x, n * -1)
      }

    }
  }

}
