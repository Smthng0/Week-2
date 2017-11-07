package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class FraninaSortiranaListaTest {
    @Test
    public void add_element(){
        FraninaSortiranaLista lista = new FraninaSortiranaLista();

        for(int i = 5; i < 10; i++){
            lista.add(i);

        }

        lista.add(2);
        lista.add(2);
        lista.add(4);

        //lista.addToFirst(1);
        System.out.println(lista.toString());
    }

}