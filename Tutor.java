 
public class Tutor extends Teacher 
{
    //Declaring Instance Variables
    private double salary;
    private String specialization;
    private String academic_qualifications;
    private int performance_index;
    private boolean isCertified=false;

     // Constructor Creation For Assigning The Values Of Instance Variable
    public Tutor(int teacher_id, String name, String address, String working_type, String employment_status,int working_hours, double salary, String specialization, String academic_qualifications,int performance_index)
    {
        super(teacher_id, name, address, working_type, employment_status);
        super.setWorkingHour(working_hours);
        this.salary = salary;
        this.specialization = specialization;
        this.academic_qualifications = academic_qualifications;
        this.performance_index = performance_index;

    }

    //Getter Method to Access All The Instance Variable 
     public double getsalary()
    {
         return this.salary;
    }
    public String getspecialization()
    {
        return this.specialization;
    }
    public String getacademic_qualifications()
    {
        return this.academic_qualifications;
    }
    public int getperformance_index()
    {
        return this.performance_index;
    }
    public boolean getisCertified()
    {
        return this.isCertified;
    }
    
    
    //Setter Method For Setting The Value Of Instance Variable i.e. (salary) After Giving Appraisal As Per Their Work
    public boolean setsalary(int salary,int performance_index)
    {
        
        if((this.performance_index>5)&&(this.getworking_hours()>20))
        {
            if((performance_index>=5)&&(performance_index<=7))
            {
                this.salary=salary+((double)5/100)*salary;
            }
            else if((performance_index>=8)&&(performance_index<=9))
            {
                this.salary=salary+((double)10/100)*salary;
            }
            else if (performance_index==10)
            {
                this.salary=salary+((double)20/100)*salary;
            }
            this.isCertified=true;
            return true;
            
        }
        else
        {
            // System.out.println("Salary Has Not Been Approved");
            return false;
        }
        
        
    }
    
    //Method For RemovingTutor If Tutor Has Not Been Certified Yet
    public void removetutor()
    {
        
    if(isCertified==false)  //Check The Value Of (isCertified) If Its False Then Assign Values To The Tutor
    {
    //Assigning the Values Of The Instance Variable To None And Zero 
     this.salary=0d; 
     this.specialization="";
     this.academic_qualifications="";
     this.performance_index=0;
     
     this.isCertified=false; //Assigning The Value Of isCertified To False
        System.out.println("Tutor Removed Successfully"); // Displaying A Suitable Message If Tutor Is Removed 
    }
    else
    {
        
        System.out.println("Tutor Was Not Removed");//Displaying A Suitable Message To Convey That Tutor Was Not Removed
    }
}
    //Method Overwriting To Display With Suitable Annotation
    public void display()
    {
        if(isCertified)
        {
            //Calling Display Method Of Teacher To Display The Information Of Teacher 
            super.display();
        
            //Display Additional Information
            System.out.println("Salary = "+this.getsalary());
            System.out.println("Specialization = "+this.getspecialization());
            System.out.println("Academic Qualification = "+this.getacademic_qualifications());
            System.out.println("Performance Index = "+this.getperformance_index());
            
            
        }
        else
        {
            super.display(); //Display Information Of Teacher
        }
    }

}
