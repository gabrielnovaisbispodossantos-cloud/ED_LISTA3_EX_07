package view;
import controller.metodos;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numero = 1243;

		  String s = String.valueOf(numero);

		  metodos c = new metodos();

		  System.out.println(c.somar(s));
	}

}
