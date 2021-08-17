public class Ave extends Animal{
    private String colorPlumas;
    private boolean vuela;

    public Ave(String nombre, int edad, String colorPlumas, boolean vuela) {
        //super (...)hace referencia al constructor de la clase madre
        super(nombre, edad);
        this.colorPlumas = colorPlumas;
        this.vuela = vuela;
    }

    public String getColorPlumas (){
        return this.colorPlumas;
    }

    public boolean getVuela (){
        return this.vuela;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public void setVuela (boolean vuela){
        this.vuela = vuela;
    }

    //sobreescribe el metodo de Animal.comer()
    //ya no come como animal
    public void comer() {
        //super. se refiere a un atributo o metodo (publico o privado)
        //de la clase madre
        System.out.println(super.nombre + " come como ave");
        this.comio = true;
    }

    public void dormir (){
        System.out.println(super.getNombre() + " duerme como ave");
    }
}
