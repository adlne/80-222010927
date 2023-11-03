class ArrayIteration {//to define class named ArrayIteration
    public static void main(String[] args) {// The main method, the entry point of the program
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Declare an array of integers and initialize it
        int index = 0;// Declare an integer variable "index" and initialize it to 0
        while (index < numbers.length) {// Start a while loop that iterates as long as "index" is less than the length of the "numbers" array
            if (numbers[index] % 2 == 0) {// Check if the current element in the array is an even number
                System.out.println(numbers[index] + " is an even number");// Print a message indicating that the current number is even
            }
            index++;// Increment the "index" to move to the next element in the array
        }
        }
    }
