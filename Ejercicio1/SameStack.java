
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
        int rpta = 0;
        for (int i = 0; i < ha.length; i++) {
            for (int j = 0; j < hb.length; j++) {
                for (int k = 0; k < hc.length; k++) {
                    if (sumaSinElemento(ha, i) == sumaSinElemento(hb, j) && sumaSinElemento(hb, j) == sumaSinElemento(hc, k) && sumaSinElemento(ha, i) == sumaSinElemento(hc, k)) {
                        rpta = sumaSinElemento(ha, i);
                    }
                }
            }
        }
        return rpta;
    }
    //Funcion que deveulve la suma sin un elemento del vector
    public static int sumaSinElemento(int[] hx, int idx) {
        int[] arrAux = new int[hx.length - 1];
        for (int i = 0, j = 0; i < hx.length; i++) {
            if (idx != i) {
                arrAux[j] = hx[i];
                j++;
            }
        }
        int sumaTotal = sumatorio(arrAux);
        return sumaTotal;
    }
    //devuelve la sumatoria TOTAL de un arreglo
    public static int sumatorio(int[] hx) {
        int suma = 0;
        for (int i = 0; i < hx.length; i++) {                
            suma += hx[i];
        }
        return suma;
    }    
}