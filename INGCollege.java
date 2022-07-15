import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class INGCollege implements ActionListener
{
    private JFrame f, f1 ;

    private JPanel p, p1, p2, p3;

    private JLabel label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_9,
    label_10, label_11, label_12, label_13, label_14, label_15, label_16, label_17,
    label_19, label_20, label_21, label_22, label_23;

    private JTextField field,ground,top,down,side,left,inner,out,star,moon,cloud,sun,pen,pole;

    private JButton button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11;

    private JComboBox js1, js2, js3, js4, js5, js6, js7, js8, js9, js10, js11, js12, js13, js14, js15;

    private static INGCollege sf = new INGCollege();
    
    //Declare an ArrayList object of generics
    private ArrayList <Course> ArrayList = new ArrayList<Course>();

    //object of academic course
    private AcademicCourse actxt, Objectfs, Objectfn;
    private JOptionPane msg1;
    private String final_msg1;
    private String addCourseID,addCourseName,addDuration,addCredit,addLevel,addAssessment;
    private String arCourseleader,arLecturername,arStartingdate,arCompletingdate;
    private int duration;
    private int assessment;
    
    //objects of Non-Academic
    private NonAcademicCourse nactxt, Objectfss ,Objectfnn,Objectsn;
    private String addnCourseID,addnCourseName,addnDuration,addnprerequisite;
    private String narCourseid,narCourseleader,narinstructorname,narStartingdate,narCompletingdate,narExamdate;
    private JOptionPane msg2;
    private String final_msg2;
    private String box , bon;
    private int nduration;

    public void GUI()
    {
        // first frame
        f = new JFrame("Course registration");
        f.setBounds(10,10,1000,700);
        //layout set to null
        f.setLayout(null);

        // adding panel-1
        p = new JPanel();
        p.setBounds(40,70,450,560);
        Color c = new Color(203,195,227);
        p.setBackground(c);
        p.setLayout(null);

        // adding panel-2
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(520,52,450,550);
        Color c1 = new Color(190,190,190);
        p1.setBackground(c1);

        //JLabel ---. Academic
        label_1 = new JLabel("Academic Course");
        //label_one.setText("Academic");
        label_1.setBounds(450, 10, 800, 35);
        //setting Font of Academic
        Font ff_1 = new Font("Times New Roman",Font.BOLD,35);
        label_1.setFont(ff_1);
        f.add(label_1);

        //JLabel -- CourseID
        label_2 = new JLabel("CourseID");
        label_2.setBounds(28, 50, 95, 25);
        //setting font to JLabel(CourseID)
        Font ff_2 = new Font("Times New Roman",Font.PLAIN,17);
        label_2.setFont(ff_2);
        p.add(label_2);
        //JTextField
        field = new JTextField();
        field.setBounds(190, 45, 150, 40);
        p.add(field);

        //JLabel -- Course Name
        label_3 = new JLabel("Course Name");
        label_3.setBounds(28, 130, 95, 25);
        //setting font to JLabel(course name)
        Font ff_3 = new Font("Times New Roman",Font.PLAIN,17);
        label_3.setFont(ff_3);
        p.add(label_3);
        //JTextField
        ground = new JTextField();
        ground.setBounds(190, 125, 150, 40);
        p.add(ground);

        //JLabel -- Duration
        label_4 = new JLabel("Duration");
        label_4.setBounds(28, 210, 95, 25);
        //setting font to JLabel(Duration)
        Font ff_4 = new Font("Times New Roman",Font.PLAIN,17);
        label_4.setFont(ff_4);
        p.add(label_4);
        //JTextField
        top = new JTextField();
        top.setBounds(190, 205, 150, 40);
        p.add(top);

        //JLabel -- Level 
        label_5 = new JLabel("Level");
        label_5.setBounds(28, 290, 95, 25);
        //setting font to JLabel(Level)
        Font ff_5 = new Font("Times New Roman",Font.PLAIN,17);
        label_5.setFont(ff_5);
        p.add(label_5);
        //JTextField
        down = new JTextField();
        down.setBounds(190, 290, 150, 40);
        p.add(down);

        //JLabel -- Credit
        label_6 = new JLabel("Credit");
        label_6.setBounds(28, 365, 95, 25);
        //setting font to JLabel( Credit)
        Font ff_6 = new Font("Times New Roman",Font.PLAIN,17);
        label_6.setFont(ff_6);
        p.add(label_6);
        //JTextField
        side = new JTextField();
        side.setBounds(190, 365, 150, 40);
        p.add(side);

        //JLabel -- Number of Assessment
        label_7 = new JLabel("Number of Assessment");
        label_7.setBounds(28, 445, 180, 25);
        //setting font to JLabel(Number of Assignment)
        Font ff_7 = new Font("Times New Roman",Font.PLAIN,17);
        label_7.setFont(ff_7);
        p.add(label_7);
        //JTextField
        left = new JTextField();
        left.setBounds(190, 445, 150, 40);
        p.add(left);

        //JButton
        button_1 = new JButton();
        button_1.setText("Add course for Academic Course"); //setter methods 
        button_1.setBounds(60, 500, 340, 40);
        button_1.setBackground(Color.orange);//adding colour to button 
        //setting font to JButton(ADD)
        Font ff_8 = new Font("Times New Roman",Font.PLAIN,17);
        button_1.setFont(ff_8);
        button_1.addActionListener(this);
        p.add(button_1);

        //JButton
        button_2 = new JButton();
        button_2.setText("Change For Non-Academic Course"); //setter methods 
        button_2.setBounds(40, 40, 330, 35);
        button_2.setBackground(Color.pink);//adding colour to button
        //setting font to JButton(Clear)
        Font ff_9 = new Font("Times New Roman",Font.PLAIN,19);
        button_2.setFont(ff_9);
        button_2.addActionListener(this);
        p1.add(button_2);

        //JLabel -- Course Leader
        label_9 = new JLabel("Course Leader");
        label_9.setBounds(28, 130, 120, 25);
        //setting font to JLabel(Course Leader)
        Font ff_11 = new Font("Times New Roman",Font.PLAIN,17);
        label_9.setFont(ff_11);
        p1.add(label_9);
        //JTextField
        inner = new JTextField();
        inner.setBounds(190, 125, 150, 40);
        p1.add(inner);

        //JLabel -- Lecturer Name
        label_10 = new JLabel("Lecturer Name");
        label_10.setBounds(28, 210, 120, 25);
        //setting font to JLabel(Lecturer Name)
        Font ff_12 = new Font("Times New Roman",Font.PLAIN,17);
        label_10.setFont(ff_12);
        p1.add(label_10);
        //JTextField
        out = new JTextField();
        out.setBounds(190, 205, 150, 40);
        p1.add(out);

        //JLabel -- Starting Date
        label_11 = new JLabel("Starting Date");
        label_11.setBounds(28, 290, 95, 25);
        //setting font to JLabel(Starting Date)
        Font ff_13 = new Font("Times New Roman",Font.PLAIN,17);
        label_11.setFont(ff_13);
        p1.add(label_11);
        //JComboBox
        String[] year1 = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
            ,"2007","2006","2005","2004","2003","2002","2001","2000"};
        js1 = new JComboBox(year1);
        js1.setBounds(190, 290, 75, 30);
        p1.add(js1);

        //JComboBox
        String[] month1 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        js2 = new JComboBox(month1);
        js2.setBounds(280, 290, 85, 30);
        p1.add(js2);

        //JComboBox
        String[] day1 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31","32"};
        js3 = new JComboBox(day1);
        js3.setBounds(380, 290, 55, 30);
        p1.add(js3);

        //JLabel -- Completion Date
        label_12 = new JLabel("Completion Date");
        label_12.setBounds(28, 365, 120, 25);
        //setting font to JLabel(Completion Date)
        Font ff_14 = new Font("Times New Roman",Font.PLAIN,17);
        label_12.setFont(ff_14);
        p1.add(label_12);

        //JComboBox
        String[] year2 = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
            ,"2007","2006","2005","2004","2003","2002","2001","2000"};
        js4 = new JComboBox(year2);
        js4.setBounds(190, 360, 75, 30);
        p1.add(js4);

        //JComboBox
        String[] month2 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        js5 = new JComboBox(month2);
        js5.setBounds(280, 360, 75, 30);
        p1.add(js5);

        //JComboBox
        String[] day2 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31","32"};
        js6 = new JComboBox(day2);
        js6.setBounds(380, 360, 55, 30);
        p1.add(js6);

        //JButton
        button_3 = new JButton();
        button_3.setText("Register Academic Course");//setter method 
        button_3.setBounds(60, 420, 340, 40);
        //setting font to JButton(register)
        Font ff_15 = new Font("Times New Roman",Font.PLAIN,17);
        button_3.setFont(ff_15);
        button_3.addActionListener(this);
        p1.add(button_3);

        //JButton
        button_4 = new JButton();
        button_4.setText("Display");//setter method 
        button_4.setBounds(60, 490, 140, 40);
        button_4.setBackground(Color.green);//adding colour to button 
        //setting font to JButton(Display)
        Font ff_16 = new Font("Times New Roman",Font.PLAIN,17);
        button_4.setFont(ff_16);
        button_4.addActionListener(this);
        p1.add(button_4);    

        //JButton
        button_5 = new JButton();
        button_5.setText("Clear"); //setter methods
        button_5.setBounds(280, 490, 140, 40);
        button_5.setBackground(Color.white);//adding colour to button 
        //setting font to JButton(Clear)
        Font ff_17 = new Font("Times New Roman",Font.PLAIN,17);
        button_5.setFont(ff_17);
        button_5.addActionListener(this);
        p1.add(button_5);

        f.add(p);
        f.add(p1);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
    }
    //Creating Non-Academic Course Class
    public void NonAcademic()
    {

        //Second Frame
        f1= new JFrame("Course Registration form");
        f1.setLayout(null);
        f1.setBounds(10,10,1000,700); 

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(40,52,450,500);
        //add color
        Color c2 = new Color(203,195,227);
        p2.setBackground(c2);

        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(500,52,450,600);
        //add color
        Color c3 = new Color(190,190,190);
        p3.setBackground(c3);

        //JLabel ---. Academic
        label_13 = new JLabel("Non-Academic Course");
        //label_one.setText("Academic");
        label_13.setBounds(350, 10, 800, 35);
        //setting Font of Academic
        Font ff_18 = new Font("Times New Roman",Font.BOLD,35);
        label_13.setFont(ff_18);
        f1.add(label_13);

        //JLabel -- CourseID
        label_14 = new JLabel("CourseID");
        label_14.setBounds(28, 50, 95, 25);
        //setting font to JLabel(CourseID)
        Font ff_19 = new Font("Times New Roman",Font.PLAIN,17);
        label_14.setFont(ff_19);
        p2.add(label_14);
        //JTextField
        star = new JTextField();
        star.setBounds(190, 45, 150, 40);
        p2.add(star);

        //JLabel -- Course Name
        label_15 = new JLabel("Course Name");
        label_15.setBounds(28, 130, 95, 25);
        //setting font to JLabel(course name)
        Font ff_20 = new Font("Times New Roman",Font.PLAIN,17);
        label_15.setFont(ff_20);
        p2.add(label_15);
        //JTextField
        moon = new JTextField();
        moon.setBounds(190, 125, 150, 40);
        p2.add(moon);

        //JLabel -- Duration
        label_16 = new JLabel("Duration");
        label_16.setBounds(28, 210, 95, 25);
        //setting font to JLabel(Duration)
        Font ff_21 = new Font("Times New Roman",Font.PLAIN,17);
        label_16.setFont(ff_21);
        p2.add(label_16);
        //JTextField
        cloud = new JTextField();
        cloud.setBounds(190, 205, 150, 40);
        p2.add(cloud);

        //JLabel -- prerequisite 
        label_17 = new JLabel("Prerequisite");
        label_17.setBounds(28, 290, 95, 25);
        //setting font to JLabel( prerequisite )
        Font ff_22 = new Font("Times New Roman",Font.PLAIN,17);
        label_17.setFont(ff_22);
        p2.add(label_17);
        //JTextField
        sun = new JTextField();
        sun.setBounds(190, 290, 150, 40);
        p2.add(sun);

        //JButton
        button_6 = new JButton();
        button_6.setText("Add course for Non-Academic Course"); //setter methods
        button_6.getText(); //getters methods 
        button_6.setBounds(55, 380, 330, 40);
        button_6.setBackground(Color.orange);//adding color to button
        //setting font to JButton(ADD)
        Font ff_23 = new Font("Times New Roman",Font.PLAIN,17);
        button_6.setFont(ff_23);
        button_6.addActionListener(this);
        p2.add(button_6);   

        //JButton
        button_7 = new JButton();
        button_7.setText("Remove for Non-Academic Course"); //setter methods
        button_7.getText(); //getters methods 
        button_7.setBounds(55, 440, 340, 40);
        button_7.setBackground(Color.yellow);//adding colour to button
        //setting font to JButton(REMOVE)
        Font ff_24 = new Font("Times New Roman",Font.PLAIN,17);
        button_7.setFont(ff_24);
        button_7.addActionListener(this);
        p2.add(button_7);

        //JButton
        button_8 = new JButton();
        button_8.setText("Back To Academic Course"); //setter methods
        button_8.getText(); //getters methods 
        button_8.setBounds(40, 40, 330, 35);
        button_8.setBackground(Color.pink);//adding colour to button 
        //setting font to JButton(Back to Academic Course)
        Font ff_25 = new Font("Times New Roman",Font.PLAIN,17);
        button_8.setFont(ff_25);
        button_8.addActionListener(this);
        p3.add(button_8);

        //JLabel -- Course Leader
        label_19 = new JLabel("Course Leader");
        label_19.setBounds(28, 130, 120, 25);
        //setting font to JLabel(Course Leader)
        Font ff_27 = new Font("Times New Roman",Font.PLAIN,17);
        label_19.setFont(ff_27);
        p3.add(label_19);
        //JTextField
        pen = new JTextField();
        pen.setBounds(190, 125, 150, 40);
        p3.add(pen);

        //JLabel -- Instructor Name
        label_20 = new JLabel("Instructor Name");
        label_20.setBounds(28, 210, 120, 25);
        //setting font to JLabel(Instructor  Name)
        Font ff_28 = new Font("Times New Roman",Font.PLAIN,17);
        label_20.setFont(ff_28);
        p3.add(label_20);
        //JTextField
        pole = new JTextField();
        pole.setBounds(190, 205, 150, 40);
        p3.add(pole);

        //JLabel -- Start Date
        label_21 = new JLabel("Start Date");
        label_21.setBounds(28, 290, 95, 25);
        //setting font to JLabel(Starting Date)
        Font ff_29 = new Font("Times New Roman",Font.PLAIN,17);
        label_21.setFont(ff_29);
        p3.add(label_21);
        //JComboBox
        String[] year3 = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
            ,"2007","2006","2005","2004","2003","2002","2001","2000"};
        js7 = new JComboBox(year3);
        js7.setBounds(190, 290, 75, 30);
        p3.add(js7);

        //JComboBox
        String[] month3 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        js8 = new JComboBox(month3);
        js8.setBounds(290, 290, 75, 30);
        p3.add(js8);

        //JComboBox
        String[] day3 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31","32"};
        js9 = new JComboBox(day3);
        js9.setBounds(380, 290, 55, 30);
        p3.add(js9);

        //JLabel -- Completion Date
        label_22 = new JLabel("Completion Date");
        label_22.setBounds(28, 365, 120, 25);
        //setting font to JLabel(Completion Date)
        Font ff_30 = new Font("Times New Roman",Font.PLAIN,17);
        label_22.setFont(ff_30);
        p3.add(label_22);

        //JComboBox
        String[] year4 = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
            ,"2007","2006","2005","2004","2003","2002","2001","2000"};
        js10 = new JComboBox(year4);
        js10.setBounds(190, 360, 75, 30);
        p3.add(js10);

        //JComboBox
        String[] month4 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        js11 = new JComboBox(month4);
        js11.setBounds(290, 360, 75, 30);
        p3.add(js11);

        //JComboBox
        String[] day4 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31","32"};
        js12 = new JComboBox(day4);
        js12.setBounds(380, 360, 55, 30);
        p3.add(js12);

        //JLabel -- Exam Date
        label_23 = new JLabel("Exam  Date");
        label_23.setBounds(28, 430, 250, 25);
        //setting font to JLabel(Completion Date)
        Font ff_31 = new Font("Times New Roman",Font.PLAIN,17);
        label_23.setFont(ff_31);
        p3.add(label_23);

        //JComboBox
        String[] year5 = {"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"
            ,"2007","2006","2005","2004","2003","2002","2001","2000"};
        js13 = new JComboBox(year5);
        js13.setBounds(190, 430, 75, 30);
        p3.add(js13);

        //JComboBox
        String[] month5 = {"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        js14 = new JComboBox(month5);
        js14.setBounds(290, 430, 75, 30);
        p3.add(js14);

        //JComboBox
        String[] day5 = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"
            ,"26","27","28","29","30","31","32"};
        js15 = new JComboBox(day5);
        js15.setBounds(380, 430, 55, 30);
        p3.add(js15);    

        //JButton
        button_9 = new JButton();
        button_9.setText("Register Non-Academic Course");//setter method 
        button_9.getText(); //getters methods 
        button_9.setBounds(60, 480, 340, 40);
        //setting font to JButton(register)
        Font ff_32 = new Font("Times New Roman",Font.PLAIN,17);
        button_9.setFont(ff_32);
        button_9.addActionListener(this);
        p3.add(button_9);    

        //JButton
        button_10 = new JButton();
        button_10.setText("Display");//setter method 
        button_10.getText(); //getters methods 
        button_10.setBounds(70, 530, 140, 40);
        button_10.setBackground(Color.green);//adding colour to button 
        //setting font to JButton(Display)
        Font ff_33 = new Font("Times New Roman",Font.PLAIN,17);
        button_10.setFont(ff_33);
        button_10.addActionListener(this);
        p3.add(button_10);    

        //JButton
        button_11 = new JButton();
        button_11.setText("Clear"); //setter methods
        button_11.getText(); //getters methods 
        button_11.setBounds(260, 530, 140, 40);
        button_11.setBackground(Color.red);//adding colour to button
        //setting font to JButton(Clear)
        Font ff_34 = new Font("Times New Roman",Font.PLAIN,17);
        button_11.setFont(ff_34);
        button_11.addActionListener(this);
        p3.add(button_11);

        f1.add(p2);
        f1.add(p3);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        sf.GUI();// to dispalay main frame
    }

    public void actionPerformed(ActionEvent e){
        // Creating actionListener method for both the panels and giving different properties for each panel execution.
        if (e.getSource()==button_2)
        {
            NonAcademic(); 
            f.dispose();
        }

        else if (e.getSource()==button_8)
        {
            f1.dispose();
            GUI();

        }
        //clear button of academic course
        if (e.getSource()==button_5){

            field.setText("");
            ground.setText("");
            top.setText("");
            down.setText("");
            side.setText("");
            left.setText("");
            inner.setText("");
            out.setText("");
            js1.setSelectedIndex(0);
            js2.setSelectedIndex(0);
            js3.setSelectedIndex(0);
            js4.setSelectedIndex(0);
            js5.setSelectedIndex(0);
            js6.setSelectedIndex(0);
        }
        //clear button of non academic
        if (e.getSource()==button_11){
            star.setText("");
            moon.setText("");
            cloud.setText("");
            sun.setText("");
    
            pen.setText("");
            pole.setText("");
            js7.setSelectedIndex(0);
            js8.setSelectedIndex(0);
            js9.setSelectedIndex(0);
            js10.setSelectedIndex(0);
            js11.setSelectedIndex(0);
            js12.setSelectedIndex(0);
            js13.setSelectedIndex(0);
            js14.setSelectedIndex(0);
            js15.setSelectedIndex(0);
        }
        //add button for Academic course
        if (e.getSource()==button_1){ 
            try{
                addCourseID = field.getText();
                addCourseName = ground.getText();
                addDuration = top.getText();
                int duration = Integer.parseInt(addDuration);
                addCredit = side.getText();
                addLevel = down.getText();
                addAssessment = left.getText();
                int assessment = Integer.parseInt(addAssessment);
                boolean bon = true;
                if(addCourseID.isEmpty()||addCourseName.isEmpty()||addDuration.isEmpty()||addLevel.isEmpty()||addAssessment.isEmpty()||addCredit.isEmpty()){
                    JOptionPane.showMessageDialog(f,"please fill up all the fields");
                }
                else{
                    if(ArrayList.isEmpty())

                    {

                        actxt = new AcademicCourse(addCourseID,addCourseName,duration,addCredit,addLevel,assessment);
                        ArrayList.add(actxt);

                        msg1 = new JOptionPane();
                        String final_msg1 = ("The Academic Course with \n" + "\nCourse ID: " +addCourseID +"\nCoursename: " +addCourseName + "\nDuration: " +addDuration +"\nCredit: " +addCredit + "\nLevel:" +addLevel + "\nAssessment: " +addAssessment + "\n is Sucessfully added"); 
                        msg1.showMessageDialog(f,final_msg1);

                    }
                    else{
                        for (Course on  : ArrayList){
                            if(on instanceof AcademicCourse){
                                if(on.getCourseid().equals(addCourseID)){
                                    JOptionPane.showMessageDialog(f,"added Duplicate ");
                                    break;
                                }
                                else{
                                    bon=false;
                                }
                            }
                        }
                    }
                    if(bon==false){
                        actxt = new AcademicCourse(addCourseID,addCourseName,duration,addCredit,addLevel,assessment);
                        ArrayList.add(actxt);
                        bon=true;
                        msg1 = new JOptionPane();
                        String final_msg1 = ("The Academic Course with \n" + "\nCourse ID: " +addCourseID +"\nCoursename: " +addCourseName + "\nDuration: " +addDuration +"\nCredit: " +addCredit + "\nLevel:" +addLevel + "\nAssessment: " +addAssessment + "\n is Sucessfully added"); 
                        msg1.showMessageDialog(f,final_msg1);
                    }
                }
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(f,"fill up all the fields");
            }
        }
        //add button for Non-academic course
        if (e.getSource()==button_6){ 
            try{
                addnCourseID = star.getText();
                addnCourseName = moon.getText();
                addnDuration= cloud.getText();
                int nDuration = Integer.parseInt(addnDuration);
                addnprerequisite = sun.getText();
                boolean bot = true;
                if(addnCourseID.isEmpty()||addnCourseName.isEmpty()||addnDuration.isEmpty()||addnprerequisite.isEmpty()){
                    JOptionPane.showMessageDialog(f1,"please fill up all the fields");
                }
                else{
                    if(ArrayList.isEmpty())

                    {

                        nactxt = new NonAcademicCourse(addnCourseID,addnCourseName,nDuration,addnprerequisite);
                        ArrayList.add(nactxt);

                        msg2 = new JOptionPane();
                        String final_msg2 = ("The NonAcademic Course with \n" + "\nCourse ID: " +addnCourseID +"\nCoursename: " +addnCourseName + "\nDuration: " +addnDuration +"\nprerequisite: "+ addnprerequisite + "\n is Sucessfully added"); 
                        msg2.showMessageDialog(f1,final_msg2);

                    }
                    else{
                        for (Course on  : ArrayList){
                            if(on instanceof NonAcademicCourse){
                                if(on.getCourseid().equals(addnCourseID)){
                                    JOptionPane.showMessageDialog(f1,"added Duplicate ");
                                    break;
                                }
                                else{
                                    bot=false;
                                }
                            }
                        }
                    }
                    if(bot==false){
                        nactxt = new NonAcademicCourse(addnCourseID,addnCourseName,nDuration,addnprerequisite);
                        ArrayList.add(nactxt);
                        bot=true;
                        msg2 = new JOptionPane();
                        String final_msg2 = ("The NonAcademic Course with \n" + "\nCourse ID: " +addnCourseID +"\nCoursename: " +addnCourseName + "\nDuration: " +addnDuration +"\nprerequisite: "+ addnprerequisite + "\n is Sucessfully added"); 
                        msg2.showMessageDialog(f1,final_msg2);
                    }
                }
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(f1,"fill up all the fields");
            }
        }

        //Register For Academic
        if(e.getSource().equals(button_3)){
            addCourseID = field.getText();
            arCourseleader = inner.getText();
            arLecturername= out.getText();
            //for starting date
            String year1 = (js1.getSelectedItem()).toString();
            String month1 = (js2.getSelectedItem()).toString();
            String day1 = (js3.getSelectedItem()).toString();
            arStartingdate = year1 + month1 + day1;

            //for completing date
            String year2 = (js4.getSelectedItem()).toString();
            String month2 = (js5.getSelectedItem()).toString();
            String day2 = (js6.getSelectedItem()).toString();
            arCompletingdate =  year2 + month2 + day2;
            if(ArrayList.isEmpty()){
                JOptionPane.showMessageDialog(f,"course has  not been added");
            }else
            {
                boolean courseidfound = false;
                //comparision CourseID
                for  (Course reff_var:ArrayList){
                    if(reff_var.getCourseid().equals(addCourseID)){
                        if (reff_var instanceof AcademicCourse){
                            courseidfound = true;
                            Objectfs = (AcademicCourse)reff_var;
                            //if academic course is registered 
                            if(Objectfs.getisregistered() == true){
                                JOptionPane.showMessageDialog(f,"Already Registered"); 
                                break;
                            }
                            else if(Objectfs.getisregistered() == false){
                                Objectfs.setregister(arCourseleader,arLecturername,arStartingdate,arCompletingdate);
                                JOptionPane.showMessageDialog(f,"Sucessfully Registered"); 
                                break;
                            }
                        }
                    }
                }
                if (courseidfound==false){
                    JOptionPane.showMessageDialog(f,"please add course before register"); 
                }
            }
        }
        //register Non-academic
        else if (e.getSource().equals(button_9)){
            addnCourseID = star.getText();
            narCourseid = star.getText();
            narCourseleader = pen.getText();
            narinstructorname= pole.getText();

            //for starting Date
            String year3 = (js7.getSelectedItem()).toString();
            String month3 = (js8.getSelectedItem()).toString();
            String day3 = (js9.getSelectedItem()).toString();
            narStartingdate = year3 + month3 + day3;

            // for Completing Date
            String year4 = (js10.getSelectedItem()).toString();
            String month4 = (js11.getSelectedItem()).toString();
            String day4 = (js12.getSelectedItem()).toString();
            narCompletingdate = year4 + month4 + day4;

            // For ExamDate
            String year5 = (js13.getSelectedItem()).toString();
            String month5 = (js14.getSelectedItem()).toString();
            String day5 = (js15.getSelectedItem()).toString();
            narExamdate = year5 +"" + month5+"" + day5;

            if(ArrayList.isEmpty()){
                JOptionPane.showMessageDialog(f1,"course has  not been added");
            }else
            {
                boolean courseidfound = false;
                //comparision CourseID
                for  (Course refff_var:ArrayList){
                    if(refff_var.getCourseid().equals(addnCourseID)){
                        if (refff_var instanceof NonAcademicCourse){
                            courseidfound = true;
                            Objectfss = (NonAcademicCourse)refff_var;
                            //if Non academic is registered
                            if(Objectfss.getisregistered() == true){
                                JOptionPane.showMessageDialog(f1,"Already Registered"); 
                                break;
                            }
                            else if(Objectfss.getisregistered() == false){
                                Objectfss.setregister(narCourseleader,narinstructorname,narStartingdate,narCompletingdate,narExamdate);
                                JOptionPane.showMessageDialog(f1,"Sucessfully Registered"); 
                                break;
                            }
                        }
                    }
                }
                if (courseidfound==false){
                    JOptionPane.showMessageDialog(f1,"please add course before register"); 
                }
            }
        }

        //display button of Academic Course

        if(e.getSource()==button_4){
            if(ArrayList.isEmpty()){
                JOptionPane.showMessageDialog(f,"Sorry Nothing To Display");
            }
            else{
                for(Course acd : ArrayList){
                    if(acd instanceof AcademicCourse){
                        Objectfn = (AcademicCourse) acd;
                        Objectfn.display();
                    }
                }
            }
        }
        //display button of Non-Academic
        else if(e.getSource()==button_10){
            if(ArrayList.isEmpty()){
                JOptionPane.showMessageDialog(f1,"Sorry Nothing To Display");
            }
            else{
                for(Course nacd : ArrayList){
                    if(nacd instanceof NonAcademicCourse){
                        Objectfnn = (NonAcademicCourse) nacd;
                        Objectfnn.display();
                    }
                }
            }
        }
        // Remove button for non academic
        if(e.getSource()==button_7){
            for(Course off : ArrayList){
                if(off.getCourseid().equals(addnCourseID)){
                    NonAcademicCourse Objectsn=(NonAcademicCourse)off;//downcasting to call remove method
                    if(Objectsn.getisremoved()==true){
                        JOptionPane.showMessageDialog(f1,"Already Removed");
                    }
                    else if(Objectsn.getisremoved()==false){
                        Objectsn.remove();
                        JOptionPane.showMessageDialog(f1,"Sucessfully Removed");
                        break;
                    }
                }
            }
        }
    }
}
