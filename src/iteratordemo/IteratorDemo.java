/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratordemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author lkfritz
 */
public class IteratorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //demo of built in ArrayList iterator
        List<Student> roster = new ArrayList<Student>();
        roster.add(new Student("Joe", "123"));
        roster.add(new Student("Sue", "345"));
        
        Iterator<Student> sItr = roster.iterator();
        while(sItr.hasNext()){
            System.out.println(sItr.next());
        }
        
        
        //try it self coded Rectangle iterator
        List<Rectangle> mylist = new ArrayList<Rectangle>();
        mylist.add(new Rectangle(1.2,3.4));
        mylist.add(new Rectangle(4.5, 6.7));
        mylist.add(new Rectangle(8.7, 6.9));
        
        Iterator<Rectangle> rItr = mylist.iterator();
        while(rItr.hasNext()){
            System.out.printf("%s\n",rItr.next());
        }
        
        
        
       String[] words = {"alpha", "beta", "gamma"};
       for(int i = 0; i < words.length; i++){
           System.out.println(words[i]);
       }
       
       ArrayList<String> arr = new ArrayList<String>();
       for(String s : words) arr.add(s);
       
       Iterator<String> itr = arr.iterator();
       //using the iterator
       while(itr.hasNext()){
           System.out.print(itr.next() + " ");
       }
       
       Stack<String> stk = new Stack<String>();
       
       stk.add("a");
       stk.add("b");
       stk.add("c");
       
       Iterator<String> strItr = stk.iterator();
       while(strItr.hasNext()){
           System.out.println(strItr.next() + " ");
       }
       
       
    }
    
}
