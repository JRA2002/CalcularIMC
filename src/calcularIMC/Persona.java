package calcularIMC;

public class Persona {
	
	private double peso;
    private double altura;
    public double imc = 0;
    
    
    public Persona(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public String mensajePersonalizadoIMC() {
        imc = calcularIMC();
        if (imc < 18.5) {
            return String.format("Tu IMC es %.1f. Estás por debajo del peso normal. ¡Consulta con un médico!", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            return String.format("Tu IMC es %.1f. Tienes un peso saludable. ¡Buen trabajo!", imc);
        } else {
            return String.format("Tu IMC es %.1f. Tienes sobrepeso. ¡Cuida tu salud!", imc);
        }
    }

}
