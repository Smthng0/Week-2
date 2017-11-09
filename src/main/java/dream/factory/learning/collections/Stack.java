package dream.factory.learning.collections;

public class Stack {
    Lista lista = new Lista();

    public Integer pop(){
        return lista.removeLast();
    }

    public void push (int input){
        lista.addToLast(input);
    }

    public Integer peek (){
        if (lista.isEmpty()){
            return null;
        }

        return lista.getLastNode().getValue();
    }

    @Override
    public String toString(){
        return lista.toString();
    }

    public int size(){
        return lista.size();
    }

}
