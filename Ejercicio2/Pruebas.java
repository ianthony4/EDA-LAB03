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
    libros.push("Ingles");
    libros.push("Biologia");
    System.out.println(test);
    test = libros.peek();
    System.out.println(test);
    System.out.println("Pila: " + libros);
    String element = "Calculo II";
    int index = libros.search(element);
    System.out.println(element + " esta en la posicion " + index);
    element = "Ingles";
    index = libros.search(element);
    System.out.println(element + " esta en la posicion " + index);
    element = "Filosofia";
    index = libros.search(element);
    System.out.println(element + " esta en la posicion " + index);
    element = "Frances";
    index = libros.search(element);
    System.out.println(element + " esta en la posicion " + index);
    String item = libros.pop();
    System.out.println("Elemento " + item + " eliminado de " + libros);
    item = libros.pop();
    System.out.println("Elemento " + item + " eliminado de " + libros);
    item = libros.pop();
    System.out.println("Elemento " + item + " eliminado de " + libros);
    item = libros.pop();
    System.out.println("Elemento " + item + " eliminado de " + libros);

  }
}
