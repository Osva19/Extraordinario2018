import java.util.Scanner;
public class Programa2{
	public static void main(String[] args){
		Scanner l = new Scanner(System.in);
		System.out.printf("Base: ");
		int b=l.nextInt();
		System.out.printf("Altura: ");
		int h=l.nextInt();
		double a=b/2;
		double c=Math.sqrt((a*a)+(h*h));
		System.out.printf("El valor de la hipotenusa es: "+c);
		double an=Math.tan(h/a);
		System.out.printf("El angulo 1 es: "+an+" y el 2 es: "+(90-an));
	}
}