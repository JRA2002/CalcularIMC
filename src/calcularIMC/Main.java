package calcularIMC;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();

        Persona persona = new Persona(peso, altura);

        String mensaje = persona.mensajePersonalizadoIMC();
        System.out.println(mensaje);

        entrada.close();
	}

}
