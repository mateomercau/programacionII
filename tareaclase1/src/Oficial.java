public class Oficial extends Operario{
    private String tareas;

    public Oficial(){
    }

    public Oficial(int dni, String nombre, String tareas) {
        super(dni, nombre);
        this.tareas = tareas;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
