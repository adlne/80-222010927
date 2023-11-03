class even{//to define class named even
    public static void main(String args[]){// The main method, the entry point of the program

        int number=2;// Declare an integer variable "number" and initialize it to 2

    do{// Start a do-while loop
            System.out.println(number);// Print the current value of "number"
            number=+2;// This line seems to have a typo. It should be "number += 2;" to increment "number" by 2.
        }
        while(number<=10);// Continue the loop as long as "number" is less than or equal to 10
    }
}
