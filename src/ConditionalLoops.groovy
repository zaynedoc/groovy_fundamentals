/*  Loops and Conditional Statements in Groovy

    This script demonstrates the use of conditional statements and loops in Groovy.

    Differrent types of conditional statements covered are:
    - if-else:
        - Used to execute code based on conditions.
    - switch-case:
        - Used for multi-way branching based on the value of a variable.

    The different types of loops covered are:
    - for loop
    - while loop
    - do-while loop

*/

println "=== Groovy: Conditionals + Loops (Beginner Samples) ===\n"

// ------------------------------------------------------------
// CONDITIONAL STATEMENTS
// ------------------------------------------------------------

println "--- if / else if / else ---"
def temperatureC = 27

if (temperatureC >= 30) {
    println "It's hot (${temperatureC}°C)."
} else if (temperatureC >= 20) {
    println "It's warm (${temperatureC}°C)."
} else {
    println "It's cool (${temperatureC}°C)."
}

println "\n--- Groovy truth (truthy / falsy) ---"
def emptyText = ""
def nonEmptyList = [1, 2, 3]

if (emptyText) {
    println "This won't print because empty strings are falsy."
} else {
    println "Empty string is treated as false."
}

if (nonEmptyList) {
    println "Non-empty list is treated as true: ${nonEmptyList}"
}

println "\n--- Ternary operator (condition ? a : b) ---"
def age = 17
def canVote = (age >= 18) ? "Yes" : "No"
println "Age: ${age}. Can vote? ${canVote}"

println "\n--- Elvis operator (value ?: default) ---"
def username = null
def displayName = username ?: "Guest"
println "Hello, ${displayName}"

println "\n--- switch / case ---"
def day = "SAT"

switch (day) {
    case "MON":
    case "TUE":
    case "WED":
    case "THU":
    case "FRI":
        println "Weekday (${day})"
        break
    case "SAT":
    case "SUN":
        println "Weekend (${day})"
        break
    default:
        println "Unknown day: ${day}"
}

println "\n--- switch with ranges and types (Groovy-friendly) ---"
def score = 82
switch (score) {
    case 0..59:
        println "Score ${score}: F"
        break
    case 60..69:
        println "Score ${score}: D"
        break
    case 70..79:
        println "Score ${score}: C"
        break
    case 80..89:
        println "Score ${score}: B"
        break
    case 90..100:
        println "Score ${score}: A"
        break
    default:
        println "Score out of range: ${score}"
}

// ------------------------------------------------------------
// LOOPS
// ------------------------------------------------------------

println "\n=== Loops ==="

println "\n--- for (classic) ---"
for (int i = 0; i < 3; i++) {
    println "i = ${i}"
}

println "\n--- for (in) over a range ---"
for (n in 1..5) {
    print "${n} "
}
println "" // newline

println "\n--- for (in) over a collection ---"
def fruits = ["apple", "banana", "cherry"]
for (fruit in fruits) {
    println "Fruit: ${fruit}"
}

println "\n--- each (Groovy iteration helper) ---"
fruits.each { fruit ->
    println "(each) ${fruit.toUpperCase()}"
}

println "\n--- times (run a block N times) ---"
3.times { idx ->
    println "times index = ${idx}"
}

println "\n--- upto / downto ---"
1.upto(3) { v ->
    println "upto: ${v}"
}
3.downto(1) { v ->
    println "downto: ${v}"
}

println "\n--- step (count by increments) ---"
0.step(10, 2) { v ->
    print "${v} "
}
println "" // newline

println "\n--- while loop ---"
def count = 0
while (count < 3) {
    println "count = ${count}"
    count++
}

println "\n--- do / while loop ---"
def tries = 0
do {
    println "Try #${tries}"
    tries++
} while (tries < 2)

println "\n--- break / continue ---"
for (n in 1..6) {
    if (n == 2) {
        println "Skipping 2 (continue)"
        continue
    }
    if (n == 5) {
        println "Stopping at 5 (break)"
        break
    }
    println "n = ${n}"
}

println "\nDone."