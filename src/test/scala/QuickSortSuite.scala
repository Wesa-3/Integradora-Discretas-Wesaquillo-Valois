class QuickSortSuite extends munit.FunSuite {
  test("separar3: lista vacía") {
    val (menores, iguales, mayores) = QuickSort3.separar3(Nil, 5)
    assert(menores == Nil)
    assert(iguales == Nil)
    assert(mayores == Nil)
  }

  test("separar3: un solo elemento igual al pivote") {
    val (menores, iguales, mayores) = QuickSort3.separar3(List(5), 5)
    assert(menores == Nil)
    assert(iguales == List(5))
    assert(mayores == Nil)
  }

  test("separar3: partición correcta de elementos mixtos") {
    val input = List(4, 2, 5, 8, 5, 1, 9, 5)
    val (menores, iguales, mayores) = QuickSort3.separar3(input, 5)
    assert(menores == List(4, 2, 1))
    assert(iguales == List(5, 5, 5))
    assert(mayores == List(8, 9))
  }

  test("quickSort3: lista vacía") {
    assert(QuickSort3.quickSort3(Nil) == Nil)
  }

  test("quickSort3: lista de un solo elemento") {
    assert(QuickSort3.quickSort3(List(42)) == List(42))
  }

  test("quickSort3: lista ya ordenada") {
    val input = List(1, 2, 3, 4, 5, 6, 7)
    assert(QuickSort3.quickSort3(input) == List(1, 2, 3, 4, 5, 6, 7))
  }

  test("quickSort3: lista en orden inverso") {
    val input = List(9, 7, 5, 3, 1)
    assert(QuickSort3.quickSort3(input) == List(1, 3, 5, 7, 9))
  }

  test("quickSort3: lista con elementos repetidos") {
    val input = List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
    val esperado = List(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9)
    assert(QuickSort3.quickSort3(input) == esperado)
  }

  test("quickSort3: caso con muchos valores iguales al pivote") {
    val input = List(5, 2, 5, 5, 8, 5, 1, 5, 5, 9, 5, 5)
    val esperado = List(1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 8, 9)
    assert(QuickSort3.quickSort3(input) == esperado)
  }
}
