/**2.5 SELF REVIEW1
a)	in this program we are going to calculate the value of three integers
b)	scanner input = new scanner(System.in);
c)	int x,y,z,result;
d)	System.out.print(“ enter first integer”);
e)	X=input.nextint();
f)	System.out.print(“enter the second integer”);
g)	Y=input.nextint();
h)	System.out.printf(“enter the third integer”);
i)	Z=input.nextint();
j)	result is =x*y*z;
k)	System.out.printf(“product is  %d”, result);
 */
//2.6//
import java.util.Scanner;
public class Product{
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        int result;
        System.out.print("enter first integer");
        x=input.nextInt();
        System.out.print("enter te second inteer");
        y=input.nextInt();
        System.out.print("enter the third integer");
        z=input.nextInt();
        result=x*y*z;
        System.out.printf("product is %d  ", result );


        
       
    }
}
