import java.io.*;  
import java.util.Scanner; 
import java.util.ArrayList;

public class App {
    // This ArrayList works like an array that can grow and shrink in size
    // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    static ArrayList<Double>  stack = new ArrayList<Double>();

    // Pop an item from teh Stack. In other words, remove the last value
    // in teh Stack and return the removed value. 
    static double popFromStack() {
        double result = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return result;
    }

    // Push a value onto the Stack. In other words, add a value to the end
    // of teh ArrayList
    static void pushOnStack(double value) {
        stack.add(value);
    }

    // line contains double precision floating point numbers and strings that
    // identify operations to be peformed using the numbers. Numbers are 
    // pushed onto a Stack that is implemented using ArrayList. Each
    // operation pops as many operands as it needs from the stack, perfoms
    // the operation, and pushes the result onto the stack.
    // This function returns the result of the calculations specified in line.
    static double parseArithmeticLineFromInputStream(String line)
    {
        double result = 0;    
        Scanner tokenizer = new Scanner(line); // We can scan within a string
        while(tokenizer.hasNext()) {
            if(tokenizer.hasNextDouble()) {
                Double value = tokenizer.nextDouble();
                pushOnStack(value);   // Append value to end of ArrayList making ArrayList longer
            } else {
                String operation = tokenizer.next();
                if(operation.equals("sqrt")) { // Square Root Operation
                    double a = popFromStack();
                    result = Math.sqrt(a);
                } else {
                    double b = popFromStack();
                    double a = popFromStack();
                    if(operation.equals("+")) { // Add operation
                        result = a + b;
                    } else if(operation.equals("*")) { // Multiply operation
                        result = a * b;
                    } else if(operation.equals("-")) { // Subtract operation
                        result = a - b;
                    } else if(operation.equals("/")) { // Divide operation
                        result = a / b;
                     } else if(operation.equals("min")) { // Pop two items and push smaller one
                        result = Math.min(a, b);
                    } else if(operation.equals("max")) { // Pop two items and push larger one
                        result = Math.max(a, b);
                    }
                }
                pushOnStack(result); // Push result of operation onto the stack
            }
        }
        return result;
    }

    // Open a file at a specific filesystem location as an FileInputStream
    // and call parseArithmeticLineFromInputStream() for each line in the 
    // InputStream. Then output the the result of the calculation on each 
    // line to Syatem.out and a FileOutputStream
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("input.txt");   
        
        // Creating an output stream with a file system path creates an empty file at
        // that path
        FileOutputStream fos = new FileOutputStream("output.txt");

        // We need to "wrap" our regular output stream in a PrintWriter so that
        // "printing" strings to the stream is easy using .print() and .println()
        PrintWriter fwriter = new  PrintWriter(fos);    

        Scanner sc = new Scanner(fis);    // stream to be scanned line by line
        while(sc.hasNextLine())  {  
            // for each line in input stream
            String line = sc.nextLine();

            fwriter.print(line);
            System.out.print("\"" + line + "\"");
            fwriter.print(" = ");
            System.out.print(" = ");
            double result = parseArithmeticLineFromInputStream(line);
            fwriter.println(result);
            System.out.println(result);

            System.out.println(stack);

            // Empty the stack so calculations for the next line start from a clean slate
            stack.clear();  
        }
        sc.close();

        // We MUST close the PrintWriter and the output stream or else the strings
        // we "printed" may not be "flushed" to the actual file in the file system.
        // Flushing is needed because writing/printing just writes to memory (RAM)
        // until flushed for performance reasons.
        fwriter.close();
        fos.close();
    }
}
