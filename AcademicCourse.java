public class AcademicCourse extends Course
{   
    
    //attributes of AcademicCourse class
    
    private String lecturername;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberofAssessments;
    private boolean isregistered;
    
    //Constructor with a parameter
    
public AcademicCourse (String Courseid, String Coursename, int duration, String Level, String Credit, int NumberofAssessments)
    {
    super(Courseid, Coursename, duration);
    this.Level = Level;
    this.Credit = Credit;
    this.NumberofAssessments = NumberofAssessments;
    this.lecturername = "";
    this.StartingDate = "";
    this.CompletionDate = "";
    this.isregistered = false;
    }
    
    //Creating public get() methods of all the attributes.
    
public String getlecturername()
{
    return lecturername;
}

public String getLevel()
{
    return Level;
}

public String getCredit()
{
    return Credit;
}

public String getStartingDate()
{
    return StartingDate;
}

public String getCompletionDate()
{
    return CompletionDate;
}

public int NumberofAssessments()
{
    return NumberofAssessments;
}

public boolean getisregistered()
{
    return isregistered;
}

//Creating non-return set() methods.
//passing newlecturername variable as parameter in setlecturername()method

public void setlecturername(String newlecturername)
{
    this.lecturername = newlecturername;
}

//passing newNumberofAssessments variable as parameter in setNumberofAssessments()method

public void setNumberofAssessments(int newNumberofAssessments)
{
    this.NumberofAssessments = newNumberofAssessments;
}

//registering the given attributes and applying conditions

public void setregister (String Courseleader, String lecturername, String StartingDate,String CompletionDate)
{
    
    //code if condition is true
    
    if (isregistered == true)
    {
        System.out.println("The Course is already registered"+"The name of the lecturer is"+lecturername + "The Starting date is"+StartingDate 
        + "and the completion date is"+CompletionDate);
    }
    
    //code if condition is false
    
    else
    {
        setCourseleader(Courseleader);
        this.lecturername = lecturername;
        this.StartingDate = StartingDate;
        this.CompletionDate = CompletionDate;
        isregistered=true;
    }
}

//displaying the all attributes

public void display()
{
    super.display();
    if (isregistered == true)
    {
        System.out.println("The lecturername is "+lecturername);
        System.out.println("The Level is "+Level);
        System.out.println("The Credit is "+Credit);
        System.out.println("The StartingDate is "+StartingDate);
        System.out.println("The CompletionDate is "+CompletionDate);
        System.out.println("The NumberofAssessments is "+NumberofAssessments);
        System.out.println("The isregistered is "+isregistered);
    }
}
}