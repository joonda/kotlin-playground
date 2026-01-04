//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

  var computerChoice = ""
  var playerChoice = ""

  println("Rock, Paper, Scissors? Enter your choice")
  playerChoice = readln()

  val randomNumber = (1..3).random()
  when (randomNumber) {
    1 -> {
      computerChoice = "Rock"
    }
    2 -> {
      computerChoice = "Paper"
    }
    3 -> {
      computerChoice = "Scissors"
    }
  }

  val winner = when {
    playerChoice == computerChoice -> "Tie"
    playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
    playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
    playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
    else -> "Computer"
  }

  println(computerChoice)

  if (winner == "Tie") {
    println("It's a tie")
  } else {
    println("$winner won!")
  }
}