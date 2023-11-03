class work1{//define class called work1
    public static double simpleinterest(int num1,double num2,int num3){ // Create a public static method named simpleinterest that takes three parameters://an integer num1
    // - a double num2
    // - an integer num3
        return num1 * num2 * num3;// Calculate and return the simple interest using the provided formular
    }
    public static void main(String[]args){// The main method, the entry point of the program
        int number1=100000;
        double number2=0.05;// Declare and initialize three variables to hold values for simple interest calculation// Principal amount
        double number2 = 0.05; // Interest rate
        int number3 = 5;      // Time period
        int number3=5;
        double result=simpleinterest(number1,number2,number3);// Call the simpleinterest method with the provided values and store the result in 'result'
        System.out.println( result);//Print the result of the simple interest calculation
    
}
}
