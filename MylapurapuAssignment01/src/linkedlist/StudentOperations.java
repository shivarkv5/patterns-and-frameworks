/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class StudentOperations {
    String st="";

    LinkedList<Student> studentList;
/**
     * This is a no argument constructor which initializes LinkedList
     */
    public StudentOperations() {
        studentList = new LinkedList<>();
    }

    public LinkedList<Student> getStudentList() {
        return studentList;
    }
/*This method addStudents() adds students into studentList reading from a file input.txt
  */  public void addStudents() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("input.txt"));
        while (scan.hasNext()) {

            String name = scan.nextLine();
            int id = Integer.parseInt(scan.nextLine());
            //   scan.nextLine();
            Student stu = new Student(name, id);
            studentList.add(stu);

        }
    }
/*removeDuplicates() method removes duplicates from studentList.
*/
    public void removeDuplicates() {
        HashSet<Student> hashset = new HashSet<>(studentList);
       // LinkedList<Student> listWithoutDuplicates = new LinkedList<>(hashset);
       
for(Student s:studentList){
    hashset.add(s);
}
studentList.clear();
for(Student s:hashset){
        studentList.add(s) ;

    }
    }
/*This method displayDuplicatesNamesByRecursion()  takes argument of Iterator type 
    and returns the duplicate student names as String with comma separated. 
*/
    public String displayDuplicatesNamesByRecursion(Iterator<Student> iterator) {

   int i1=0;
       if(iterator.hasNext())
       {
           Student s1=iterator.next();
           for(int i=0;i<studentList.size();i++)
           {
               if(studentList.get(i).equals(s1))
               {
                   i1++;
                   if(i1==2 && !st.contains(studentList.get(i).name))
                   {
                       st+=studentList.get(i).name+", ";
                               
                   }
               }
           }
           displayDuplicatesNamesByRecursion(iterator);
       }
       return st;
   
}
        
      
    
}
