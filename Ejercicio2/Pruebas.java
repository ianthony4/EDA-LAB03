public class Pruebas{
  public static void main(String[] args){
    Pila<String> libros = new Pila<String>();
    if(libros.empty())
      System.out.println("Esta vacío");
    // ingresar elmentos
    String test = libros.push("Calculo I");
    System.out.println(test);
    System.out.println("Elemento " + test + " agregado en " + libros);

  }
}
