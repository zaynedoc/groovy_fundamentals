class Main {
    static void main(String[] args) { // <-- static main method, conventional JVM entry point
        Main foo = new Main()   // <-- Create an instance of Main
        foo.greet("World")      // <-- Call greet method, greet is within the class Main

        int result = foo.sum()
        println "Sum: ${result}"

        result = foo.sum(5, 7)
        println "Sum: ${result}"
    }

    def greet(name) {
        println "Hello, ${name}!"
    }

    def sum(a = 1, b = 2) { // <-- default parameter values
        int sol = a + b // <-- variable local to the method
        return sol
    }
}

