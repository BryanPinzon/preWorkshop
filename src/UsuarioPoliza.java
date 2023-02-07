public class UsuarioPoliza extends Usuario{

    public UsuarioPoliza(String nombre, String apellido, String cedula, String correoElectronico){
        super(nombre, apellido, cedula, correoElectronico);
    }
    @Override
    public String obtenerTipo(){
        return "POLIZA";
    }
}
