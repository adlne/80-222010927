class breakstatement{// to define class named breakstatement
public static void main(String args[]){// The main method, the entry point of the program
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Define an array of numbers
int target = 7;// Define the target number we want to find
for (int number : numbers) {// Iterate through each number in the 'numbers' array
    if (number == target) {// Check if the current 'number' is equal to the 'target' number
        System.out.println("Found the target number: " + target);// If a match is found, print a message and exit the loop using the 'break' statement
        break; 
    }
}
}
}