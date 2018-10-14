object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    def helper(limit: Int, numberToAdd: Int, toSum: Set[Int], initialNumber: Int): Set[Int] = {
      println("limit:" + limit + ",numberToAdd:" + numberToAdd + "sum:" + toSum + "initialNumber:" + initialNumber)
      if (numberToAdd >= limit) toSum
      else helper(limit, numberToAdd + initialNumber, toSum + numberToAdd, initialNumber)
    }

    factors.map(e => helper(limit, e, Set(), e)).flatten.sum

  }


}

