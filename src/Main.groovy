class Main {
    static void main(String[] args) { // <-- static main method, conventional JVM entry point
        Main foo = new Main()   // <-- Create an instance of Main
        foo.greet("World")      // <-- Call greet method, greet is within the class Main
      
        int result = foo.sum()
        println "Sum: ${result}"

        result = foo.sum(5, 7)
        println "Sum: ${result}"

        def closureName = { name -> println "Hello ${name}" }
        closureName.call("World") // <-- Call closure

        def closureSum = { c -> foo.sum(c, c * 2) } // <-- closure that uses sum method
        println "Closure result: ${closureSum.call(3)}" + "\n"

        def map = [
                    name: "Alice",           
                    city: "Wonderland"
                ]
        
        def mapItems = map.collect { key, value -> "${key}: ${value}" }.join("\n")
        println "Map items:\n${mapItems}"

        def fruits = ["apple", "banana", "cherry"]
        println "\nList: ${fruits}"
        println "List contains 'banana'? ${fruits.contains('banana')}"
        println "Item at index 1 (get): ${fruits.get(1)}"
    }

    def greet(name) {
        println "Hello, ${name}!"
    }

    def sum(a = 1, b = 2) { // <-- default parameter values
        int sol = a + b // <-- variable local to the method
        return sol
    }
}

