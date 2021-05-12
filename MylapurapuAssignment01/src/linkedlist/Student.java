/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Objects;

/**
 *
 * @author Kavya Reddy Mylapurapu
 */

public class Student {
    String name;
    private int id;
/*
    This is a parameterized constructor will the attributes in same order as declared
    @param name is the name of student
    @param id is the id of student
    */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
/**
 *this method is used to fetch name of student
    
 * @return name name of the student
 */
    public String getName() {
        return name;
    }
/**
 * this method is used to fetch id of student
 * @return id id of the student
 */
    public int getId() {
        return id;
    }
/**
 * overrides hashCode method from object class
 * @return  hash value of type int
 */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.id;
        return hash;
    }
/**
 * overrides equals method from object class
 * @param obj takes parameter of type object
 * @return Boolean value 
 */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
