class breakstate{// to define class named breakstate
public static void main(String args[]){// The main method, the entry point of the program
for (int h = 0; h < 10; h++) { // Iterate from 0 to 9 (inclusive)
    if (h == 8) { // Check if the current value of 'h' is equal to 8
        System.out.println("Condition met, exiting loop");// If the condition is met, print a message and exit the loop using 'break'
        break;
    }
    System.out.println("Iteration " + h);// Print the current iteration number
}
}
}