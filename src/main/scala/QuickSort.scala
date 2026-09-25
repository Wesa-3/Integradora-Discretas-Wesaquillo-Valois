class QuickSort {

}

object QuickSort:

  def menores(inputList: List[Int], p: Int): List[Int] = inputList match
    case Nil => Nil
    case head :: tail =>
      if head < p then head :: menores(tail, p)
      else menores(tail, p)

  def mayores(inputList: List[Int], p: Int): List[Int] = inputList match
    case Nil => Nil
    case head :: tail =>
      if head > p then head :: mayores(tail, p)
      else mayores(tail, p)

  def appendTR(inputL1: List[Int], inputL2: List[Int]): List[Int] = inputL1 match
    case Nil => inputL2
    case head :: tail => head :: appendTR(tail, inputL2)

  def separar(
               inputList: List[Int],
               p: Int,
               menoresAcc: List[Int],
               mayoresAcc: List[Int]
             ): (List[Int], List[Int]) = inputList match
    case Nil => (menoresAcc, mayoresAcc)
    case head :: tail =>
      if head < p then separar(tail, p, head :: menoresAcc, mayoresAcc)
      else separar(tail, p, menoresAcc, head :: mayoresAcc)

  def quickSort(inputList: List[Int]): List[Int] = inputList match
    case Nil => Nil
    case head :: tail =>
      val (menoresList, mayoresList) = separar(tail, head, Nil, Nil)
      val menoresOrdenados = quickSort(menoresList)
      val mayoresOrdenados = quickSort(mayoresList)
      appendTR(menoresOrdenados, head :: mayoresOrdenados)
      