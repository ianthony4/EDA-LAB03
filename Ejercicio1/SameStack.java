
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
        //definimos las sumas
        int resultado = 0;
        //Creamos los arreglos que cuentan con una suma acumulada por cada nivel
        int[] sumA = sumaxNivel(ha);
        int[] sumB = sumaxNivel(hb);
        int[] sumC = sumaxNivel(hc);
        //Recorremos los 3 arreglos en busca de alturas iguales
        for(int i=0;i<sumA.length;i++){
            for(int j=0;j<sumB.length;j++){
                for(int k=0;k<sumC.length;k++){
                    //cuando encuentre alturas iguales se rompe el ciclo
                    if(sumA[i]==sumB[j]&&sumB[j]==sumC[k]){
                        //Elejimos el indice (en esa iteracion) de cualquier arreglo
                        //debido a que sera el mismo resultado
                        resultado = sumA[i];
                        break;
                    }
                }
            }
        }
        return resultado;
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