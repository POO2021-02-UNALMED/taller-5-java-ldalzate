package zooAnimales;
import gestion.Zona;

public class Animal {
    protected static int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero) {
        totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public Animal() {
        totalAnimales++;
    }

    public String movimiento() {return "desplazarse";}

    public static String totalPorTipo() {
        return ("Mamiferos: " + Mamifero.cantidadMamiferos() +"\n"
                +"Aves: " +Ave.cantidadAves() + "\n"
                +"Reptiles: "+Reptil.cantidadReptiles() +"\n"
                +"Peces: "+Pez.cantidadPeces() +"\n"
                +"Anfibios: "+Anfibio.cantidadAnfibios());
    }

    public String toString() {
        String retorno = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es "
                + genero;

        if(zona != null) {
            retorno += ", la zona en la que me ubico es " + zona +", en el " + zona.getZoo();
        }

        return retorno;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}