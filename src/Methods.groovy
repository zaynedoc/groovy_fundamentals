/* Methods in Groovy

*/

def greet(name) {
    return "Hello, ${name}!" // <-- string return type
}

println greet("World")

def sum(a = 1, b = 2) { // <-- default parameter values
    int sol = a + b // <-- variable local to the method
    return sol
}

int result = sum()
println "Sum: ${result}"

result = sum(5, 7)
println "Sum: ${result}"