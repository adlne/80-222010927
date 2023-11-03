public class work4 {
    public double interest(int p,double r,int t,int n){
        return p* (Math.pow((1+r/1200),n*t));
    }
}
class Main{
public static void main(String[] args) {
work4 myclass= new work4();
double answer=myclass.interest(500000,18,3,12);
System.out.println("The Result is:"+answer);
}
}

