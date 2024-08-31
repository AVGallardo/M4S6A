package Calculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculo {
    Persona person =  new Persona();
    ArrayList<Persona> personList = new ArrayList<Persona>();
    Scanner sc = new Scanner(System.in);
    String user;
    String password;
    boolean isEntry = true;
    int optionMenu = 0;

    public void login(){

        fill();

        while(isEntry){
            System.out.println("Ingrese su usuario");
            user = sc.nextLine();
            System.out.println("Ingrese su password");
            password = sc.nextLine();
            person.setUsuario(user);
            person.setContrasena(password);

            if (!personList.contains(person)) {
                System.out.println("Información ingresada no es correcta, favor reingrese" );
            } else  {
                System.out.println("Bienvenido " +person.getUsuario());
                isEntry = false;
                menu();
            }
        }

    }

    private void fill() {
        person = new Persona("AVeas","contraUno2");
        personList.add(person);
        person = new Persona("AGallardo","contraDos3");
        personList.add(person);
        person = new Persona("ALeon","contraTres4");
        personList.add(person);
        person = new Persona("mTuk","contraCuatro5");
        personList.add(person);
        person = new Persona("fHed","contraCinco6");
        personList.add(person);
//        person = new Persona();
        System.out.println(personList.toString());
    }

    private void menu(){
       while (optionMenu != 4){
           System.out.println("Que desea realizar?");
           System.out.println("1.- Raiz cuadrada");
           System.out.println("2.- Valor de π");
           System.out.println("3.- Potencia");
           System.out.println("4.- Salir");
           optionMenu = sc.nextInt();

           switch (optionMenu){
               case 1:
                   squareRoot();
                   break;
               case 2:
                   System.out.println("Pi es: " + Math.PI);
                   break;
               case 3:
                   squared();
                   break;
               case 4:
                   System.out.println("Gracias por su uso. Vuelva pronto");
                   break;
           }
       }


    }

    private void squareRoot () {
        System.out.println("Ingrese el numero a calcular");
        double numSR = sc.nextInt();
        numSR = Math.sqrt(numSR);
        System.out.println("La raiz del numero cuadrada es: " + numSR);
    }

    private void  squared() {
        System.out.println("Ingrese el numero a calcular");
        double numS = sc.nextInt();
        numS = Math.pow(numS,2);
        System.out.println("La potencia del numero cuadrada es: " + numS);
    }
}
