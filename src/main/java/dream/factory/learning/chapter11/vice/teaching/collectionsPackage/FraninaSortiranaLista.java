package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class FraninaSortiranaLista extends FraninaLista implements ViceInterface {

    @Override
    public void add(int input) {

        if(root == null){
            this.root = new Node(input);
            return;
        }

        if (root.getNextNode() != null && root.getNextNode().getValue() > input){
            Node novi = new Node(input);
            novi.setNextNode(root);
            root = novi;
            return;
        }

        Node iterator = root;

        while (iterator.getNextNode() != null && iterator.getNextNode().getValue() < input){
            iterator = iterator.getNextNode();
        }

        Node novi = new Node(input);
        novi.setNextNode(iterator.getNextNode());
        iterator.setNextNode(novi);

    }


    @Override
    public void remove(int input) {
        if(root == null){
            return; //prazna lista
        }

        Node iterator = root;

        while (iterator.getNextNode() != null && iterator.getNextNode().getValue() < input){
            iterator = iterator.getNextNode();
        }

        while (iterator.getNextNode().getValue() == input){
           iterator.setNextNode(iterator.getNextNode().getNextNode());
           iterator.setNextNode(iterator.getNextNode());
        }

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
