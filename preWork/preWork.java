package preWork;
import java.util.Scanner;

class preWork {
    
    int option;

    public void checkPalindrome(int num){
        
        String str1=Integer.toString(num);
        StringBuilder str2=(new StringBuilder(str1).reverse());
        String out=(str2.toString().equals(str1)? num + " is Palindrome": num + " is not Palindrome");
        System.out.println(out);
    }

    public void printPattern(int num){
        
        if(num>0){
            System.out.println("Star Pattern of size " + num + " =>");
            int k=num;
            for(int i=1; i<=num; i++){
                for(int j=k;j>=1;j--){
                    System.out.print("*");
                }  
                k-=1;
                System.out.println("");              
            }
        }else{
            System.out.println("Invalid Number for pattern printing");
        }

    }

    public void checkPrime(int num){
        boolean isPrime=true;
        System.out.println(num);
        for(int i=1;i<=num;i++){
             if(num%i == 0){
                if(i == 1 || i == num)
                    continue;
                else{
                    isPrime=false;
                    break;
                }
             }               
        }
        
        if(isPrime)
            System.out.println(num+" is a PRIME Number");
        else
            System.out.println(num+" is NOT a PRIME Number");
    }

    public void printFibonacci(int num){
        System.out.println("Fibonacci series is =>");
        int i=num;
        int prev=0;
        int curr=1;
        int next;
        System.out.print(prev);

        do{
            System.out.print(","+curr);
            next=prev+curr;
            prev=curr;
            curr=next;
            i--;
        }while(i>1); 
    }

    public static void main(String[] args){
        
        int num;
           
        preWork obj = new preWork();

        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Enter Function # to perform - ");
            System.out.println("1 -> Check for Palindrome Number");
            System.out.println("2 -> Print Star pattern");
            System.out.println("3 -> Check for Prime Number");
            System.out.println("4 -> Print Fibonacci series");
            System.out.println("0 -> Terminate");
            System.out.println("OPTION => ");

            obj.option =in.nextInt();

            switch(obj.option){
                case 0:
                        System.out.println("Function Terminated!!");
                        break;
                case 1:
                        System.out.println("Enter a Number to check for Palindrome");
                        num=in.nextInt();
                        obj.checkPalindrome(num);
                        System.out.println();
                        break;
                case 2:
                        System.out.println("Enter a Number to print the Star pattern");
                        num=in.nextInt();
                        obj.printPattern(num);
                        System.out.println();
                        break;
                case 3:
                        System.out.println("Enter a Number to check for Prime");
                        num=in.nextInt();
                        obj.checkPrime(num);
                        System.out.println();
                        break;
                case 4:
                        System.out.println("Enter a Number upto which Fibonacci series is needed");
                        num=in.nextInt();
                        obj.printFibonacci(num);
                        System.out.println();
                        break;
                default:
                        System.out.println("Invalid Option - "+obj.option+"\n");
                        break;
            }
        } while(obj.option!=0);          
        in.close();        
    }
}