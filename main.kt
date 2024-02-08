import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter a number: ")

    // Read an integer from the user
    val n: Int = sc.nextInt()

    // Display the input back to the user
    println("You entered: $n")

    // Close the Scanner to avoid resource leaks
    sc.close()
}
