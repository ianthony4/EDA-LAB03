
public class SameStack{
        public static void main(String[] args){
            int[] h1 = {1,1,1,2,3};
            int[] h2 = {2,3,4};
            int[] h3 = {1,4,1,1};

            
        }
        //Funcion que calculara que las alturas de los vectores sean igualews
        public static int equalStack(int[] ha, int[] hb, int[] hc){
            return 0;
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

        public static int sumatorio(int[] hx) {
            int suma = 0;
            for (int i = 0; i < hx.length; i++) {
                suma += hx[i];
            }
            return suma;
        }
    

}