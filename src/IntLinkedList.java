public class IntLinkedList
{

        private Node head;
        private Node tail;
        private Node current;
        private Node previous;

        //constrcutor
        public IntLinkedList()
        {
            head = null;
            tail = null;

            current = head;
            previous = head;
        } //end of head constrcutor

        public void addANodeToStart(int addData)
        {

            resetIteration();
            head = new Node(addData, head);
            if (current != null)
            {
                current.PLink = head;
            }
            else
            {
                tail = head;
            }

        }

    public void addANodeToEnd(int addData)

    {
        reverseIteration();
        tail = new Node(tail, addData);
        if (current != null)
        {
            current.NLink = tail;
        }
            else
                {
                    head = tail;
                }
        }


        public void deleteANodeFromStart()
        {
            if (head != null)
            {
                head = head.NLink;
            }
            else
            {
                System.out.println("Deleting from an empty list");
                System.exit(0);
            }
        }

        public void deleteANodeFromEnd()
        {
             if (tail != null)
          {
            tail = tail.PLink;
            tail.NLink = null;
          }
           else
          {
            System.out.println("Can't delete that");
            System.exit(0);
          }
       }
        public int length()
        {
            int count = 0;
            Node position = head;
            while(position != null)
            {
                count++;
                position = position.NLink;
            }
            return count;
        }

        public void goToNext()
        {
            if (current != null)
            {
                previous = current;
                current = current.NLink;
            }
            else if(head !=null)
            {
                System.out.println("Iteration reached end of line");
            }
            else
            {
                System.out.println("You can't iterate an empty list");
                System.exit(0);
            }
        }

        public void resetIteration()
        {
            current = head;
            previous = null;
        }

        public void reverseIteration()
        {
            current = tail;

        }

        public int getDataNode()
        {
            int  result = -1;
            if (current != null)
            {
                result = current.data;
            }
            else
            {
                System.out.println("You can't get blood for a turnip");
            }
            return result;
        }
        public boolean hasNext()
        {

            if(current.NLink != null)
            {
                return true;
            }
            return false;
        }
        public void showList()
        {
            Node position = head;
            while (position != null)
            {
                System.out.println(position.data);
                position = position.NLink;

            }
        }// end show list
        private class Node
        {

            //instance variables
            private int data;
            private Node PLink;
            private Node NLink;
            //constructor
            private Node(int data, Node NLink)
            {
                this.data = data;
                this.NLink = NLink;
                this.PLink = null;
            }// cosntrcutor for start


            private Node(Node PLink, int data)
            {
                this.data = data;
                this.PLink = PLink;
                this.NLink = null;
            }// constrcutor for end
            //getters & setters

            //toString

            @Override
            public String toString()
            {
                return "Data:" + data +
                        ", links to:" + NLink;
            }

            private int getData()
            {
                return data;
            }


        } //end of class Node

    } //end of IntLinkedList


