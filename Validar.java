import java.util.Scanner;
public class Validar {

    public int solicitarNumero(){
        int numero = 0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe un numero entero ");
        while(true){
            if (sc.hasNextInt()){  //.hasNextInt revisa si la info que envieron se puede comvertir a un entero válido
                numero=sc.nextInt();
                break;     
            }else{
                System.out.println("No es valido!! Intnta de nuevo: ");
                sc.nextLine();
            }
        } 
        sc.close();
        return numero;
    }
    public static void main(String[] args) {
        Validar validar= new Validar();
        int numeroValido = validar.solicitarNumero();
        System.out.println("El numero: " + numeroValido + " es valido !!!");
    }
   
}
