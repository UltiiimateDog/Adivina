package parcial_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Menu {
    String user_name;
    Scanner scan = new Scanner(System.in);

    public void makeUser()  {
        System.out.println("Ingresa tu nombre.");
        this.user_name = scan.nextLine();
        File player = new File("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Usuarios", user_name + ".txt");
        if (player.exists())    {
            try (FileReader fileReader = new FileReader(player)) {
                BufferedReader bufReader = new BufferedReader(fileReader);
                System.out.println("Jugador: " + player.getName());
                System.out.println("Juegos ganados: " + bufReader.readLine());
                System.out.println("Juegos perdidos: " + bufReader.readLine());
                bufReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                player.createNewFile();
                PrintWriter writer = new PrintWriter("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Usuarios\\"+ user_name + ".txt");
                writer.println("0");
                writer.println("0");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        scan.nextLine();
    }
    public void victorias(boolean win) {//Por revisar 
        String numero;
        File player = new File("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Usuarios", user_name + ".txt");
        try (FileReader fileReader = new FileReader(player)) {
            BufferedReader bufReader = new BufferedReader(fileReader);
            numero = bufReader.readLine();
            int victorias = Integer.parseInt(numero);
            numero = bufReader.readLine();
            int derrotas = Integer.parseInt(numero);
            bufReader.close();
            fileReader.close();
            PrintWriter writer = new PrintWriter("C:\\Users\\Alan\\Documents\\UDLAP\\2 Semestre\\POO\\parcial_3\\Usuarios\\"+ user_name + ".txt");
            if(win) {
                victorias++;
            }
            else    {
                derrotas++;
            }
            String Rvictorias = String.valueOf(victorias);
            String Rderrotas = String.valueOf(derrotas);
            writer.println(Rvictorias);
            writer.println(Rderrotas);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
