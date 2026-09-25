class QuickSort3 {
    
}
import scala.annotation.tailrec
object QuickSort3 {
  @tailrec
  def separar3(inputList: List[Int], p: Int, menoresAcc: List[Int] = Nil, igualesAcc: List[Int] = Nil, mayoresAcc: List[Int] = Nil): (List[Int], List[Int], List[Int]) = {
    inputList match {
      case Nil =>
        (menoresAcc.reverse, igualesAcc.reverse, mayoresAcc.reverse)
      case head :: tail =>
        if (head < p)
          separar3(tail, p, head :: menoresAcc, igualesAcc, mayoresAcc)
        else if (head == p)
          separar3(tail, p, menoresAcc, head :: igualesAcc, mayoresAcc)
        else
          separar3(tail, p, menoresAcc, igualesAcc, head :: mayoresAcc)
    }
  }

  def quickSort3(inputList: List[Int]): List[Int] = {
    inputList match {
      case Nil => Nil
      case _ :: _ =>
        val pivote = inputList.head
        val (menores, iguales, mayores) = separar3(inputList, pivote)
        quickSort3(menores) ::: iguales ::: quickSort3(mayores)
    }
  }
}
