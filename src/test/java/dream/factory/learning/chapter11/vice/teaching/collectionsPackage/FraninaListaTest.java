package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

import dream.factory.learning.chapter11.vice.teaching.collections.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraninaListaTest {

    @Test
    public void print_hugelist(){
        FraninaLista lista = new FraninaLista();

        for(int i = 0; i < 100_000; i++){
            lista.addToFirst(i);
        }

        assertEquals(100_000, lista.size());
    }

    @Test
    public void print_list(){
        FraninaLista lista = new FraninaLista();

        for(int i = 0; i < 10; i++){
            lista.addToFirst(i);
        }

        System.out.println(lista.toString());
    }

    @Test
    public void print_Emptylist(){
        FraninaLista lista = new FraninaLista();

        System.out.println(lista.toString());
    }

    @Test
    public void print_Lastlist(){
        FraninaLista lista = new FraninaLista();


        for(int i = 0; i < 10; i++){
            lista.addToLast(i);
        }

        System.out.println(lista.toString());
    }

    @Test
    public void zadnji_Element(){
        FraninaLista lista = new FraninaLista();
        assertEquals(null , lista.getLastNode());


        for(int i = 1; i < 10; i++){
            lista.addToLast(i);
        }

        assertEquals(9 , lista.getLastNode().getValue());
        assertEquals(9 , lista.size());

    }

    @Test
    public void prvi_Element(){
        FraninaLista lista = new FraninaLista();
        assertEquals(null , lista.getLastNode());


        for(int i = 1; i < 10; i++){
            lista.addToFirst(i);
        }

        assertEquals(1 , lista.getLastNode().getValue());
        assertEquals(9 , lista.size());

    }


}