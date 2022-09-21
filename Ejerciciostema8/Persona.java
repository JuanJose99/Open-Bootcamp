public class Persona {

    public static void main(String[] args) {
        
        Persona oPersona = new Persona();
            oPersona.setEdad(20);
            oPersona.setNombre("Juan");
            oPersona.setTelefono("123456789");
    
            System.out.println(oPersona.getEdad());
            System.out.println(oPersona.getNombre());
            System.out.println(oPersona.getTelefono());

    }

    private int edad;
        private String nombre;
        private String telefono;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return this.telefono;
        }
    
}
