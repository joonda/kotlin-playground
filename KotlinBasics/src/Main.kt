fun main() {

  // Immutable list
  // val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

  val shoppingList = mutableListOf("Processor", "RAM",
    "Graphics Card RTX 3060", "SSD")

  shoppingList.add("Cooling System")
  shoppingList.remove("Graphics Card RTX 3060")
  shoppingList.add("Graphics Card RTX 4090")

  println(shoppingList)

  shoppingList.removeAt(2)
  shoppingList.removeAt(1)
  shoppingList.add(2, "RAM")
  println(shoppingList[3])
  shoppingList[3] = "Graphics Card RX 7800XT"
  val hasRam = shoppingList.contains("RAM")
  if (hasRam) {
    println("Has Ram in the list")
  } else {
    println("No Ram in the list")
  }

  for (index in 0 until shoppingList.size) {
    println("item ${shoppingList[index]} is at index $index")
  }
  println(shoppingList)
}

/*
data class CoffeeDetails (
  val sugarCount: Int,
  val name: String,
  val size: String,
  val creamAmount: Int,
)

fun makeCoffee(coffeeDetails: CoffeeDetails) {
  if (coffeeDetails.sugarCount == 1) {
    println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
  } else if (coffeeDetails.sugarCount == 0) {
    println("Coffee with no sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
  } else {
    println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream: ${coffeeDetails.creamAmount}")
  }
}
 */
