package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedLinkedListTest {

    @Test
    public void add_remove_element_complicated(){
        SortedLinkedList lista = new SortedLinkedList();

        for(int i = 5; i < 10; i++){
            lista.add(i);
        }

        lista.add(2);
        lista.add(2);
        lista.add(4);
        lista.add(-5);
        lista.add(15);
        lista.add(2);
        lista.add(9);

        assertEquals("-5 -> 2 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 9 -> 15", lista.toString());
        System.out.println(lista.toString());

        lista.remove(-5);
        lista.remove(2);
        lista.remove(3);
        lista.remove(15);
        System.out.println(lista.toString());
    }

    @Test
    public void emptyList_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        assertEquals(0, lista.size());
    }

    @Test
    public void add_Element_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(5);

        assertEquals(1, lista.size());
    }

    @Test
    public void add_Sequence_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(5);

        assertEquals(4, lista.size());
    }

    @Test
    public void add_SequenceSameElement_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(1);
        lista.add(1);

        assertEquals(3, lista.size());
    }

    @Test
    public void remove_Element_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.remove(2);

        assertEquals(2, lista.size());
    }

    @Test
    public void remove_ElementNotInList_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(1);
        lista.add(3);
        lista.remove(5);

        assertEquals(3, lista.size());
    }

    @Test
    public void remove_FirstElement_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.remove(1);

        assertEquals(2, lista.size());
        assertEquals(2, lista.head.getValue());
    }

    @Test
    public void remove_LastElement_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(1);
        lista.add(1);
        lista.add(3);
        lista.remove(3);

        assertEquals(2, lista.size());
    }

    @Test
    public void remove_EmptyList_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.remove(1);

        assertEquals(0, lista.size());
    }

    @Test
    public void remove_Sqeuence_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        lista.add(2);
        lista.add(2);
        lista.add(2);
        lista.remove(2);

        assertEquals(0, lista.size());
    }

    @Test
    public void print_List_OK(){
        SortedLinkedList lista = new SortedLinkedList();

        assertEquals("", lista.toString());

        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertEquals("1 -> 2 -> 3", lista.toString());
    }

}