public class Operario extends Empleado{
    private int dni;

    public Operario(){
    }

    public Operario(int dni, String nombre){
        super (nombre);
        this.dni= dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String toString(){
        return "";
    }
}
