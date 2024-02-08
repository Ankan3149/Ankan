class Calculator{
int num1;
int num2;
int sum;
int sub;
int mlt;
int div;
void insert(int n1,int n2){
num1=n1;
num2=n2;
}
void Calculatorsum(){
sum=num1+num2;
System.out.println("sum: "+sum);
}
void Calculatorsub(){
sub=num1-num2;
System.out.println("sub: "+sub);
}
void Calculatormlt(){
mlt=num1*num2;
System.out.println("mlt: "+mlt);
}
void Calculatordiv(){
div=num1/num2;
System.out.println("div: "+div);
}
}
public class TestCalculator{
public static void main(String[]args){
Calculator c1=new Calculator();
c1.insert(10,15);
c1.Calculatorsum();
c1.Calculatorsub();
c1.Calculatormlt();
c1.Calculatordiv();
}
}