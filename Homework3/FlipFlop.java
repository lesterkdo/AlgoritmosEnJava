import javax.swing.JOptionPane;
public class FlipFlop {   

	public static void main(String[] args) {
		java.util.Scanner sc1=new java.util.Scanner(System.in);
		System.out.println("Ingrese Numero:");
		int numeroActual=sc1.nextInt();
   		// si el numero es divisible dentro de 3 imprima "Flip"
		if(((numeroActual%5)==0) && ((numeroActual%3)==0))
		{
			System.out.println("FlipFlop");
		}else if((numeroActual%4)==0)
		{
   		// si el numero es divisible dentro de 4 imprima "Flop"
			System.out.println("Flop");
		}else if ((numeroActual%3)==0)
		{
   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			System.out.println("Flip");
		}else{
   		// de lo contrario, imprima el numero
      		System.out.println(numeroActual);
		}
	}

}