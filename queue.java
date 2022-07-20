import java.util.*;
import java.lang.*;
import java.io.*;

public class queue {
  int n = 5;
  int item[] = new int[n];
  int front, rear;
  queue() {
    front = -1;
    rear = -1;
  }
  boolean isfull() {
    if (front == 0 && rear == n - 1) {
      return true;
    }
    return false;
  }
  boolean isempty() {
    if (front == -1)
      return true;
    else
      return false;
  }
  void enqueue(int ele) {
    if (isfull()) {
      System.out.println("QUEUE IS FULL");
    }
    else {
      if (front == -1) {
        front = 0;
      }
      rear++;
      item[rear] = ele;
      System.out.println("INSERT " + ele);
    }
  }
    int dequeue() {
    int ele;
    if (isempty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      ele = item[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        front++;
      }
      System.out.println( ele + " DELETED");
      return (ele);
    }
  }
  void disp() {
    int k;
    if (isempty()) {
      System.out.println("EMPTY QUEUE");
    }
    else {
      System.out.println("\nFRONT INDEX-> " + front);
      System.out.println("Items -> ");
      for (k = front; k <= rear; k++)
        System.out.print(item[k] + "  ");
      System.out.println("\nREAR INDEX-> " + rear);
    }
  }

  public static void main(String[] args) {
    Queue<String> FruitsQueue = new LinkedList<>();
    FruitsQueue.add("APPLE");
    FruitsQueue.add("MANGO");
    FruitsQueue.add("PAPAYA");
    FruitsQueue.add("ORANGE");
    FruitsQueue.add("GRAPES");
    System.out.println("Queue is : " + FruitsQueue );
    System.out.println("Head of Queue : " + FruitsQueue.peek());
    FruitsQueue.remove();
    System.out.println("After removing Head of Queue : " + FruitsQueue);
    System.out.println("Size of Queue : " + FruitsQueue.size());
    queue q = new queue();
    q.dequeue();
    for(int j = 1; j < 8; j ++) {
      q.enqueue(j);
    }
    q.enqueue(8);
    q.disp();
    q.dequeue();
    q.disp();


  }
}