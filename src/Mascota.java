public abstract class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;
    
    public Mascota(String nombre, String especie, int edad, boolean vacunado){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunado = vacunado;
    }
    
    //Para Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
     //Para Especie
    public void setEspecie(String especie){
        this.especie= especie;
    }
    
    public String getEspecie(){
        return especie;
    }
    
     //Para Edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
     //Para Vacunado
    public void setVacunado(boolean vacunado){
        this.vacunado = vacunado;
    }
    
    public boolean getVacunado(){
        return vacunado;
    }
    
    public abstract void mostrarInformacion();
}
