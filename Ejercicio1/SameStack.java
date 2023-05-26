import java.util.Stack;
public class SameStack{
    public static void main(String[] args){
        //Creacion de las pilas
        Stack<Integer> h1 = new Stack<>();
        Stack<Integer> h2 = new Stack<>();
        Stack<Integer> h3 = new Stack<>();
        //Llenar pilas (apilacion)
        apilar(h1,h2,h3);
    }
    public static void apilar(Stack<Integer> ha, Stack<Integer> hb, Stack<Integer> hc){
        //Llenamos la pilas con el ejemplo propuesto en el ejercicio
        //Para h1 (ha)
        ha.push(1);
        ha.push(1);
        ha.push(1);
        ha.push(2);
        ha.push(3);
        //Para h2 (hb)
        hb.push(2);
        hb.push(3);
        hb.push(4);
        //para h3 (hc)
        hc.push(1);
        hc.push(4);
        hc.push(1);
        hc.push(1);
    }

}