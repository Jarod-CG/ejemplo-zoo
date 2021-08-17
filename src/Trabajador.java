public class Trabajador {
    private String nombre;
    private int carnet;

    public Trabajador (String nombre, int carnet){
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCarnet(){
        return this.carnet;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setCarnet (int carnet){
        this.carnet = carnet;
    }

    public void alimentar (Animal animal){
        System.out.println(animal.getNombre() + " es alimentado por " + this.nombre);
        animal.setComio(true);
    }
}
