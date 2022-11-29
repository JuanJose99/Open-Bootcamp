public class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {

        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

public class Cliente extends Persona {

    private int credito;

    public Cliente(int edad, String nombre, String telefono) {

        super(23, "Juan", "155555");
        credito = 250000;
    }

    public void mostraValores() {
        System.out.println("Edad" + getEdad() + " Nombre: " + getNombre() + " Telefono:" + getTelefono);
    }
    

}
