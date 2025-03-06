import java.util.Scanner;

public class Addition {

     static  int  adding(int x, int y){

        return x+y;
    }

    public  static void main(String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number ");
         x = sc.nextInt();

        System.out.println("Enter your Second number ");
         y=sc.nextInt();

         
      
         int add= adding(x,y);

         System.out.println("Added Result is: "+ add );

    
        
    }
    
}