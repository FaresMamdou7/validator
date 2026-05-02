/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author f8264
 */


public class validator {
  public static boolean person_Name(String name){
      
      if (name == null || name.trim().isEmpty())
      {
          System.out.println("Name is required");
          return false;
      }
      else 
      {
          return true;
      }
  }
      public static boolean person_ID(String ID){
          
       if (ID == null || ID == "0")
       {
           System.out.println("ID is required"); 
           return false;
       }
       else if(ID.length() < 11 && ID.length()>11)
       {
           System.out.println("ID is invalid");
           return false;
       }   
       else 
       {
           return true;
       }
      }
        public static boolean student_Major(String major){
         if (major == null || major.trim().isEmpty())
      {
          System.out.println("Major is required");
          return false;
      }
      else 
      {
          return true;
      }
        }
    
     
    public static boolean Student_GPA(Double gpa){
     if (gpa>=0 && gpa<4)
     {
         return true;
     }       
     else if (gpa== null)
     {   
         System.out.println("GPA is required");
         return false;
     }       
     else
     {
         System.out.println("GPA is invalid");
         return false;
     }
            
    } 
    public static boolean Lecturer_Department(String department){
         if (department == null || department.trim().isEmpty())
      {
          System.out.println("Department is required");
          return false;
      }
      else 
      {
          return true;
      }
        }
    public static boolean course_Title(String course_Title){
         if (course_Title == null || course_Title.trim().isEmpty())
      {
          System.out.println("Course Title is required");
          return false;
      }
      else 
      {
          return true;
      }
        }
    public static boolean course_Credits(Double hour){
     if (hour>0 && hour<6)
     {
         return true;
     }       
     else if (hour== null)
     {   
         System.out.println("Course Credits is required");
         return false;
     }       
     else
     {
         System.out.println("Course Credits is invalid");
         return false;
     }
            
    } 
   
    
    
    
         
        
            
        
            
            
        }       
       
      
  
    
    
           
    

