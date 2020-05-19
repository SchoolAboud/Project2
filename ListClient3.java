//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
    public static void main(String[] args) {
        AbstractList list1 = new ArrayList<Integer>();
        AbstractList list2 = new LinkedList<Integer>();
        System.out.println("***************************************  <INTEGER> TEST **************************************");
        System.out.print("ArrayList: ");
        processList(list1);
        System.out.println();
        
        System.out.println("*************************************");
        System.out.print("LinkedList: ");
        processList(list2);
        System.out.println();
        System.out.println();
        
        System.out.println("***************************************  <STRING> TEST **************************************");
        AbstractList list3 = new ArrayList<String>();
        AbstractList list4 = new LinkedList<String>();
        System.out.print("ArrayList: ");
        processList2(list3);
        System.out.println();
        
        System.out.println("*************************************");
        System.out.print("LinkedList: ");
        processList2(list4);
        System.out.println();
        System.out.println();
        
    }

    //*********************************************************
    // Integer ProcessList
    //*********************************************************    
    public static void processList(List list) {
        //Add and toString
        System.out.println("list.add() test: ");
        list.add(42);
        System.out.println("\tlist.add(42): "+list);
        list.add(18);
        System.out.println("\tlist.add(18): "+list);
        list.add(27);
        System.out.println("\tlist.add(27): "+list);
        list.add(93);
        System.out.println("\tlist.add(93): "+list);
        list.add(10);
        System.out.println("\tlist.add(10): "+list);
        list.add(2);
        System.out.println("\tlist.add(2): "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println();
        
        //checkIndex() test
        System.out.println("The implicitly used checkIndex(Index) method's test in which add(index,value) and set(index,value) will be used");
        System.out.println("\tlist.add(2, -20): "+list);
        list.add(2,-20);
        System.out.println("\tAfter the add: "+list);
        System.out.println("\tlist.set(2,20): "+list);
        list.set(2,20);
        System.out.println("\tAfter the set: "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println();
        
        //isEmpty() test
        System.out.println("list.isEmpty() test: ");
        System.out.println("\tlist.isEmpty(): "+list.isEmpty());
        list.clear();
        System.out.println("\tClearing the list: "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println("\tlist.isEmpty(): "+list.isEmpty());
        System.out.println();
        
        //addAll() test
        int [] data = {1,18,2,7,18,39,18,40}; //Data to be used to test 
        ArrayList<Integer> list1a = createArrayListInteger(data);
        System.out.println("list.addAll(OtherList) test using the following list: "+ list1a);
        list.addAll(list1a);
        System.out.println("\tResultant list: "+list);
        System.out.println("\tSize of the new list: "+list.size());
        System.out.println();
        
        //contains() test
        System.out.println("The list.contains(Value) test");
        System.out.println("\tlist.contains(7): "+list.contains(7));
        System.out.println("\tlist.contains(40): "+list.contains(40));
        System.out.println("\tlist.contains(100): "+list.contains(100));
        System.out.println("\tlist.contains(2): "+list.contains(2));
        System.out.println();
        
        //indexOf() test
        System.out.println("The list.indexOf(Value) test:"+list);        
        System.out.println("\tlist.indexOf(40): "+list.indexOf(40));
        System.out.println("\tlist.indexOf(1): "+list.indexOf(1));
        System.out.println("\tlist.indexOf(2): "+list.indexOf(2));
        System.out.println("\tlist.indexOf(-10): "+list.indexOf(-10));
        System.out.println();
        
        //getIndex() test
        System.out.println("The list.get(Index) test:"+list);
        System.out.println("\tlist.get(6): "+list.get(6));
        System.out.println("\tlist.get(0): "+list.get(0));
        System.out.println("\tlist.get(2): "+list.get(2));
        System.out.println("\tlist.get(3): "+list.get(3));
       
    }
    
    //*********************************************************
    // String ProcessList
    //*********************************************************
    public static void processList2(List list) {
        //Add and toString
        System.out.println("list.add() test: ");
        list.add("Majd");
        System.out.println("\tlist.add(Majd): "+list);
        list.add("Joey");
        System.out.println("\tlist.add(Joe): "+list);
        list.add("James");
        System.out.println("\tlist.add(James): "+list);
        list.add("Richard");
        System.out.println("\tlist.add(Richard): "+list);
        list.add("Aboud");
        System.out.println("\tlist.add(Aboud): "+list);
        list.add("Liam");
        System.out.println("\tlist.add(Liam): "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println();
        
        //checkIndex() test
        System.out.println("The implicitly used checkIndex(Index) method's test in which add(index,value) and set(index,value) will be used");
        System.out.println("\tlist.add(2, Bellevue): "+list);
        list.add(2,"Bellevue");
        System.out.println("\tAfter the add: "+list);
        System.out.println("\tlist.set(2,College): "+list);
        list.set(2,"College");
        System.out.println("\tAfter the set: "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println();
        
        //isEmpty() test
        System.out.println("list.isEmpty() test: ");
        System.out.println("\tlist.isEmpty(): "+list.isEmpty());
        list.clear();
        System.out.println("\tClearing the list: "+list);
        System.out.println("\tSize of the list: "+list.size());
        System.out.println("\tlist.isEmpty(): "+list.isEmpty());
        System.out.println();
        
        //addAll() test
        String [] data = {"CS211", "Maths", "Aerospace", "Engineering", "Astronomy", "Physics"}; //Data to be used to test 
        ArrayList<String> list1a = createArrayListString(data);
        System.out.println("list.addAll(OtherList) test using the following list: "+ list1a);
        list.addAll(list1a);
        System.out.println("\tResultant list: "+list);
        System.out.println("\tSize of the new list: "+list.size());
        System.out.println();
        
        //contains() test
        System.out.println("The list.contains(Value) test");
        System.out.println("\tlist.contains(Physics): "+list.contains("Physics"));
        System.out.println("\tlist.contains(Maths): "+list.contains("Maths"));
        System.out.println("\tlist.contains(Aerospace): "+list.contains("Aerospace"));
        System.out.println("\tlist.contains(Biology): "+list.contains("Biology"));
        System.out.println();
        
        //indexOf() test
        System.out.println("The list.indexOf(Value) test:"+list);        
        System.out.println("\tlist.indexOf(Maths): "+list.indexOf("Maths"));
        System.out.println("\tlist.indexOf(Physics): "+list.indexOf("Physics"));
        System.out.println("\tlist.indexOf(Engineering): "+list.indexOf("Engineering"));
        System.out.println("\tlist.indexOf(-10): "+list.indexOf(-10));
        System.out.println();
        
        //getIndex() test
        System.out.println("The list.get(Index) test:"+list);
        System.out.println("\tlist.get(4): "+list.get(4));
        System.out.println("\tlist.get(0): "+list.get(0));
        System.out.println("\tlist.get(2): "+list.get(2));
        System.out.println("\tlist.get(3): "+list.get(3));
       
    }
    
   //Method that takes an array of integers and convert it to an ArrayList of Integers
   //It was created to eliminate redundancy using for each loop every time we
   //intend to create a new ArrayList
   public static ArrayList<Integer> createArrayListInteger (int[] array){
       ArrayList<Integer> list = new ArrayList<Integer>();
       int [] data = array; 
       for (int n : data){
         list.add(n);
      }
   return list;
   }
   
   //Method that takes an array of strings and convert it to an ArrayList of Strings
   //It was created to eliminate redundancy using for each loop every time we
   //intend to create a new ArrayList
   public static ArrayList<String> createArrayListString (String[] array){
       ArrayList<String> list = new ArrayList<String>();
       String [] data = array; 
       for (String n : data){
         list.add(n);
      }
   return list;
   }       
}
