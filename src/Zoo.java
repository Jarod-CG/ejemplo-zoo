public class Zoo {
//modificadores de acceso : private, public, protected

/* 
    ver comentarios en Zoologico, IAnimal, Animal y Ave
*/

    public static void main(String[] args) throws Exception {
        Animal mini = new Animal("Mini", 7);
        mini.comer();
        Ave perico = new Ave("Perico", 2, "rojo", true);
        perico.dormir();
        //se instancia como Animal pero el new es de Anfibio
        //es por la herencia
        Animal sapito = new Anfibio("Sapito", 10, "celeste", true);
        sapito.moverse();
        System.out.println("********************");
        Zoologico zoo = new Zoologico("Simón Bolivar");
        zoo.addAnimales(mini);
        zoo.addAnimales(perico);
        zoo.addAnimales(sapito);
        //está agregando distintos clases a un solo arraylis
        //mini es Animal
        //perico es Ave y Animal (por herencia)
        //sapito es Anfibio y Animal (por herencia)
        zoo.alimentarAnimales();
        

    }
}
