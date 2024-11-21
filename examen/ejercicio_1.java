import java.util.Scanner;

public class ejercicio_1 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        boolean salir=false;
        while (salir==false) {
        System.out.println("----Menu----\n" +
                "Dime lo que deseas hacer diciendome su letra asignada\n" +
                "a -> Aprobados y suspendidos\n" +
                "b -> Billetes Madrid\n" +
                "c -> Salir");
            char opcion=in.next().charAt(0);
            while (opcion!='a'&& opcion!='b' && opcion!='c') {
            System.out.println("----Menu----\n" +
                    "Dime lo que deseas hacer diciendome su letra asignada\n" +
                    "a -> Aprobados y suspendidos\n" +
                    "b -> Billetes Madrid\n" +
                    "c -> Salir");
                    opcion = in.next().charAt(0);
            }
            switch (opcion) {
                    /*Aprobados y suspendidos */
                case 'a' -> {
                    System.out.println("Dime cuentas notas quieres comprobar");
                    int num = in.nextInt();
                    int aprobado = 0;
                    int suspendido = 0;
                    for (int i = 1; i <= num; i++) {
                        System.out.println("Dime la nota");
                        double nota = in.nextDouble();
                        while (nota>10 && nota<0){
                            System.out.println("Tu nota no es valida recuerda que solo puede ir del 0 al 10");
                            nota= in.nextDouble();
                        }
                        if (nota >= 5) {
                            aprobado++;
                        } else {
                            suspendido++;
                        }
                    }
                    System.out.println("Tienes " + aprobado + " aprobados y " + suspendido + " suspendidos");
                    if (suspendido < aprobado) {
                        System.out.println("Tienes más aprobados");
                    } else if (suspendido==aprobado) {
                        System.out.println("Tienes los mismos aprobados que suspendidos");
                    } else {
                            System.out.println("Tienes más suspendidos");
                        }
                }
                    /*Billetes*/
                case 'b' ->{
                    System.out.println("Cuantos billetes deseas");
                    double billetes= in.nextDouble();
                    int contador1=0;
                    int contador2=0;
                    int contador3=0;
                    int contador4=0;
                    int contador5=0;
                    double precio=32.0;
                    for (int i=1; i<=billetes; i++ ){
                            /*no entiendo porque no me deja escribir el nombre*/
                        System.out.println("Dime el nombre del viajero " + 1);
                        String nombre=in.nextLine();
                        System.out.println("Dime la edad de " + nombre);
                        int edad= in.nextInt();
                        System.out.println("edad " + edad );
                        if (edad>=65){
                            contador1++;
                        } else if (edad>=12 && edad<=15) {
                            contador2++;
                        } else if (edad>=4 && edad<=11) {
                            contador3++;
                        }else if (edad<4){
                            contador4++;
                        }else {
                            contador5++;
                        }
                    }
                    double oferta1=(precio-(0.10*precio));
                    double oferta2=(precio-(0.08*precio));
                    double oferta3=(precio-(0.35*precio));
                    double oferta4=0;
                    double precio_total=((oferta1*contador1)+(oferta2*contador2)+(oferta3*contador3)+(oferta4*contador4)+(contador5*precio));
                    System.out.println("Tus billetes cuesta " + precio_total + " euros");
                }
                    /*Salir*/
                case 'c' ->{
                    System.out.println("Adios");
                    salir=true;
                }
            }
        }
        in.close();
    }
}
