import java.util.*;

public abstract class AbstractList<E> implements List<E> {
   protected int size = 0;
   

   //Add without index input is common
   public void add(E value){ 
      add(size(), value);
   }  
 
   
   //addAll method is common 
   public void addAll(List<E> other) {
        for (E value: other) {
            add(value);
        }
    }

   //Contains method is common
   public boolean contains(E value){
      return indexOf(value) >=0;
   }
   
   //isEmpty() method is common
   public boolean isEmpty() {
      return size() == 0;
   }
   
   //indexOf was made common using the Iterator
   public int indexOf(E value) {
      Iterator<E> itr = this.iterator();
      int i = 0;
      while (itr.hasNext()) {
          E element = itr.next();
          if (element.equals(value)) {
             return i;
          }
          i++;
       }
      return -1;
    }
    
    //toString method was made common using Iterator
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            Iterator<E> itr = this.iterator();
            E element = itr.next();
            String result = "["+element; 
            while (itr.hasNext()) {
               element = itr.next();
               result += ", "+element;
            }
            result += "]";
            return result;
    }
  }
     //checkIndex was common and was made protected in the abstract list 
     protected void checkIndex(int index) {
         if (index < 0 || index >= size()) {
             throw new IndexOutOfBoundsException("index: " + index);
         }
     }
     
     //get method made common by using an iterator
     public E get(int index) {
        checkIndex(index);
        Iterator<E> itr = this.iterator();
        int i = 0;
        E element = null;
        if (index==0) {
            element = itr.next();
            }
         else
            while (itr.hasNext()){
               E temp = itr.next();
               i++;
               if (i==index+1)
                  element = temp;
        }
        return element;
    }
 
}   