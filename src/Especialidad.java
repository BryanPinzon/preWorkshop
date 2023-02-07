public class Especialidad {
    private String nombre;
    private String codigo;
    private String tipoEspecialidad;


    public Especialidad(String nombre, String codigo, String tipoEspecialidad){
        this.nombre=nombre;
        this.codigo=codigo;
        this.tipoEspecialidad=tipoEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }
}
