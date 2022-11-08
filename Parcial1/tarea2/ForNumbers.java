// Program to print numbers from 1 to 5

class Main {
  public static void main(String[] args) {
  
    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println(i);
    }
  }
}


// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}// Program to find the sum of natural numbers from 1 to 1000.

public class Factorial {
    public static void main(String[] args) {
        
      int fact = 1;
      int n = 4;
  
      // for loop
      for (int i = 1; i <= n; ++i) {
        // body inside for loop
        fact *= i;     // sum = sum * i
        System.out.println(fact);
      }
         
      System.out.println("Sum = " + fact);
    }
  }

