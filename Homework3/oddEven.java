public class oddEven {   

   public static void main(String[] args) {
		java.util.Scanner sc1=new java.util.Scanner(System.in);
		System.out.println("Ingrese Numero:");
		int n=sc1.nextInt();
      	if (n%2 == 0)
		{
   		// si el numero es impar
   			System.out.println("numero es par");
		}else{
   		// si el numero es par
   			System.out.println("numero es impar");
		}
   }
}