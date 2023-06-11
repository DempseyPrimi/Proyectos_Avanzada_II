package hn.joan.calculadora_areas;
import java.util.Scanner;
public class App 
{
	private static Scanner leer = new Scanner(System.in);
    public static void main( String[] args ){
        int opc = 0;
        do {
        	menu();
        	opc = leerEntero("");
        	switch(opc) {
        		case 1:
        			msgRest("El area del circulo es de: "+areaCirculo(leerDecimal("Ingrese el radio del circulo: ")));
        			break;
        		case 2:
        			msgRest("El area del cuadrado es de: "+areaCuadrado(leerDecimal("Ingrese el lado del cuadrado: ")));
        			break;
        		case 3:
        			msgRest("El area del rectangulo es de: "+areaRectangulo(leerDecimal("Ingrese el largo del rectangulo: "), leerDecimal("Ingrese el ancho del rectangulo: ")));
        			break;
        		case 4:
        			msgRest("El area del triangulo es de: "+areaTriangulo(leerDecimal("Ingrese la base del triangulo: "), leerDecimal("Ingrese la altura del triangulo: ")));
        			break;
        		case 5:
        			System.out.println("Gracias por usar nuestra calculadora Chaito <3");
        			break;
        		default:
        			System.out.println("Ingrese una de las opciones del menu.");
        			break;
        	}
        }while(opc != 5);
    }
    // Área = pi por radio al cuadrado.
    public static Double areaCirculo(Double radio) {Double area; if(radio != 0) { area = 3.1416 * (radio * radio);}else{area = null; }return area;}
    // Area = lado por lado.
    public static Double areaCuadrado(Double lado) {Double area; if(lado != 0) {area = lado * lado;}else {area=null;} return area;}
    // Area = largo por ancho.
    public static Double areaRectangulo(Double largo, Double ancho) {Double area; if(largo != 0 && ancho != 0) { area = largo * ancho;}else {area = null;} return area;}
    // Area = base por altura entre 2.
    public static Double areaTriangulo(Double base, Double altura) {Double area; if(base != 0 && altura != 0) {area = (base * altura) / 2;} else {area = null;} return area;}
    private static void msgRest(String msg) {System.out.println(msg);}
    private static int leerEntero(String msg) {System.out.println(msg);return leer.nextInt();}
    private static Double leerDecimal(String msg) {System.out.println(msg);return leer.nextDouble();}
    private static void menu() {System.out.println("\t\tMENU\n"+" 1. Area de un Circulo\n"+" 2. Area de un Cuadrado\n"+" 3. Area de un Rectangulo\n"+" 4. Area de un triangulo\n"+ " 5. Salir\n"+ "Elija una de las opciones del menu: "); }
}