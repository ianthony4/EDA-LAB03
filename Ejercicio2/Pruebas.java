public class Pruebas{
  public static void main(String[] args){
    Pila<String> libros = new Pila<String>();
    // Prueba metodo empty()
    if(libros.empty())
      System.out.println("Esta vacío");
    // Prueba metodo push()
    libros.push("Filosofia");
    // Metodo toString()
    System.out.println("Pila: " + libros);
    // Ingresar elementos con push()
    String test = libros.push("Calculo I");
    System.out.println("Elemento agregado: " + test);
    // Metodo empty() otra prueba
    if(!libros.empty())
      System.out.println("No esta vacio");
    // push() sin variable asignada
    libros.push("Ingles");
    libros.push("Biologia");
    // Prueba metodo peek()
    test = libros.peek();
    System.out.println("El elemento encima es " + test);
    // Pila estado final
    System.out.println("Pila: " + libros);
    // Pruebas metodo search()
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
    // Pruebas metodo pop()
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
