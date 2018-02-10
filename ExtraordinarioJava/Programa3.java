import java.util.Scanner;
public class Programa3{
	public static void main(String[] args){
		Scanner l = new Scanner(System.in);
		System.out.printf("Angulo: ");
		int angulo = l.nextInt();
		double radangulo=Math.toRadians(angulo);
		System.out.printf("El angulo en radianes es: "+radangulo);
		double coseno = Math.cos(angulo);
		System.out.printf("Coseno: "+coseno);
		double seno = Math.sin(angulo);
		System.out.printf("Seno: "+seno);
		double tangente = Math.tan(angulo);
		System.out.printf("Tangente: "+tangente);
	}
}