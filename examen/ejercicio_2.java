import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        boolean salir=false;
        int dia_japon=0;
        int dia_espana=0;
        while (salir==false) {
            System.out.println("Cual es tu país de origen?\n" +
                    "España apreta 1.\n" +
                    "Japón apreta 2");
            int pais= in.nextInt();
            while (pais!=1 && pais!=2){
                System.out.println("Lo siento tus valores no son correctos recuerda" +
                        "Cual es tu país de origen?\n" +
                        "España apreta 1.\n" +
                        "Japón apreta 2");
                pais= in.nextInt();
            }
            System.out.println("Ahora dime el dia de la semana.\n" +
                    "Lunes apreta 1\n" +
                    "Martes apreta 2\n" +
                    "Miercoles apreta 3\n" +
                    "Jueves apreta 4\n" +
                    "Viernes apreta 5\n" +
                    "Sabado apreta 6\n" +
                    "Domingo apreta 7\n");
            int dia= in.nextInt();
            while (dia<1 && dia>7){
                System.out.println("Tu valor no es correcto, recuerda" +
                        "Ahora dime el dia de la semana.\n" +
                        "Lunes apreta 1\n" +
                        "Martes apreta 2\n" +
                        "Miercoles apreta 3\n" +
                        "Jueves apreta 4\n" +
                        "Viernes apreta 5\n" +
                        "Sabado apreta 6\n" +
                        "Domingo apreta 7\n");
            }
            dia_japon=dia;
            dia_espana=dia;
            System.out.println("Dime la hora (formato 00 a 23");
            int hora= in.nextInt();
            while (hora<0 && hora>23){
                System.out.println("Tu valor no es correcto, recuerda debe de ir de 00 a 23");
                hora= in.nextInt();
            }
            System.out.println("Dime los minutos (formato 00 a 59");
            int minuto= in.nextInt();
            while (minuto<0 && minuto>59){
                System.out.println("Tu valor no es correcto, recuerda debe de ir de 00 a 59");
                minuto= in.nextInt();
            }

            switch (pais){
                case 1->{
                    int hora_japon=hora+8;
                    if (hora_japon>23){
                        hora_japon=hora_japon-24;
                        dia_japon++;
                    }
                    if (dia_japon>7){
                        dia_japon=1;
                    }
                    switch (dia){
                        case 1->{
                            if (dia_japon==dia){
                            System.out.println("En España es lunes y hora " + hora + ":" + minuto +" \n" +
                                    "Y en Japón es lunes y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es lunes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es martes y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 2 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es martes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es martes y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es martes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es miercoles y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 3 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es miercoles y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es miercoles y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es miercoles y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es jueves y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 4 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es jueves y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es jueves y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es jueves y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es viernes y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 5 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es viernes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es viernes y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es viernes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es sabado y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 6 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es sabado y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es sabado y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es sabado y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es domingo y hora " + hora_japon + ":" + minuto);
                            }
                        }
                        case 7 ->{
                            if (dia_japon==dia){
                                System.out.println("En España es domingo y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es domingo y hora " + hora_japon + ":" + minuto);
                            } else {
                                System.out.println("En España es domingo y hora " + hora + ":" + minuto +" \n" +
                                        "Y en Japón es lunes y hora " + hora_japon + ":" + minuto);
                            }
                        }

                    }

                }
                case 2->{
                    int hora_espana=hora-8;
                    if (hora_espana<00) {
                        int contador = hora_espana;
                        for (int i = 1; contador == 0; i++) {
                            contador++;
                        }
                        hora_espana = 24 - (-contador);
                        dia_espana--;
                    }

                    if (dia_espana<1){
                        dia_espana=7;
                    }
                    switch (dia){
                        case 1->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es lunes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es lunes y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es lunes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es domingo y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 2 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es martes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es martes y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es martes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es lunes y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 3 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es miercoles y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es miercoles y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es miercoles y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es martes y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 4 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es jueves y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es jueves y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es jueves y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es miercoles y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 5 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es viernes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es viernes y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es viernes y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es jueves y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 6 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es sabado y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es sabado y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es sabado y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es viernes y hora " + hora_espana + ":" + minuto);
                            }
                        }
                        case 7 ->{
                            if (dia_espana==dia){
                                System.out.println("En Japón es domingo y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es domingo y hora " + hora_espana + ":" + minuto);
                            } else {
                                System.out.println("En Japón es domingo y hora " + hora + ":" + minuto +" \n" +
                                        "Y en España es sabado y hora " + hora_espana + ":" + minuto);
                            }
                        }

                    }

                }
            }
            System.out.println("¿Quieres salir?\n" +
                    "Sí apreta 1.\n" +
                    "No aprieta 2.\n");
            int opcion_salir=in.nextInt();
            while (opcion_salir!=1 && opcion_salir!=2){
                System.out.println("Tus valores no son correctos recuerda.\n" +
                        "¿Quieres salir?\n" +
                        "Sí apreta 1.\n" +
                        "No aprieta 2");
                opcion_salir=in.nextInt();
            }
            if (opcion_salir==1){
                salir=true;
            }
        }
        System.out.println("Adios");
    }
}
