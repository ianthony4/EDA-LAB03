public class Pruebas{
  public static void main(String[] args){
    Pila<String> libros = new Pila<String>();
    libros.push("Filosofia");
    System.out.println("Pila: " + libros);
    if(libros.empty())
      System.out.println("Esta vacío");
    // ingresar elmentos
    String test = libros.push("Calculo I");
    if(!libros.empty())
      System.out.println("No esta vacio");
    libros.push("Filosofia");
    libros.push("Biologia");
    System.out.println(test);
    System.out.println("Pila: " + libros);
    String item = libros.pop();
    System.out.println("Elemento " + item + " eliminado de " + libros);

  }
}
