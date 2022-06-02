package cl.personal;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(39);
        persona.setNombre("Rodrigo");
        persona.setTelefono("+56912345678");

        System.out.println("Nombre: "+persona.getNombre() + ", Edad: " + persona.getEdad() + ", Teléfono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}