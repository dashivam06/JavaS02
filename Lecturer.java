 
public class Lecturer extends Teacher
{
    //Declaring Instance Variables
    private String department;
    private int yearOfExperience;
    private int gradedScore=0;
    private boolean hasGraded=false;
    
    

    // Constructor Creation For Assigning The Values Of Instance Variable
    public Lecturer(int teacher_id,String name,String address,String working_type,String employment_status,int working_hours,String department, int yearOfExperience)
{
        
        super(teacher_id,name,address,working_type,employment_status);
        super.setWorkingHour(working_hours);
        this.department=department;
        this.yearOfExperience=yearOfExperience;
    
}


    //Getter Method to Access All The Instance Variable 
    public String getdepartment()
    {
        return this.department;
    }
    
    public int getyearOfExperience()
    {
        return this.yearOfExperience;
    }
    
    public int getgradedScore()
    {
        return this.gradedScore;
    }
    
     public boolean gethasGraded()
    {
        return this.hasGraded;
    }


    //Setter Method For Setting The Value Of Instance Variable i.e. (gradedScore)
    public void setgradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    
    
    //Method For Assigning The Grade Of Student 
    public String gradeAssignment(int gradedScore,String department,int yearOfExperience)
    {
        
        //Check If The YOE Is Greater Than Or Equal to 5 & Teacher's Department Is Also The Same
        if((yearOfExperience>=5)&&(this.department.equals(department))) // If It Satisfies Condition Then Do
        { 
            
            //Check The Value Of GradeScore And Then Assign Grade According To The Marks 
            if(gradedScore>70)
            { 
                  this.gradedScore=gradedScore;    
                  this.hasGraded=true;//Assign true To hasGraded After Grade Assignment  
                 return "Grade A";
            }
            else if(gradedScore >60)
            {
                  this.gradedScore=gradedScore;    
                  this.hasGraded=true;//Assign true To hasGraded After Grade Assignment  
                 return "Grade B";
            }
            else if(gradedScore >50)
            {
                  this.gradedScore=gradedScore;    
                  this.hasGraded=true;//Assign true To hasGraded After Grade Assignment  
                 return "Grade C";
            }
            else if(gradedScore >40)
            {
                  this.gradedScore=gradedScore;    
                  this.hasGraded=true;//Assign true To hasGraded After Grade Assignment  
                 return "Grade D";
            }
            else if(gradedScore<40)
            {
                  this.gradedScore=gradedScore;    
                  this.hasGraded=true;//Assign true To hasGraded After Grade Assignment  
                return  "Grade E";
            }
           
        }
       
        
        //If YOE And Teacher's Assignment Doesn't Match 
        return "Teacher Not Eligible For Grade Assignment";
    
}


        //Display Method To Display The Details Of The Lecturer 
        public void display()
        {
        super.display();//Calling Method from Parent to Child
    
        System.out.println("Department = "+getdepartment());
        System.out.println("Year Of Experience = "+getyearOfExperience());
        
        
        //Checking If Grading Score Has Been Set Or Not
        if(this.gradedScore==0) //If Its Not Set Display A Suitable Message
        {
            System.out.println("Graded Score Not Assigned  ");
        }
        else//If Its Set Already Just Print The Output With Suitable Notation
        { 
        System.out.println("Graded Score = "+getgradedScore());
    }
}
}
