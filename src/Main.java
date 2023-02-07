import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioEps = new UsuarioEps("Mario","Lopez","84831","mariolopez@gmail.com");
        Especialidad medicinaGeneral = new MedicinaGeneral("Odontologia","321","General");
        Hospital cita1 = new Hospital(medicinaGeneral, usuarioEps, LocalDate.parse("2023-05-15"));
        System.out.println("=====================");
        cita1.getCita(medicinaGeneral, usuarioEps);
        System.out.println("=====================");
        Usuario usuarioParticular = new UsuarioParticular("Ricardo", "Mazo","41245","ricardomazo@gmail.com");
        Especialidad medicinaInterna  = new MedicinaInterna("Cardiologia","8512","Interna");
        Hospital cita2 = new Hospital(medicinaInterna, usuarioParticular, LocalDate.parse("2023-06-21"));
        cita2.getCita(medicinaInterna, usuarioParticular);
        System.out.println("=====================");
        Usuario usuarioPoliza = new UsuarioPoliza("Enrique", "Pinzon","12845","enrique@gmail.com");
        Especialidad medicinaDeporte = new MedicinaDeporte("Muscular","5912","Deporte");
        Hospital cita3 = new Hospital(medicinaDeporte, usuarioPoliza, LocalDate.parse("2023-05-12"));
        cita3.getCita(medicinaDeporte, usuarioPoliza);




    }
}