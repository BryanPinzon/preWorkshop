import java.time.LocalDate;
import java.util.Date;

public class Hospital {

    private LocalDate fechaCita;

    private int valorBase;


    public Hospital(Especialidad especialidad, Usuario usuario, LocalDate fechaCita){
        this.fechaCita=fechaCita;
        if (usuario.obtenerTipo()=="EPS"){
            this.valorBase = 30000;
        } else if (usuario.obtenerTipo()=="PARTICULAR") {
            this.valorBase=40000;
        }else if (usuario.obtenerTipo()=="POLIZA"){
            this.valorBase=70000;
        }

    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }
    public int getValorBase(){
        return valorBase;

    }

    public void getCita(Especialidad especialidad, Usuario usuario){
        System.out.println("El usario " + usuario.getNombre() + " con apellido "+ usuario.getApellido() + " con cedula numero " + usuario.getCedula() + " y de tipo " + usuario.obtenerTipo() +  "  tiene una cita en la especialidad: " + especialidad.getNombre() + " con un costo de: " + valorBase );
        System.out.println("Las especificaciones de la cita seran llegadas al correo: " + usuario.getCorreoElectronico());
        System.out.println("La fecha de cita es:" + getFechaCita());
        System.out.println("El codigo de su cita es: " + especialidad.getCodigo());

    }


}
