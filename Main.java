import java.util.Scanner; 
class Main 
{
  public static void main(String[] args) 
  {
    summ(10,3);
    product(2,9);
    sub(10,5);
    divide(100,number);

    System.out.println("what numbers should you divde into 100?");
    int number = scan.nextInt();
    
    System.out.println(sum(summ));
    System.out.println(multiply(quotient));
    System.out.println(divide(product));
    System.out.println(sub(difference));

  }

  static int sum(int num1,int num2)
  {
    int summ = num1+num2;
    return summ;
  }

  static int multiply(int num3,int num4)
  {
    int quotient = num3*num4;
    return quotient;
  }

  static int divide(int num5,int num6)
  {
    int product = num5/num6;
    return product;
  }


  static int sub(int num7,int number)
  {
    int difference = num7-number;
    return difference;
  }
}