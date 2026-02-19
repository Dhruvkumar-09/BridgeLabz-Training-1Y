import java.util.Scanner;
class Comparesum{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 int sumfor=num*(num+1)/2;
 if(num<1){
 System.out.println("The number is not a natural number");
 return;
 }
 int sumwhile=0;
 while(num!=0){
 sumwhile=sumwhile+num;
 num--;
 }
 
 
 System.out.println("sum from while is "+sumwhile+ " and sum from formula is "+sumfor);
 
 if (sumwhile == sumfor) {
            System.out.println("Both results are correct");
        } else {
            System.out.println("Results are not equal");
        }
}
}