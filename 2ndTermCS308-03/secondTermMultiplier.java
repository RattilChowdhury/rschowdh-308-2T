import java.util.Scanner;
class secondTermMultiplier {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a;
	int b;
	System.out.println("Please enter integer 1: ");
	a=sc.nextInt();
	System.out.println("Please enter integer 2: ");
	b=sc.nextInt();
	System.out.println("The product of "+Integer.toString(a)+"x"+Integer.toString(b)+" is "+Integer.toString(a*b)+"\n");
	sc.close();
	}
}
