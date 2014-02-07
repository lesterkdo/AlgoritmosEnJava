public class productToNumber {   

   public static void main(String[] args) {
		java.util.Scanner sc1=new java.util.Scanner(System.in);
   		String a,b;
		int resultado = 0;
		System.out.println("Ingrese Primer Numero:");
		int n=sc1.nextInt();
		System.out.println("Ingrese Segundo Numero:");
		int n1=sc1.nextInt();
		resultado = n*n1;
   		System.out.println("el producto es: "+resultado);
      
   }

}