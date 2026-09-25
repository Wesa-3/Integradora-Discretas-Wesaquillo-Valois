class QuickSortSuite extends munit.FunSuite {

  test("menores debe retornar los elementos menores al pivote") {
    val resultado = QuickSort.menores(List(5, 2, 8, 1, 7), 5)
    assertEquals(resultado.sorted, List(2, 1))
  }

  test("menores con lista vacía debe retornar Nil") {
    val resultado = QuickSort.menores(Nil, 3)
    assertEquals(resultado, Nil)
  }


  test("mayores debe retornar los elementos mayores al pivote") {
    val resultado = QuickSort.mayores(List(5, 2, 8, 1, 7), 5)
    assertEquals(resultado.sorted, List(7, 8))
  }

  test("mayores con lista vacía debe retornar Nil") {
    val resultado = QuickSort.mayores(Nil, 3)
    assertEquals(resultado, Nil)
  }


  test("appendTR debe concatenar dos listas") {
    val resultado = QuickSort.appendTR(List(1, 2), List(3, 4))
    assertEquals(resultado, List(1, 2, 3, 4))
  }

  test("appendTR con primera lista vacía retorna la segunda") {
    val resultado = QuickSort.appendTR(Nil, List(3, 4))
    assertEquals(resultado, List(3, 4))
  }


  test("separar debe dividir correctamente en menores y mayores") {
    val (menores, mayores) = QuickSort.separar(List(5, 2, 8, 1, 7), 5, Nil, Nil)
    assertEquals(menores.sorted, List(2, 1))
    assertEquals(mayores.sorted, List(7, 8))
  }

  test("separar con lista vacía retorna acumuladores vacíos") {
    val (menores, mayores) = QuickSort.separar(Nil, 5, Nil, Nil)
    assertEquals(menores, Nil)
    assertEquals(mayores, Nil)
  }


  test("quickSort debe ordenar una lista vacía") {
    val resultado = QuickSort.quickSort(Nil)
    assertEquals(resultado, Nil)
  }

  test("quickSort debe ordenar una lista de un elemento") {
    val resultado = QuickSort.quickSort(List(5))
    assertEquals(resultado, List(5))
  }

  test("quickSort debe ordenar una lista ya ordenada") {
    val resultado = QuickSort.quickSort(List(1, 2, 3))
    assertEquals(resultado, List(1, 2, 3))
  }

  test("quickSort debe ordenar una lista en orden inverso") {
    val resultado = QuickSort.quickSort(List(3, 2, 1))
    assertEquals(resultado, List(1, 2, 3))
  }

  test("quickSort debe ordenar una lista con elementos repetidos") {
    val resultado = QuickSort.quickSort(List(2, 1, 2, 3))
    assertEquals(resultado, List(1, 2, 2, 3))
  }

}