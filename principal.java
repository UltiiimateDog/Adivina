package parcial_3;

import java.util.Random;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.makeUser();
        Random rand = new Random();
        Persona[] variantes = new Persona[16];
        variantes[0] = new Persona(null, false, false, false, false, 0);
        variantes[1] = new Persona(null, false, false, false, true, 1);
        variantes[2] = new Persona(null, false, false, true, false, 2);
        variantes[3] = new Persona(null, false, false, true, true, 3);
        variantes[4] = new Persona(null, false, true, false, false,4 );
        variantes[5] = new Persona(null, false, true, false, true, 5);
        variantes[6] = new Persona(null, false, true, true, false, 6);
        variantes[7] = new Persona(null, false, true, true, true, 7);
        variantes[8] = new Persona(null, true, false, false, false, 8);
        variantes[9] = new Persona(null, true, false, false, true, 9);
        variantes[10] = new Persona(null, true, false, true, false, 10);
        variantes[11] = new Persona(null, true, false, true, true, 11);
        variantes[12] = new Persona(null, true, true, false, false, 12);
        variantes[13] = new Persona(null, true, true, false, true, 13);
        variantes[14] = new Persona(null, true, true, true, false, 14);
        variantes[15] = new Persona(null, true, true, true, true, 15);
        String[] nombres = {"Jose", "Marco", "Alan", "Ian", "Maria", "Elizabeth", "Casie", "Juan", "Pedro", "Natalia", "Camila", "Concepcion"};
        Persona[] people = new Persona[10];
        people[0] = new Persona(null, false, false, false, false,0);
        people[1] = new Persona(null, false, false, false, false,1);
        people[2] = new Persona(null, false, false, false, false,2);
        people[3] = new Persona(null, false, false, false, false,3);
        people[4] = new Persona(null, false, false, false, false,4);
        people[5] = new Persona(null, false, false, false, false,5);
        people[6] = new Persona(null, false, false, false, false,6);
        people[7] = new Persona(null, false, false, false, false,7);
        people[8] = new Persona(null, false, false, false, false,8);
        people[9] = new Persona(null, false, false, false, false,9);
        int a;
        int[] usados = new int[10];
        boolean usado = false;
        int contHombre = 0;
        int contEdad = 0;
        int contVivo = 0;
        int contEnfermo = 0;
        for (int i = 0; i < 10; i++)    {
            people[i].set_Name(nombres[rand.nextInt(12)]);
            do{
                a = rand.nextInt(16);
                for(int j = 0; j < 10; j++) {
                    if (a == usados[j] && i != j)  {
                        usado = true;
                        break;
                    }
                    else {
                        usado = false;
                    }
                }
            } while(usado);
            people[i].set_Age(variantes[a].get_AgeN());
            people[i].set_Gender(variantes[a].get_GenderN());
            people[i].set_State(variantes[a].get_StateN());
            people[i].set_Health(variantes[a].get_HealthN());
            usados[i] = a;
            if(people[i].get_GenderN()) {
                contHombre++;
            }
            if(people[i].get_AgeN()) {
                contEdad++;
            }
            if(people[i].get_StateN()) {
                contVivo++;
            }
            if(people[i].get_HealthN()) {
                contEnfermo++;
            }
        }

        for (int i = 0; i < 10; i++)    {
            people[i].get_Information();
            System.out.println("");
        }
        System.out.println("Hombres: " + contHombre);
        System.out.println("Mayores de edad: " + contEdad);
        System.out.println("Vivos: " + contVivo);
        System.out.println("Enfermos: " + contEnfermo);

        int elegido = rand.nextInt(10);
        int select;
        int preguntas = 0;
        boolean[] pool = {true,true,true,true,true,true,true,true,true,true};
        try (Scanner scan = new Scanner(System.in)) {
            boolean uno=true;
            boolean dos=true;
            boolean tres=true;
            boolean cuatro=true;

            while(preguntas < 3)  {
                do  {
                    System.out.println("\nSeleccione su pregunta.");
                    if(uno) {
                        System.out.println("1) Es hombre");
                    }
                    if(dos) {
                        System.out.println("2) Es mayor de edad");
                    }
                    if(tres) {
                        System.out.println("3) Esta vivo");
                    }
                    if(cuatro) {
                        System.out.println("4) Esta enfermo");
                    }
                    select = scan.nextInt();
                    } while(select < 1 || select > 4);
                switch (select) {
                    case 1:
                        uno = false;
                        preguntas++;
                        for(int i = 0; i < 10; i++) {
                            if(people[elegido].get_GenderN() != people[i].get_GenderN())    {
                                pool[i] = false;
                            }
                        }
                        people[elegido].get_Gender();
                        break;
                    case 2:
                        dos = false;
                        preguntas++;
                        for(int i = 0; i < 10; i++) {
                            if(people[elegido].get_AgeN() != people[i].get_AgeN())    {
                                pool[i] = false;
                            }
                        }
                        people[elegido].get_Age();
                        break;
                    case 3:
                        tres = false;
                        preguntas++;
                        for(int i = 0; i < 10; i++) {
                            if(people[elegido].get_StateN() != people[i].get_StateN())    {
                                pool[i] = false;
                            }
                        }
                        people[elegido].get_State();
                        break;
                    case 4:
                        cuatro = false;
                        preguntas++;
                        for(int i = 0; i < 10; i++) {
                            if(people[elegido].get_HealthN() != people[i].get_HealthN())    {
                                pool[i] = false;
                            }
                        }
                        people[elegido].get_Health();
                        break;
                    default:
                        break;
                }
            }
            for(int i = 0; i < 10; i++) {
                if(pool[i]) {
                    people[i].get_Information();
                }
            }
            System.out.println("Seleccione al sujeto");
            for (int i = 0; i < 10; i++)    {
                if(pool[i]) {
                    System.out.println(i);
                }
            }
            select = scan.nextInt();
        }
        if(people[elegido].get_number() == people[select].get_number())   {
            System.out.println("Ganaste");
            menu.victorias(true);
        }
        else {
            System.out.println("Perdiste");
            menu.victorias(false);
        }
    }
}
