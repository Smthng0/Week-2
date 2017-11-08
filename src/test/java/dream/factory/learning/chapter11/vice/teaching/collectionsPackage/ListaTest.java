package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListaTest {

    @Test
    public void print_hugelist(){
        Lista lista = new Lista();

        for(int i = 0; i < 100_000; i++){
            lista.addToFirst(i);
        }

        assertEquals(100_000, lista.size());
    }

    @Test
    public void print_list(){
        Lista lista = new Lista();

        for(int i = 0; i < 10; i++){
            lista.addToFirst(i);
        }

        System.out.println(lista.toString());
    }

    @Test
    public void print_Emptylist(){
        Lista lista = new Lista();

        System.out.println(lista.toString());
    }

    @Test
    public void print_Lastlist(){
        Lista lista = new Lista();


        for(int i = 0; i < 10; i++){
            lista.addToLast(i);
        }

        System.out.println(lista.toString());
        System.out.println(lista.getLastNode().toString());
    }

    @Test
    public void zadnji_Element(){
        Lista lista = new Lista();
        assertEquals(null , lista.getLastNode());


        for(int i = 1; i < 10; i++){
            lista.addToLast(i);
        }


        assertEquals(9 , lista.getLastNode().getValue());
        assertEquals(9 , lista.size());

    }

    @Test
    public void prvi_Element(){
        Lista lista = new Lista();
        assertEquals(null , lista.getLastNode());

        lista.addToFirst(15);

        for(int i = 2; i < 10; i++){
            lista.addToFirst(i);
        }

        assertEquals(15 , lista.getLastNode().getValue());
        assertEquals(9 , lista.size());

    }

    @Test
    public void konbinacija_Element(){
        Lista lista = new Lista();
        assertEquals(null , lista.getLastNode());

        lista.addToFirst(15);
        assertEquals(15 , lista.getLastNode().getValue());
        

        for(int i = 2; i < 10; i++){
            lista.addToFirst(i);
        }

        lista.addToLast(10);
        lista.addToFirst(4);
        lista.addToLast(8);

        assertEquals(8 , lista.getLastNode().getValue());
        assertEquals(12 , lista.size());

    }

}