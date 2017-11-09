package dream.factory.learning.collections;

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


        for(int i = 0; i < 15; i++){
            lista.addToLast(i);
        }

        System.out.println(lista.toString());
        System.out.println(lista.toStringTail());
        System.out.println(lista.getLastNode().getValue());
    }


    @Test
    public void wat(){
        Lista lista = new Lista();
        lista.addToFirst(2);
        lista.addToFirst(3);

        assertEquals(2, lista.getLastNode().getValue());
        assertEquals(3, lista.getFirstNode().getValue());

        lista.addToLast(5);

        assertEquals(5, lista.getLastNode().getValue());
        assertEquals(3, lista.getFirstNode().getValue());

        lista.removeFromTail(5);
        assertEquals(2, lista.getLastNode().getValue());

        lista.removeFromTail(2);

        assertEquals(3, lista.getFirstNode().getValue());
        assertEquals(3, lista.getLastNode().getValue());
    }

    @Test
    public void one_element_OK (){
        Lista lista = new Lista();

        lista.addToLast(1);
        Integer stoMiJeVratio = lista.removeFromHead(1);

        assertEquals(null, lista.getLastNode());
        assertEquals(null, lista.getFirstNode());
        assertEquals(1, (int) stoMiJeVratio);

    }


    @Test
    public void removeHead_FromTail(){
        Lista lista = new Lista();
        lista.addToLast(3);
        lista.addToLast(2);

        lista.removeFromTail(3);
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