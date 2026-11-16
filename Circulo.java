import java.util.Scanner;
public class Circulo {
    double radio= 0.0;

    public double solicitarRadio(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Escribe el radio del circulo: ");
            if (sc.hasNextDouble()) {
                radio= sc.nextDouble();
                break;
            }else{
                System.out.println("No es valido!! Intenta de nuevo: ");
                sc.nextLine();
            }  
        }
        sc.close();
        return radio;
    }
    public double calcularArea(){
        double area= 3.14 * (this.radio * this.radio);
        return area;
    }
    public static void main(String[] args) {
        Circulo circulo= new Circulo();
        circulo.solicitarRadio();
        double areaCirculo= circulo.calcularArea();
        System.out.println("El area del circulo es: "+ areaCirculo);   
    }
}
