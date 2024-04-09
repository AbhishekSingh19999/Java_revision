package Dpackage;

public interface Queue {
	
	 int SIZE = 8;
     
	 public void firstInsert(int data );
	 public int  lastRemove();
	 public boolean empty();
	 public boolean full();
}
