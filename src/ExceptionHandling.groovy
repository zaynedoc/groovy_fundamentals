/*  Exception Handling in Groovy

	This script demonstrates basic exception handling using:
	- try / catch / finally
	- catching specific exception types
	- throwing your own exception
*/

println "=== Groovy: Exception Handling (try/catch/finally) ===\n"

// Catching a specific exception type (ArithmeticException)
println "--- Example 1: divide by zero ---"
try {
	def result = 10 / 0
	println "Result = ${result}" // won't run
} catch (ArithmeticException e) {
	println "Caught ArithmeticException: ${e.message}"
} finally {
	println "Finally always runs (cleanup goes here)."
}

println ""

// Parsing user input (NumberFormatException)
println "--- Example 2: parsing a number ---"
def input = "12a" // try changing to "12"
try {
	int n = Integer.parseInt(input)
	println "Parsed number: ${n}"
} catch (NumberFormatException e) {
	println "That wasn't a valid integer: '${input}'"
} finally {
	println "Done attempting parse."
}

println ""

// Throwing your own exception
println "--- Example 3: throwing an exception ---"
def withdraw = { BigDecimal balance, BigDecimal amount ->
	if (amount <= 0) {
		throw new IllegalArgumentException("Withdrawal amount must be > 0")
	}
	if (amount > balance) {
		throw new IllegalStateException("Insufficient funds")
	}
	balance - amount
}

try {
	def newBalance = withdraw(50G, 60G)
	println "New balance: ${newBalance}"
} catch (IllegalArgumentException | IllegalStateException e) {
	// multi-catch works in Groovy as well
	println "Withdrawal failed: ${e.class.simpleName}: ${e.message}"
} finally {
	println "Finished withdrawal attempt."
}

println "\nDone."
