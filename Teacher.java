 

public class Teacher 
{
    //Decleration Of Instance Variables 
    private int teacher_id;
    private String name;
    private String address;
    private String working_type;
    private String employment_status;
    private int working_hours;
    
    //Constructor Creation For Assigning The Values Of Instance Variable
    public Teacher(int teacher_id,String name,String address,String working_type,String employment_status)
    {
        
        this.teacher_id=teacher_id;
        this.name=name;
        this.address=address;
        this.working_type=working_type;
        this.employment_status=employment_status;
    
    }
    public Teacher()
    {
        
        
    
    }
    
    
    //Getter Method to Access All The Instance Variable in Child Classes
    public int getteacher_id()
    {
        return this.teacher_id;
    }
    
    public int getworking_hours()
    {
        return this.working_hours;
    }
    
    public String getaddress()
    {
        return this.address;
    }
    
    public String getworking_type()
    {
        return this.working_type;
    }
    
    public String getemployment_status()
    {
        return this.employment_status;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    
    //Setter Method For Setting The Value Of Instance Variable i.e. (working_hours)
    public void setWorkingHour(int working_hours)
    {
        this.working_hours=working_hours;
    }


    //Display Method To Display All The Values Of Instance Variables With Suitable Annotation
    public void display()
    {
        
        System.out.println("Teacher_ID = "+this.getteacher_id());
        System.out.println("Teacher_Name = "+this.getname());
        System.out.println("Teacher_Address = "+this.getaddress());
        System.out.println("Working Type = "+this.getworking_type());
        System.out.println("Employee_Status = "+this.getemployment_status());
        
    //Conditions For Cheaking If Working Hours Has Been Set Or Not
    if(working_hours==0) //If Working Hour Has Been Set Then Print Out The Set Working Hour With Suitable Annotation
    {  
        System.out.println("Working Hour Has Not Been Set Yet");
        
    }
    else
    {  //If Working Hour Has Been Set Then Print Out The Set Working Hour With Suitable Annotation
        System.out.println("Working_Hour = " +this.getworking_hours());   
    }
    
  }

}
    
