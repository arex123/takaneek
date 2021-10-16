import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      // write code here
      return size;
    }

    public void display(){
      // this below commented code also works
    /*  if(size==0){
          System.out.println(" ");
          return;
      }
      int first = head.data;
      Node next = head.next;
      System.out.print(first+" ");
      for(int i=1;i<size;i++){
          Node ele = next;
          System.out.print(ele.data+" ");
          if(ele.next!=null)
          next = ele.next;
          
      }
     System.out.println();
    }
    */
    
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
    }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}