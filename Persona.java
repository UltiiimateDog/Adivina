package parcial_3;

public class Persona extends Humano {
    private int number;

    public Persona(String name, boolean male, boolean adult, boolean alive, boolean illness,int num)    {
        super(name, male, adult, alive, illness);
        this.number = num;
    }

    public void get_Information()   {
        String name = get_Name();
        System.out.println("Numero: " + number);
        System.out.println("Nombre: " + name);
        System.out.print("Genero: ");
        get_Gender();
        System.out.print("Edad: ");
        get_Age();
        System.out.print("Estado: ");
        get_State();
        System.out.print("Salud: ");
        get_Health();
    }

    public int get_number() {
        return this.number;
    }
}
