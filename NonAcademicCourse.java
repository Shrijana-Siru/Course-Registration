
//creating class
public class NonAcademicCourse extends Course
{
 private String instructorname;
 private String StartDate;
 private String CompletionDate;
 private String ExamDate;
 private String prerequiste;
 private boolean isregistered = false;
 private boolean isremoved = false;
 
 //attributes of Non-AcademicCourse class
 
 public NonAcademicCourse (String Courseid,String Coursename,int durations,String prerequiste)
     {
    super(Courseid,Coursename,durations);
    this.StartDate = "";
    this.CompletionDate = "";
    this.ExamDate = "";
    //this.instructorname = instructorname;
    isregistered = false;
    isremoved = false; 
    this.prerequiste = prerequiste;
    }

public String getinstructorname()//using asscessor method ie getter
    {
    return instructorname;
    }
    
public String getStartDate()//using asscessor method i.e getter
    {
    return StartDate;
    }
    
public String getCompletionDate()//using asscessor method i.e getter  
    {
    return CompletionDate;    
    }
    
public String getExamDate()//using asscessor method i.e getter
    {
    return ExamDate;
    }
    
public String getprerequiste()//using asscessor method i.e getter
    {
    return prerequiste;
    }
    
public boolean getisregistered()//using asscessor method i.e getter
    {
    return isregistered;
    }
    
public boolean getisremoved()//using asscessor method i.e getter
    {
    return isremoved;
    }
public void setinstructorname(String newinstructorname){//using asscessor method i.e setter
    this.instructorname = newinstructorname;
    }
    
    //registering the given attributes and applying conditions
    
public void setregister(String Courseleader, String instructorname, String StartingDate, String CompletionDate, String ExamDate )
     {
     if(isregistered==false){
         super.setCourseleader(Courseleader);
         setinstructorname(instructorname);
         this. isregistered=true;
         this.StartDate=StartingDate;
         this.CompletionDate=CompletionDate;
         this.ExamDate=ExamDate;
         
        }
        else
        {
            System.out.println("Coursename is already registered");
        }
     }
         
public void remove()
    {
     super.setCourseleader("");
     this.instructorname="";
     this.isremoved=true;
     this.StartDate="";
     this.CompletionDate="";
     this.ExamDate="";
     this.isregistered=false;
   }
       
   //displaying the all attributes
   
public void display()
    {
    if(this.isregistered){
    System.out.println("the  instructorname is" +instructorname);
    System.out.println("the StartingDate is" +StartDate);
    System.out.println("the CompletionDate is" +CompletionDate);
    System.out.println("the ExamDate is" +ExamDate);
    }
    }
    }