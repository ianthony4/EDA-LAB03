
public class SameStack{
    public static void main(String[] args){
        int[] h1 = {1,1,1,2,3};
        int[] h2 = {2,3,4};
        int[] h3 = {1,4,1,1};
        //Corregir arroja 6
        System.out.println(equalStack(h1, h2, h3));
    }

    //Funcion que calculara que las alturas de los vectores sean igualews
    public static int equalStack(int[] ha, int[] hb, int[] hc){
        return 0;
    }
    //Altura incrementales, por nivel de un arreglo dado
    public static int[] sumaxNivel(int[] h){
        int[] sumIncremental = new int[h.length];
        int laSuma = 0;
        //recorremos todo el arreglo recolectando y acumulando la suma
        for(int i = 0;i<h.length;i++){
            laSuma += h[i];
            sumIncremental[i] = laSuma;
        }
        //retornamos el arreglo de sumas acumuladas
        return sumIncremental;
    }


}