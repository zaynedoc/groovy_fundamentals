/*  Variable Types in Groovy

    In Groovy, variables are dynamically typed by default. However, you can also explicitly declare variable types.
    This script demonstrates variable declaration, type inference, and basic data types in Groovy.

    Variable Types:
    - def: Used for dynamic typing.
    - Explicit Types: You can declare variables with specific types, such as:
        - String
        - int 
        - Double
        - Boolean
        - char
        - etc.

*/

def name = "Not Zayne"
name = 20
name = "Zayne"
println name + "\n"

def (String a, int b, Double c) = ["30", 20, 10]

println a
println b
println c + "\n" //<-- new line

// Numeric Data Types; minimum and maximum values
byte b1
println "Byte Values [min., max.]: " + b1.MIN_VALUE + ", " + b1.MAX_VALUE

short s1
println "Short Values [min., max.]: " + s1.MIN_VALUE + ", " + s1.MAX_VALUE

int i1
println "Integer Values [min., max.]: " + i1.MIN_VALUE + ", " + i1.MAX_VALUE

long l1
println "Long Values [min., max.]: " + l1.MIN_VALUE + ", " + l1.MAX_VALUE

float f1
println "Float Values [min., max.]: " + f1.MIN_VALUE + ", " + f1.MAX_VALUE

double d1
println "Double Values [min., max.]: " + d1.MIN_VALUE + ", " + d1.MAX_VALUE + "\n"

// Character Data Types
Boolean bool = true
char n = "!"
String temp = "Very Groovy!"

println temp + n

if (bool == false) {
    println "bool is false"
} else {
    println "bool is " + bool
}

println "Variable 'temp' is a " + temp.getClass().getName()