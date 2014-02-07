public class whileValue {   

   public static void main(String[] args) {
		int valorActual = 0;
		java.util.Scanner sc1=new java.util.Scanner(System.in);
		System.out.println("Ingrese Numero:");
		int nn=sc1.nextInt();
   		while(valorActual<nn)
		{
   		//si valor actual < args[0]
   			System.out.println("el valor actual es: "+valorActual);
			valorActual=valorActual+1;
		}
   }

}