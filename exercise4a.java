class forloop{//create class named forloop
public static void main(String args[]){// The main method, the entry point of the program
int[] numbers = {78, 5, 9, 4, 63}; // This line declares and initializes an integer array named "numbers" with the given values.
for (int i = 0; i < numbers.length; i++) {// This is a "for" loop. It initializes an integer variable "i" to 0, and the loop continues as long as "i" is less than the length of the "numbers" array.
    System.out.println(numbers[i]);// This line prints the value at index "i" in the "numbers" array to the console.
}
}
}