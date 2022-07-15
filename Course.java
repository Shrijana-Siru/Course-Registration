// Creating course class
public class Course 
{
    private String Courseid;
    private String Coursename;
    private String Courseleader;
    private int duration;
public Course (String Courseid, String Coursename, int duration)
    {
    
    this.Courseid = Courseid;
    this.Coursename = Coursename;
    this.duration = duration;
    this.Courseleader = "";
    
    }
    
    //Creating return get() methods.
    
public String getCourseid()
{
    return Courseid;
}

public String getCoursename()
{
    return Coursename;
}

public int getduration()
{
    return duration;
}


// Creating non-return set() methods

public void setCourseleader(String newCourseleader)
{
    this.Courseleader = newCourseleader;

}
//displays Courseid, Coursename, Duration

public void display ()
{ 
    System.out.println("This Courseid is" +Courseid);
    System.out.println("This Coursename is" +Coursename);
    System.out.println("This duration is" +duration);
    
    
    //check a condition
    if (Courseleader != "")
    {
        System.out.println(Courseleader);
    }
}
}
