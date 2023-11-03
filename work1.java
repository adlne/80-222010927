


class work1{//how to create method for reusability
    public static double simpleinterest(int num1,double num2,int num3){ 
        return num1 * num2 * num3;

    }
    public static void main(String[]args){
        int number1=100000;
        double number2=0.05;
        int number3=5;
        double result=simpleinterest(number1,number2,number3);
        System.out.println( result);
    
}
}