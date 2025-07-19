
public class Veterinaria {
    //Para el segundo commit
    public static void main(String[] args) {
        Mascota m1 = new Clasificacion("Chester", "Perro", 5, true);
        Mascota m2 = new Clasificacion("Colmillo", "Perro", 4, false);
        Mascota m3 = new Clasificacion("Paco", "Loro", 2, true);
        
        m1.mostrarInformacion();
        m2.mostrarInformacion();
        m3.mostrarInformacion();
    }
}
