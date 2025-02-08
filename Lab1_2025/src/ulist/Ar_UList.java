package ulist;
public class Ar_UList {
public static final int MAXSIZE = 10;
private int[] ListItems;
private int length;
private int currentPos;


  public Ar_UList() {
	 length=0;
	 currentPos=0;
	 ListItems= new int[MAXSIZE];
	 
}
  public int getLength() { //Basic accessory
	  return length;
  }
  public Boolean isFull() { //verify weather there is more space 
	  return length == MAXSIZE;
  }
  public void putItem(int pitem) throws Exception{
	  if (length == MAXSIZE)
		  throw new Exception("List already full");
	  int aloc = 0; 
	    boolean moreTosearch = aloc <length;
	    while (moreTosearch) {
	    	if(pitem < ListItems[aloc]) {
	    		moreTosearch = false;
	    	}
	    		else {
	    			aloc++;
	    			moreTosearch = aloc < length;
	    		}
	    		
	    }
	    for (int i = length; i>aloc;i--) {
	    	ListItems[i] = ListItems[i-1];
	    	ListItems[aloc]= pitem;
	    	length++;
	    }
	   
	    
  }
     public int getItem(int gitem) {
	 int midpoint=0, first=0, last=length-1;
	 boolean moreTosearch = first <= last;
	 while(moreTosearch) {
		 midpoint = (first+last)/2;
		 if(gitem == ListItems[midpoint])
			 return midpoint;
		 else if (gitem < ListItems[midpoint])
			 last = midpoint-1;
		 else 
			 first = midpoint+1;
		 moreTosearch = first <= last;
	 }
	 return -1;
 }
  
  public void deleteItemShift(int ditem) throws Exception { 
		boolean indexfound = false;
		for (int loc=0; loc<length; loc++) {
			if (ListItems[loc] == ditem) 
				indexfound=true;
			if (indexfound)
				ListItems[loc]=ListItems[loc+1];	
		} 	length--;  
	}
  public void deleteItem(int ditem) throws Exception {
	  if (getItem(ditem) == -1)
		  throw new Exception("item isn't on the List");
	  deleteItemShift(ditem);
  }
  public void makeEmpty() {
	  length=0;
  }
  public void resetList(){
	  currentPos=0;
  }
  public int getNextItem() throws Exception {
	  if (currentPos == length)
		  throw new Exception("End of list reached");
	 // int retrunItem
	  currentPos++;
	  return ListItems[currentPos-1];
  }

 // public int getItem(int gitem) {
	  //fix this 
	  //for(int loc = 0; loc < length; loc++) 
		 // if(ListItems[loc] == gitem)
			//  return loc;
			// return -1;
  //}
  public void printList() { 
		System.out.print("(");
		for (int loc=0; loc<length; loc++) {
		  	System.out.print(ListItems[loc]);
			if (loc<length-1)
		             	  System.out.print(", ");
		}
		System.out.println(")");
	}
  
	  
}

