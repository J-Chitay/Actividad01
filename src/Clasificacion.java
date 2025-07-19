
public class Clasificacion extends Mascota {
    
    public Clasificacion(String nombre, String especie, int edad, boolean vacunado){
        super(nombre, especie, edad, vacunado);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad: " + getEdad());
        System.out.println("Vacunado: " + (getVacunado() ? "Si" : "No"));
        System.out.println("-------------------------");
    }

}
