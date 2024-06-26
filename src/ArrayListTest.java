
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[]args)
    {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("este e o array 0");
        lista.add("este e o array 1");
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        lista.set(0,"este e o array 0 modificado");
        System.out.println(lista.get(0));
        lista.set(1,"este e o array 1 modificado");
        System.out.println(lista.get(1));
        System.out.println("A lista de array tem "+lista.size()+" de comprimento");
    }
}