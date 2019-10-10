public class doubleLinkedListDriver
{
    public static void main(String[] args)
    {
        IntLinkedList list = new IntLinkedList();
        list.addANodeToStart(2);
        list.addANodeToEnd(3);
        
        list.addANodeToStart(1);



        list.showList();


        System.out.println();

        list.deleteANodeFromEnd();
        list.showList();



    }
}
