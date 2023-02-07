public abstract class Usuario  {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correoElectronico;

    public Usuario(String nombre, String apellido, String cedula, String correoElectronico){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula =cedula;
        this.correoElectronico=correoElectronico;

    }
    //create getters.
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getCedula(){
        return this.cedula;

    }
    public String getCorreoElectronico(){
        return this.correoElectronico;
    }


    //create method abstract obtenerTipo();
    public abstract String obtenerTipo();
}




