
import java.util.Comparator;


public class Teacher  {
    // Decleration Of Instance Variables
    private int teacher_id;
    private String name;
    private String address;
    private String working_type;
    private String employment_status;
    private int working_hours;

    // Constructor Creation For Assigning The Values Of Instance Variable
    public Teacher(int teacher_id, String name, String address, String working_type, String employment_status) {

        this.teacher_id = teacher_id;
        this.name = name;
        this.address = address;
        this.working_type = working_type;
        this.employment_status = employment_status;

    }

    public Teacher() {

    }

    // Getter Method to Access All The Instance Variable in Child Classes
    public int getteacher_id() {
        return this.teacher_id;
    }

    public int getworking_hours() {
        return this.working_hours;
    }

    public String getaddress() {
        return this.address;
    }

    public String getworking_type() {
        return this.working_type;
    }

    public String getemployment_status() {
        return this.employment_status;
    }

    public String getname() {
        return this.name;
    }

    // Setter Method For Setting The Value Of Instance Variable i.e. (working_hours)
    public void setWorkingHour(int working_hours) {
        this.working_hours = working_hours;
    }

    // Display Method To Display All The Values Of Instance Variables With Suitable
    // Annotation
    public void display() {

        System.out.println("Teacher_ID = " + this.getteacher_id());
        System.out.println("Teacher_Name = " + this.getname());
        System.out.println("Teacher_Address = " + this.getaddress());
        System.out.println("Working Type = " + this.getworking_type());
        System.out.println("Employee_Status = " + this.getemployment_status());

        // Conditions For Cheaking If Working Hours Has Been Set Or Not
        if (working_hours == 0) // If Working Hour Has Been Set Then Print Out The Set Working Hour With
                                // Suitable Annotation
        {
            System.out.println("Working Hour Has Not Been Set Yet");

        } else { // If Working Hour Has Been Set Then Print Out The Set Working Hour With
                 // Suitable Annotation
            System.out.println("Working_Hour = " + this.getworking_hours());
        }
   
    }

   
}



// < ------------------------------- Commparator Classes ------------------------------------->


class SortByID implements Comparator<Teacher> {
    private boolean ascending;

    // Constructor to set the sorting direction
    public SortByID(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (ascending) {
            // Ascending sorting
            return Integer.compare(o1.getteacher_id(), o2.getteacher_id());
        } else {
            // Descending sorting
            return Integer.compare(o2.getteacher_id(), o1.getteacher_id());
        }
    }
}






class SortByName implements Comparator<Teacher> {
    private boolean ascending;

    public SortByName(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (ascending) {
            // Ascending sorting
            return o1.getname().compareTo(o2.getname());
        } else {
            // Descending sorting
            return o2.getname().compareTo(o1.getname());
        }
    }
}






class SortByEmployementStatus implements Comparator<Teacher>
{

    private boolean ascending;
    public SortByEmployementStatus(boolean ascending)
    {
        this.ascending = ascending;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {


        int result =  o1.getemployment_status().compareTo(o2.getemployment_status());

        result = (result!=0)?result:o1.getworking_type().compareTo(o2.getworking_type());


        if ((result == 0 ) && (o1 instanceof Tutor && o2 instanceof Tutor))
        {
            result = Integer.compare(((Tutor) o1).getperformance_index(), (((Tutor) o2).getperformance_index()));
            return (result!=0)?result:Double.compare(((Tutor) o1).getsalary(), (((Tutor) o2).getsalary()));
        }

        if ((result == 0 ) && (o1 instanceof Lecturer && o2 instanceof Lecturer))
        {
            result =  ((Lecturer) o1).getdepartment().compareTo(((Lecturer) o2).getdepartment());

            return (result!=0)?result:Integer.compare(((Lecturer) o1).getyearOfExperience(), (((Lecturer) o2).getyearOfExperience()));
        }
     
        if(ascending){
             return result;
        }else{
             // Negate the result to sort in descending order
            return -result;
        }
        
    }
    
}