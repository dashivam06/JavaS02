
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MyFrame extends JFrame {

    ArrayList<Teacher> teachers = new ArrayList<>(); // will store teachers

    // decleration of every JLabel Elements used in program
    JLabel teacherIDLabel, teacherNameLabel, addressLabel, workingTypeLabel,
            employmentStatusLabel, workingHoursLabel, departmentLabel, gradedScoreLabel,
            yearOfExperienceLabel, salaryLabel, performanceIndexLabel,
            academyQualificationLabel, specializationLabel;

    // decleration of every JLabel Elements used in program
    JTextField teacherIDTextField, teacherNameTextField, addressTextField,
            workingTypeTextField, employmentStatusTextField, workingHoursTextField,
            departmentTextField, gradedScoreTextField, yearOfExperienceTextField,
            salaryTextField, performanceIndexTextField, academyQualificationTextField,
            specializationTextField;

    MyFrame() { // constructor
        setTitle("Teacher GUI Project ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setLocation(150, 180);

        GridLayout gridLayout = new GridLayout(3, 6); // for entire frame

        // for positioning elements onto frame with points
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gridLayout); // setting gridlayout to frame

        // For Teacher

        // Initializing JLabels
        teacherIDLabel = new JLabel("Teacher ID:");
        teacherNameLabel = new JLabel("Teacher Name:");
        addressLabel = new JLabel("Address:");
        workingTypeLabel = new JLabel("Working Type:");
        employmentStatusLabel = new JLabel("Employment Status:");
        workingHoursLabel = new JLabel("Working Hours:");

        // Initializing JTextFields
        teacherIDTextField = new JTextField(10);
        teacherNameTextField = new JTextField(20);
        addressTextField = new JTextField(15);
        workingTypeTextField = new JTextField(10);
        employmentStatusTextField = new JTextField(10);
        workingHoursTextField = new JTextField(10);

        // Created panel and set gridlayout (3 rows, 2 columns)
        JPanel teacherPanel = new JPanel();
        GridLayout g = new GridLayout(3, 2, 50, 5);
        teacherPanel.setLayout(g);

        // creating gap around all elements
        teacherPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        // Add labels and text fields to the panel
        teacherPanel.add(teacherIDLabel);
        teacherPanel.add(teacherIDTextField);
        teacherPanel.add(teacherNameLabel);
        teacherPanel.add(teacherNameTextField);
        teacherPanel.add(addressLabel);
        teacherPanel.add(addressTextField);
        teacherPanel.add(workingTypeLabel);
        teacherPanel.add(workingTypeTextField);
        teacherPanel.add(employmentStatusLabel);
        teacherPanel.add(employmentStatusTextField);
        teacherPanel.add(workingHoursLabel);
        teacherPanel.add(workingHoursTextField);

        // Adding the panel to the frame and positioning it.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        this.add(teacherPanel, gbc);

        // For Clear and Display Button

        // Creating panel for 2nd row to include instructions,displaytutor and
        // displayLecturer
        JPanel teacherButtonPanel = new JPanel(new BorderLayout());

        JButton displayTutor = new JButton("Display Tutor Details");
        JButton displayLecturer = new JButton("Display Lecturer Details");
        JButton clearButton = new JButton("Clear all input fields");

        JPanel forNote = new JPanel(new GridLayout(10, 1));

        // Instructions to be followed
        JLabel note = new JLabel("    Instructions   : ");
        JLabel instruction1 = new JLabel(
                "             1)   Please fill all the required input fields with valid values only .");
        JLabel instruction2 = new JLabel(
                "             2)   To add Lecturer provide with Teacher Id, Teacher Name, Address, Working Type, Employment Status, Working Hour, Year of Experience and Department accurately.");
        JLabel instruction3 = new JLabel(
                "             3)   To add Tutor provide with Teacher Id, Teacher Name, Address, Working Type, Employment Status, Working Hour, Salary, Performance Index, ");
        JLabel subinstruction3 = new JLabel(
                "                             Academic Qualification and Specialization accurately.");
        JLabel instruction4 = new JLabel(
                "             4)   To assign grades provide with Teacher Id, Graded Score, Year of Experience ( YOE ) and Department in their respective input fields .");
        JLabel instruction5 = new JLabel(
                "             5)   To set salary provide with correct Teacher ID, Salary and Performance Index in their respective input fields accurately .");
        JLabel instruction6 = new JLabel(
                "             3)   To remove Tutor provide with correct Tutor ID in Teacher ID Field.");
        JLabel instruction7 = new JLabel(
                "             5)   To display Lecturer's or Tutor's details kindly check console window ( Terminal ) . ");
        clearButton.setBackground(Color.RED);

        // adding instruction elements to instruction panel
        forNote.add(note);

        forNote.add(instruction1);

        forNote.add(instruction2);

        forNote.add(instruction3);

        forNote.add(subinstruction3);

        forNote.add(instruction4);

        forNote.add(instruction5);

        forNote.add(instruction6);

        forNote.add(instruction7);

        JPanel displayTeachersPanel = new JPanel(new GridLayout(1, 2)); // includes 2 button for displayig tutor and
                                                                        // lecturer
        displayTeachersPanel.add(displayLecturer);
        displayTeachersPanel.add(displayTutor);

        // Adding buttons to the panel
        teacherButtonPanel.add(clearButton, BorderLayout.NORTH);
        teacherButtonPanel.add(displayTeachersPanel, BorderLayout.SOUTH);
        teacherButtonPanel.add(forNote, BorderLayout.CENTER);

        // Adding the panel to the frame
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 6;

        this.add(teacherButtonPanel);

        // For Lecturer Panel

        // Initializing JLabels
        departmentLabel = new JLabel("Department    :");
        gradedScoreLabel = new JLabel("Graded Score   :");
        yearOfExperienceLabel = new JLabel("Year Of Experience  :");

        // Initializing JTextFields
        departmentTextField = new JTextField(15);
        gradedScoreTextField = new JTextField(10);
        yearOfExperienceTextField = new JTextField(10);

        // Buttons for Lecturer functions
        JButton addLecturerButton = new JButton("Add Lecturer");
        JButton gradeAssignmentButton = new JButton("Grade Assignment");

        // Creating lecturerPanel to group different elemets of Lecturer
        JPanel lecturerPanel = new JPanel(new GridLayout(3, 2, 50, 5));
        lecturerPanel.add(departmentLabel);
        lecturerPanel.add(departmentTextField);
        lecturerPanel.add(yearOfExperienceLabel);
        lecturerPanel.add(yearOfExperienceTextField);
        lecturerPanel.add(gradedScoreLabel);
        lecturerPanel.add(gradedScoreTextField);

        // gap around all elements
        lecturerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        // Create button panel with GridLayout
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        buttonPanel.add(addLecturerButton);
        buttonPanel.add(gradeAssignmentButton);

        // Main panel with BorderLayout to group button and txtfield of lecturer
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(lecturerPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Set frame size
        this.pack();

        // Adding Tutor Class

        // Initializing JLabels
        salaryLabel = new JLabel("Salary:");
        performanceIndexLabel = new JLabel("Performance Index:");
        academyQualificationLabel = new JLabel("Academy Qualification:");
        specializationLabel = new JLabel("Specialization:");

        // Initializing JTextFields
        salaryTextField = new JTextField(10);
        performanceIndexTextField = new JTextField(10);
        academyQualificationTextField = new JTextField(15);
        specializationTextField = new JTextField(15);

        // Tutor Functionality Buttons
        JButton addTutorButton = new JButton("Add Tutor");
        JButton removeTutorButton = new JButton("Remove Tutor");
        JButton setSalaryButton = new JButton("Set Salary");

        // tutorpanel panel for grouping the buttons,txtfield and labels
        JPanel tutorpanel = new JPanel(new GridLayout(4, 2, 50, 5));

        // for gap around all elements
        tutorpanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        // adding elements to tutorpanel
        tutorpanel.add(salaryLabel);
        tutorpanel.add(salaryTextField);
        tutorpanel.add(performanceIndexLabel);
        tutorpanel.add(performanceIndexTextField);
        tutorpanel.add(academyQualificationLabel);
        tutorpanel.add(academyQualificationTextField);
        tutorpanel.add(specializationLabel);
        tutorpanel.add(specializationTextField);

        // Button panel with GridLayout
        JPanel tutorbuttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        tutorbuttonPanel.add(addTutorButton);
        tutorbuttonPanel.add(removeTutorButton);
        tutorbuttonPanel.add(setSalaryButton);

        // mainTutorPanel i.e consists of buttons and txtfields
        JPanel mainTutorPanel = new JPanel();
        mainTutorPanel.setLayout(new BorderLayout());
        mainTutorPanel.add(tutorpanel, BorderLayout.CENTER);
        mainTutorPanel.add(tutorbuttonPanel, BorderLayout.SOUTH);

        // comprises of both lecturer and tutor
        JPanel majorPanel = new JPanel(new GridLayout(1, 2, 50, 20));
        majorPanel.add(mainPanel);
        majorPanel.add(mainTutorPanel);

        // Adding majorPanel to the frame
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 6;

        this.add(majorPanel, gbc);

        this.pack();
        setVisible(true); // making frame vivible

        // Here Comes ActionListeners

        // for clear button
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextField();
            }
        });

        // for displaymethod
        displayLecturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayLecturer();

            }
        });

        displayTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayTutor();

            }

        });

        // foraddlecturerbutton
        addLecturerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher teacher1 = addLecturer();
                teachers.add(teacher1);

            }
        });

        // for addtutorbutton
        addTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher teacher2 = addTutor();
                teachers.add(teacher2);
            }
        });

        // for gradeassignmentbutton
        gradeAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherID = teacherIDTextField.getText();
                String gradeStr = gradedScoreTextField.getText();
                String department = departmentTextField.getText();
                String yearStr = yearOfExperienceTextField.getText();

                try {
                // Input validation
                if (!isValidInput(teacherID, gradeStr, yearStr,department)) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Please check your entries for ID, GradedScore,Department and YOE.");
                    return;
                }


                int teacherId = Integer.parseInt(teacherID);
                int gradedScore = Integer.parseInt(gradeStr);
                int yearsOfExperience = Integer.parseInt(yearStr);

                if(isNegative(teacherId,gradedScore,yearsOfExperience)){
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Input Field cannot be less than zero.");
                    return;
                }

                // cheaking identity of lecturer to know if they exists already or not
                Lecturer lecturer = findLecturer(teacherId);
                if (lecturer != null) {
                    // Calling grade assignment method from Lecturer class
                    String result = lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                    if (lecturer.gethasGraded()) {
                        JOptionPane.showMessageDialog(null,
                                "( " + result + " ) Assigned and Grade assignment successful for lecturer "
                                        + teacherID);
                        clearTextField();
                    } else {
                        JOptionPane.showMessageDialog(null, result);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Lecturer with ID " + teacherID + " not found.");
                }
            }catch(NumberFormatException g){
                JOptionPane.showMessageDialog(null,
                "Invalid input! Please fill input fields with their specific values only.");
            }
            catch(Exception z){
                JOptionPane.showMessageDialog(null,
                "Invalid input! Grade cannot be assigned.");
            }
            }
        });

        // for setsalarybutton
        setSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherID = teacherIDTextField.getText();
                String salaryStr = salaryTextField.getText();
                String performanceStr = performanceIndexTextField.getText();


                try{

                if (!isValidInput(teacherID, salaryStr, performanceStr)) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Please check your entries for ID, Salary and Performance Index.");
                    return;
                }

                int teacherId = Integer.parseInt(teacherID);
                int salary = Integer.parseInt(salaryStr);
                int performanceIndex = Integer.parseInt(performanceStr);

                if(isNegative(teacherId,salary,performanceIndex)){
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Input Field cannot be less than zero.");
                    return;
                }

                // Finding tutor to know if they exists already or not
                Tutor tutor = findTutor(teacherId);
                if (tutor != null) {
                    // Calling set salary method
                    boolean isIncreased = tutor.setsalary(salary, performanceIndex);
                    if (isIncreased == true) {
                        JOptionPane.showMessageDialog(null,
                                "Salary and performance index updated for tutor " + teacherID);
                        clearTextField();
                    } else {
                        JOptionPane.showMessageDialog(null, "Requirements didnt exactly meet for salary increment");

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                }
            }catch (NumberFormatException f){
                JOptionPane.showMessageDialog(null,
                "Invalid input! Please fill input fields with their specific values only.");
            }catch(Exception y){
                JOptionPane.showMessageDialog(null,
                "Invalid input! Salary was not set.");
            }
            }
        });

        // for removetutorbutton
        removeTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherID = teacherIDTextField.getText();

                try{
                if (!isValidInput(teacherID)) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid teacher ID.");
                    return;
                }

                int teacherId = Integer.parseInt(teacherID);

                if(isNegative(teacherId)){
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Input Field cannot be less than zero.");
                    return;
                }

                Tutor tutor = (Tutor) findTutor(teacherId);
                if (tutor != null) {
                    teachers.remove(tutor); // Removing the tutor object
                    JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " removed successfully.");
                    clearTextField();
                } else {
                    JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                }
            }catch(NumberFormatException h){
                    JOptionPane.showMessageDialog(null,
                    "Invalid input! Please fill input fields with their specific values only.");
                }catch(Exception y){
                    JOptionPane.showMessageDialog(null,
                    "Invalid input! Tutor was not removed.");
                }
            }
        });
    }

    // Here Comes Functions now (Greatest of All Time)GOAT
    public Lecturer addLecturer() {
        String teacherID = teacherIDTextField.getText();
        String teacherName = teacherNameTextField.getText();
        String address = addressTextField.getText();
        String workingType = workingTypeTextField.getText();
        String employmentStatus = employmentStatusTextField.getText();
        String workingHoursStr = workingHoursTextField.getText();
        String department = departmentTextField.getText();
        String yearOfExperienceStr = yearOfExperienceTextField.getText();

        if (!isValidInput(teacherID, teacherName, address, workingType, employmentStatus, workingHoursStr, department,
                yearOfExperienceStr)) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please check for missing input fields.");
            return null;
        }

        try {
            if (findLecturer(Integer.parseInt(teacherID)) == null) {

                int teacherId = Integer.parseInt(teacherID);
                int workingHours = Integer.parseInt(workingHoursStr);
                int yearOfExperience = Integer.parseInt(yearOfExperienceStr);

                if(isNegative(teacherId,workingHours,yearOfExperience)){
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Input Field cannot be less than zero.");
                    return null;
                }
                // new Lecturer object
                Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,
                        workingHours, department, yearOfExperience);

                JOptionPane.showMessageDialog(null, "Lecturer added successfully!");
                clearTextField();
                return lecturer;

            } else {
                JOptionPane.showMessageDialog(null,
                        "Teacher with ID : " + Integer.parseInt(teacherID) + " already exists.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input! Please fill input fields with their specific values only.");
            return null;
        }catch(Exception y){
            JOptionPane.showMessageDialog(null,
            "Invalid input! Lecturer was not added.");
            return null;
        }
        return null;
    }

    // new Tutor object
    private Tutor addTutor() {
        String teacherID = teacherIDTextField.getText();
        String teacherName = teacherNameTextField.getText();
        String address = addressTextField.getText();
        String workingType = workingTypeTextField.getText();
        String employmentStatus = employmentStatusTextField.getText();
        String workingHoursStr = workingHoursTextField.getText();
        String salaryStr = salaryTextField.getText();
        String performanceIndexStr = performanceIndexTextField.getText();
        String academyQualification = academyQualificationTextField.getText();
        String specialization = specializationTextField.getText();

        if (!isValidInput(teacherID, teacherName, address, workingType, employmentStatus, workingHoursStr, salaryStr,
                performanceIndexStr, academyQualification, specialization)) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please check for missing input fields.");
            return null;
        }
        try {
            if (findTutor(Integer.parseInt(teacherID)) == null) {

                int teacherId = Integer.parseInt(teacherID);
                int workingHours = Integer.parseInt(workingHoursStr);
                int salary = Integer.parseInt(salaryStr);
                int performanceIndex = Integer.parseInt(performanceIndexStr);

                if(isNegative(teacherId,workingHours,salary,performanceIndex)){
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Input Field cannot be less than zero.");
                    return null;
                }

                // new Tutor object
                Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours,
                        salary, specialization, academyQualification, performanceIndex);

                JOptionPane.showMessageDialog(null, "Tutor added successfully!");
                clearTextField();
                return tutor;

            } else {
                JOptionPane.showMessageDialog(null,
                        "Teacher with ID : " + Integer.parseInt(teacherID) + "already exists.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input! Please fill input fields with their specific values only.");
            return null;
        }catch(Exception y){
            JOptionPane.showMessageDialog(null,
            "Invalid input! Tutor was not added .");
            return null;
        }
        return null;
    }

   
    // for clearing all textFields
    public void clearTextField() {
        teacherIDTextField.setText("");
        teacherNameTextField.setText("");
        addressTextField.setText("");
        workingTypeTextField.setText("");
        employmentStatusTextField.setText("");
        workingHoursTextField.setText("");
        departmentTextField.setText("");
        gradedScoreTextField.setText("");
        yearOfExperienceTextField.setText("");
        salaryTextField.setText("");
        performanceIndexTextField.setText("");
        academyQualificationTextField.setText("");
        specializationTextField.setText("");
    }

    // removingtutor
    public void removeTutor() {
        int teacherId = Integer.parseInt(teacherIDTextField.getText());

        for (Teacher i : teachers) {
            if (i.getteacher_id() == teacherId) {
                teachers.remove(i);
            }
        }
    }
