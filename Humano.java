package parcial_3;

public abstract class Humano {
    private String name;
    private boolean male;
    private boolean adult;
    private boolean alive;
    private boolean illness;

    public Humano(String name, boolean male, boolean adult, boolean alive, boolean illness) {
        this.name = name;
        this.male = male;
        this.adult = adult;
        this.alive = alive;
        this.illness = illness;
    }

    public abstract void get_Information();

    public String get_Name() {
        return this.name;
    }
    public boolean get_GenderN()   {
        return male;
    }
    public boolean get_AgeN()  {
        return adult;
    }
    public boolean get_StateN()    {
        return alive;
    }
    public boolean get_HealthN()   {
        return illness;
    }
    public void get_Gender()   {
        if (this.male)   {
            System.out.println("Masculino");
        }
        else {
            System.out.println("Femenino");
        }
    }
    public void get_Age()  {
        if (this.adult)   {
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
    }
    public void get_State()    {
        if (this.alive)   {
            System.out.println("Vivo");
        }
        else {
            System.out.println("Muerto");
        }
    }
    public void get_Health()   {
        if (this.illness)   {
            System.out.println("Enfermo");
        }
        else {
            System.out.println("Sano");
        }
    }
    public void set_Name(String name)  {
        this.name = name;
    }
    public void set_Gender(Boolean male)  {
        this.male = male;
    }
    public void set_Age(Boolean adult)  {
        this.adult = adult;
    }
    public void set_State(Boolean alive)  {
        this.alive = alive;
    }
    public void set_Health(Boolean illness)  {
        this.illness = illness;
    }
}
