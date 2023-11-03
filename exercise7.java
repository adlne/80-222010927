class forloop{//define class name named forloop
public static void main(String args[]){// The main method, the entry point of the program
int n = 5;// Declare and initialize a variable 'n' with the value 5
for (int i = 1; i <= n; i++) { // Outer loop: Iterate from 1 to 'n' (inclusive)
    for (int j = 1; j <= i; j++) {// Inner loop: Iterate from 1 to 'i' (inclusive)
        System.out.print("* "); // Print an asterisk followed by a space
    }
    System.out.println();// Move to the next line to start a new row of asterisks
}
}
}