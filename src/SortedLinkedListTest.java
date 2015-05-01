import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase {

  public void testEmptyList() {
    SortedLinkedList sll = new SortedLinkedList();
    assertEquals(0, sll.length());
  }
  public void testSingleNode() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("bears", 2);
    
    assertEquals(1, sll.length());
  }
  public void testSecondNodeNewHead() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("bears", 3);
    sll.insert("beavers", 7);
    
    assertEquals(2, sll.length());
    assertEquals(7, sll.getQuantity(0));
  }

  public void testSecondNodeSecond() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("beavers", 7);
    sll.insert("bears", 3);
    
    assertEquals(2, sll.length());
    assertEquals(7, sll.getQuantity(0));
    assertEquals(3, sll.getQuantity(1));
  }
  
  public void testRepeatedlyAddNodeToHead() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("bears", 3);
   
    assertEquals(3, sll.getQuantity(0));
    
    sll.insert("beavers", 7);
   
    assertEquals(7, sll.getQuantity(0));
   
    sll.insert("baboons", 9);
   
    assertEquals(9, sll.getQuantity(0));
    
    sll.insert("bisons", 9);
   
    assertEquals(9, sll.getQuantity(0));
    assertEquals("bisons", sll.getName(0));
    
    sll.insert("badgers", 12);
   
    assertEquals(12, sll.getQuantity(0));
    assertEquals(9, sll.getQuantity(1));
    assertEquals(9, sll.getQuantity(2));
    assertEquals(7, sll.getQuantity(3));
    assertEquals(3, sll.getQuantity(4));
    assertEquals(5, sll.length());
  }
  
  public void testMiddleThird() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("badgers", 12);
    sll.insert("bears", 3);
    sll.insert("beavers", 7);
    
    assertEquals(7, sll.getQuantity(1));
  }
 
  public void testRandomInserts() {
    SortedLinkedList sll = new SortedLinkedList();
    
    sll.insert("badgers", 12);
    
    assertEquals(12, sll.getQuantity(0));
    
    sll.insert("baboons", 9);
    
    assertEquals(9, sll.getQuantity(1));
    
    sll.insert("bears", 3);
    
    assertEquals(3, sll.getQuantity(2));
    
    sll.insert("bisons", 9);
    
    assertEquals(9, sll.getQuantity(2));
    assertEquals(3, sll.getQuantity(3));
    
    sll.insert("beavers", 7);
    
    assertEquals(7, sll.getQuantity(3));
    assertEquals(3, sll.getQuantity(4));
  }
}
