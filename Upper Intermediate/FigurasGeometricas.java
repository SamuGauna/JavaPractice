import java.util.Scanner;

public class FigurasGeometricas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Elegi la figura geometrica que deseas calcular?");
        System.out.println("1-Triangulo");
        System.out.println("2-Circulo");
        System.out.println("3-Paralelogramo");
        Scanner scanner = new Scanner(System.in);
        int resp = scanner.nextInt();
        if(resp ==1){
            Triangulo();
        } else if (resp==2){
            Circulo();
        } else if(resp==3){
            Paralelogramo();
        } else {
            System.out.println("No elegiste ninguna opcion correcta");
        }
        
    }


    public static void Triangulo(){
        
        
        
        do {
            System.out.println("Deseas Calcular el 1-Perimetro o 2- Area?");
            int opcionT = scanner.nextInt();
            switch (opcionT) {
                case 1:
                System.out.println("Dime los lados para calcular el perimetro");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                System.out.println("El perimetro del triangulo es de " + (num1 + num2 + num3));
                    break;
                case 2:
                System.out.println("Dime la base y altura");
                int base = scanner.nextInt();
                int altura = scanner.nextInt();
                System.out.println("Su area es de :" + (base*altura)/2);
                break;
                case 0:
                break;
            }
        } while (opcionT != 0 );
    }
   
     public static void Circulo(){
        int opcionT = 0;
        System.out.println("Deseas Calcular el 1-Perimetro o 2- Area?");
        do {
            switch (opcionT) {
                case 1:
                System.out.println("Cual es el radio del circulo");
                int radio = scanner.nextInt();
                System.out.println("El perimetro del triangulo es de " + 2 * Math.PI * radio);
                    break;
                case 2:
                System.out.println("Cual es el radio");
                Double radioArea = scanner.nextDouble();
                Double total = Math.PI * (radioArea*radioArea);
                System.out.println("Su area es de :" + total);
                break;
            }
        } while (opcionT != 0 );
    }
     public static void Paralelogramo(){
        int opcionT = 0;
        System.out.println("Deseas Calcular el 1-Perimetro o 2- Area?");
        do {
            switch (opcionT) {
                case 1:
                System.out.println("Cuales son los lados");
                int lado1 = scanner.nextInt();
                int lado2 = scanner.nextInt();
                System.out.println("El perimetro del paralelogramo es de " + 2 *(lado1+lado2));
                break;
                case 2:
               System.out.println("Dime la base y altura");
                int base = scanner.nextInt();
                int altura = scanner.nextInt();
                System.out.println("Su area es de :" + (base*altura));
                break;
            }
        } while (opcionT != 0 );
    }
    
    
    
    
   
}
