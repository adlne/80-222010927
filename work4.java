public class work4 {//create public class named work4
    public double interest(int p,double r,int t,int n){//create amethod named interest tha has four parameters(p,r,t,n)
        return p* (Math.pow((1+r/1200),n*t));//this method  calculates compound interest and returns the result
    }
}
class Main{//define aseparate class named Main
public static void main(String[] args) {//define the main method which is the entry point of program
work4 myclass= new work4();//create ana instance of work4 class
double answer=myclass.interest(500000,18,3,12);//call the interest method on the myclass object and store the result in the answer variable
System.out.println("The Result is:"+answer);//print the result
}
}

