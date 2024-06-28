package org.example

fun main() {
    val map0 = """
       xxoo
       ooox
       oxoo
    """.trimIndent()
    println(countIsles(map0)) //expected 3

    val map1 = """
       oxooooxo
       oxxoooxo
       ooooxooo
       ooooooxo
       oooxxxxo
       oooooooo
    """.trimIndent()
    println(countIsles(map1)) //expected 4
}

fun countIsles(bitmap: String): Int {
    println(bitmap)
    return 0
}

