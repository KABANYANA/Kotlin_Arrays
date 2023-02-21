import java.util.Arrays

fun main() {
 var frnds = arrayOf("joan", "Bebeto", "chris", "yvon", "yayita")
 println(frnds.get(4))
 frnds.set(1, "Benilde")
 println(frnds.contentToString())
 //listing array elements
 for (element in frnds) {
  println(element)
 }
 var frnds2023 = frnds.plus("Dolice")
 println(frnds2023.contentToString())

 var febfrnds = arrayOf("Jane", "Joyce")
 frnds2023 = frnds2023.plus(febfrnds)
 println(frnds2023.contentToString())

 //using indexof

 println(frnds2023.indexOf("yvon"))

 //builtin array functions
 val numbers = arrayOf(12, 45, 67, 89, 86, 38, 20)
 println(numbers.count())
 println(numbers.sum())
 println(numbers.min())
 println(numbers.max())
 println(numbers.average())
 println(frnds2023.max())
 println(frnds2023.min())

 // looping an array
 //frnds2023.forEach { frnd -> println(frnd) }
 for (frnd in frnds2023) {
  println(frnd)
 }
 SQRT()



 // SORTING AN ARRAY

 var sortedNumbers = numbers.sortedArray()
 println(Arrays.toString(sortedNumbers))
 println(numbers.contentToString())
 //println(numbers.sortedArray())
}
 fun SQRT() {
  var square = arrayOf(1, 2, 3, 4, 5)
  for (sqrt in square)
   println(sqrt * sqrt)
 }
