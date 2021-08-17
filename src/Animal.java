public class Animal implements IAnimal {
    //implements por ser IAnimal una interfaz

    //que sean protegidos asegura que las clases hijas tengan acceso
    protected String nombre;
    protected int edad;
    protected boolean comio;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.comio = false;
    }

    public Animal (int edad){
        this.edad = edad;
    }

    public String getNombre (){
        return this.nombre;
    }

    public int getEdad (){
        return this.edad;
    }

    public boolean getComio (){
        return this.comio;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public void setComio (boolean comio){
        this.comio = comio;
    }

    public void moverse (){
        System.out.println(this.nombre + " se mueve como animal");
    }

    @Override
    public void comer() {
        System.out.println(this.nombre + " come como animal");
        this.comio = true;
        
    }

    @Override
    public void dormir() {
        System.out.println("duerme como animal");
        
    }

    
}
