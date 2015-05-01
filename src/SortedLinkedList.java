public class SortedLinkedList
{
  private Node head;
  private int theLength = 0;
  
  /**
   * Create an empty list.
   */
  public SortedLinkedList()
  {
    head = null;
  }
  
  /**
   * Print all the elements of the list to the console.  Each element will have
   * the form "name:quantity" and the entries will be separated by a single
   * space.
   */
  public void print()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.getName() + ":" + temp.getQuantity() + " ");
      temp = temp.getNext();
    }
    
    System.out.println();
  }
  
  /**
   * This method will return the name at the specified index.  Similar to an
   * array, the index of the first entry is zero.  If the index is invalid,
   * this method will return null.
   */
  public String getName(int index)
  {
    if(head == null)
    {
      return null;
    }
    int i = 0;
    Node node = head;
    while(i < index)
    {
      node = node.getNext();
      i += 1;
    }
    return node.getName();
  }
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    if(head == null)
    {
      return -1;
    }
    int i = 0;
    Node node = head;
    while(i < index)
    {
      node = node.getNext();
      i += 1;
    }
    return node.getQuantity();
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
    return theLength;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    return false;
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {
    Node prev = null;
    Node curr = head;
    Node nn = new Node(name, quantity);
    if(curr == null)
    {
      nn.setNext(head);
      head = nn;
      theLength ++;
    }
    else
    {
      while(curr != null)
      {
        if(nn.getQuantity() >= curr.getQuantity())
        {
          if(prev == null)
          {
            nn.setNext(head);
            head = nn;
            theLength ++;
            break;
          }
          else
          {
            prev.setNext(nn);
            nn.setNext(curr);
            theLength ++;
            break;
          }
        }
        if(nn.getQuantity() == curr.getQuantity())
        {
          if(prev == null)
          {
            nn.setNext(head);
            head = nn;
            theLength ++;
            break;
          }
          else
          {
            prev.setNext(nn);
            nn.setNext(curr);
            theLength ++;
            break;
          }
        }
        prev = curr;
        curr = curr.getNext();
      }
      if(curr == null)
      {
        prev.setNext(nn);
        theLength ++;
      }
    }
  }
}
