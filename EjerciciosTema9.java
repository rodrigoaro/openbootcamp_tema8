package cl.personal;

public class EjerciciosTema9 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre = "Rodrigo";
        cliente.telefono = "9876-54321";
        cliente.setCredito(11223344);

        System.out.println("Cliente edad: "+cliente.edad+"\nCliente nombre: "+cliente.nombre
        +"\nCliente teléfono: "+cliente.telefono+"\nCliente crédito: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 50;
        trabajador.nombre = "Carlos";
        trabajador.telefono = "1234-54567";
        trabajador.setSalario(1000000);

        System.out.println("Trabajador edad: "+trabajador.edad+"\nTrabajador nombre: "+trabajador.nombre
        +"\nTrabajador teléfono: "+trabajador.telefono+"\nTrabajador salario: "+trabajador.getSalario());

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}