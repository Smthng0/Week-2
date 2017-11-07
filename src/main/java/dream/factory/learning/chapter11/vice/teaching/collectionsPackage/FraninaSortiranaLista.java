package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class FraninaSortiranaLista extends FraninaLista implements ViceInterface {


    @Override
    public void add(int input) {

        if(root == null){
            this.root = new Node(input);
            return;
        }

        Node iterator = root;

        while (iterator.getNextNode() != null && iterator.getNextNode().getValue() < input){
            iterator=iterator.getNextNode();
        }

        Node novi = new Node(input);
        novi.setNextNode(iterator.getNextNode());
        iterator.setNextNode(novi);

    }


    @Override
    public void remove(int input) {

    }

    @Override
    public void addToLast(int input){
        throw new RuntimeException("addToLast ne radi za sortiranu listu");
    }

    @Override
    public void addToFirst(int input){
        throw new RuntimeException("addToFirst ne radi za sortiranu listu");
    }

}
