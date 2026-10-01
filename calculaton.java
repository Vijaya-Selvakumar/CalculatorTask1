import java.util.Scanner;

public class calculaton {

    static  double addition(double a, double b){
        return a+b;
    }
    static double subtraction(double a, double b){
        return a-b;
    }
    static double multiplication(double a, double b){
        return a*b;
    }
    static double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

           System.out.println("/n.......Calculation........");

           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
           System.out.println("3. Multiplication");
           System.out.println("4. division");
           System.out.println("5. exit");

          System.out.println("Enter your choice: ");
               choice=sc.nextInt();

               if (choice>=1 && choice<=4){

              System.out.println("Enter your first number: ");
             double num1 = sc.nextDouble();

             System.out.println("Enter your second number: ");
             double num2 = sc.nextDouble();

             

                switch (choice) {
                    case 1:
                        System.out.println("Result of Addtion is "+ addition(num1, num2));

                        break;
                    case 2:
                        System.out.println("Result of Subtraction is "+ subtraction(num1, num2));

                        break;
                    case 3:
                        System.out.println("Result of Multiplication is "+ multiplication(num1, num2));

                        break;
                    case 4:
                        if(num2==0){
                            System.out.println("Cannot divide by zero");
                        }
                        else{
                        System.out.println("Result of Divition is "+ division(num1, num2));
                       }
                        break;
                    
                }
                

             }
             else if(choice==5){
                System.out.println("Calculation exited.....");

                }

                else{
                    System.out.println("Invalid choice. Please try agaion..");
                }

                } while(choice!=5);

                    sc.close();

      
    }


    
}