/* Using Variable Arguments
    // for cheaking isValidMethod
    private boolean isValidInput(String... inputs) {
        for (String input : inputs) {
            String a = input.trim();
            if (a.equals("")) {
                return false;
            }
        }
        return true;
    }
    */

    // Method OverLoading

    private boolean isValidInput(String a)
    {
        if(a.equals("")){
            return false;
        }
        return true;
    }
    
    private boolean isValidInput(String a, String b, String c) {
        if ((a.equals("")) || (b.equals("")) || (c.equals(""))) {
            return false;
        }
        return true;
    }

    private boolean isValidInput(String a, String b, String c,String d) {
        if ((a.equals("")) || (b.equals("")) || (c.equals(""))||(d.equals(""))) {
            return false;
        }
        return true;
    }

    private boolean isValidInput(String a, String b, String c, String d, String e, String f, String g, String h) {
        if ((a.equals("")) || (b.equals("")) || (c.equals("")) || (d.equals("")) || (e.equals("")) || (f.equals(""))
                || (g.equals("")) || (h.equals(""))) {
            return false;
        }
        return true;
    }

    private boolean isValidInput(String a, String b, String c, String d, String e, String f, String g, String h,
            String i, String j) {
        if ((a.equals("")) || (b.equals("")) || (c.equals("")) || (d.equals("")) || (e.equals("")) || (f.equals(""))
                || (g.equals("")) || (h.equals("")) || (i.equals("")) || (j.equals(""))) {
            return false;
        }
        return true;
    }


    // Cheak For Negative Ones 

    private boolean isNegative(int a)
    {
        if(a<0){
            return true;
        }
        return false;
    }

    private boolean isNegative(int a,int b,int c)
    {
        if((a<0)||(b<0)||(c<0)){
            return true;
        }
        return false;
    }
    private boolean isNegative(int a,int b,int c,int d)
    {
        if((a<0)||(b<0)||(c<0)||(d<0)){
            return true;
        }
        return false;
    }


    private Lecturer findLecturer(int teacherId) {
        for (Teacher teacher : teachers) {
            if ((teacher instanceof Lecturer) && (teacher.getteacher_id() == teacherId)) {
                return (Lecturer) teacher; // Casting to Lecturer
            }
        }
        return null;
    }

    // will cheak every id and found it the right one
    private Tutor findTutor(int teacherId) {

        for (Teacher teacher : teachers) {
            if ((teacher instanceof Tutor) && (teacher.getteacher_id() == teacherId)) {
                return (Tutor) teacher;
            }
        }
        return null;
    }

    // For display method
    public void displayLecturer() {
        int count = 0;

        // Cheak if there exists any Lecturer type of object in ArrayList
        for (Teacher teacher : teachers) {
            if (teacher instanceof Lecturer) {
                count++;
                break;
            }
        }
        if (count <= 0) {
            JOptionPane.showMessageDialog(null, "There are currently no Lecturers to display.");
            return;
        } else {
            System.out.println();

            System.out.println("  ".repeat(40) + "Lecturers Deatils");

            System.out.println(" " + "-------------------------".repeat(7));
            System.out.printf("| %-5s | %-25s | %-22s | %-17s | %-22s | %-17s | %-22s | %-21s  |\n",
                    "ID", "Lecturer Name", "Address", "Working Type", "Employment Status",
                    "Working Hour", "Department", "Year Of Experience");
            System.out.println(
                " " +  "-------------------------".repeat(7));

            for (Teacher teacher : teachers) {
                if (teacher instanceof Lecturer) {
                    Lecturer lecturer = (Lecturer) teacher;
                    System.out.printf("| %-5s | %-25s | %-22s | %-17s | %-22s | %-17s | %-22s | %-21s  |\n",
                            lecturer.getteacher_id(), lecturer.getname(), lecturer.getaddress(),
                            lecturer.getworking_type(), lecturer.getemployment_status(),
                            lecturer.getworking_hours(), lecturer.getdepartment(),
                            lecturer.getyearOfExperience());

                }
            }
            System.out.println(
                " " + "-------------------------".repeat(7));
        }
    }

    public void displayTutor() {

        int count = 0;

        // Cheak if there exists any Tutor type of object in ArrayList
        for (Teacher teacher : teachers) {
            if (teacher instanceof Tutor) {
                count++;
                break;
            }
        }
        if (count <= 0) {
            JOptionPane.showMessageDialog(null, "There are currently no tutors to display.");
            return;
        } else {
            System.out.println();

            System.out.println("  ".repeat(40) + "Tutor Deatils");

            System.out.println(
                    " " + "-------------------------".repeat(7));
            System.out.printf("| %-5s | %-15s | %-18s | %-13s | %-17s | %-12s | %-12s | %-16s | %-20s | %-16s |\n",
                    "ID", "Tutor Name", "Address", "Working Type", "Employment Status",
                    "Working Hour", "Salary", "Specialization", "Academic Qualification", "Performance Index");
            System.out.println(
                    " " + "-------------------------".repeat(7));

            for (Teacher teacher : teachers) {
                if (teacher instanceof Tutor) {
                    Tutor tutor = (Tutor) teacher;

                    System.out.printf(
                            "| %-5s | %-15s | %-18s | %-13s | %-17s | %-12s | %-12s | %-16s | %-22s | %-16s  |\n",
                            tutor.getteacher_id(), tutor.getname(), tutor.getaddress(),
                            tutor.getworking_type(), tutor.getemployment_status(),
                            tutor.getworking_hours(), tutor.getsalary(), tutor.getspecialization(),
                            tutor.getacademic_qualifications(), tutor.getperformance_index());

                }
            }
            System.out.println(
                    " " + "-------------------------".repeat(7));

        }
    }
}

public class TeacherGUI_Final extends Teacher {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }
}
