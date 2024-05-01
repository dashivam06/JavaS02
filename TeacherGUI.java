
// Importing Essentials for GUI 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;

class MyFrame extends JFrame {


    // ArrayList Declaration to Store Lecturer and Tutors Of Teacher Class
    ArrayList<Teacher> teachers = new ArrayList<>();

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
        // setting up the JFrame 
        setTitle("Teacher Database Portal ");       // for frame title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // for frame close button behaviour
        setSize(1600, 900);     // for frame size
        setLocation(130, 20);            // frame location on the screen

        GridLayout gridLayout = new GridLayout(3, 4);

        // for positioning elements onto frame with points
        GridBagConstraints gbc = new GridBagConstraints();
        // Grid layout for main frame
        setLayout(gridLayout); 



        // For 1st Row of frame
        // For Teacher Input Fields **(Mandatory)

        // Initializing JLabels
        teacherIDLabel = new JLabel("Teacher ID   :");
        teacherNameLabel = new JLabel("Teacher Name   :");
        addressLabel = new JLabel("Address   :");
        workingTypeLabel = new JLabel("Working Type   :");
        employmentStatusLabel = new JLabel("Employment Status   :");
        workingHoursLabel = new JLabel("Working Hours   :");

        teacherIDLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        teacherNameLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        workingTypeLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        addressLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        employmentStatusLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        workingHoursLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        // Initializing JTextFields
        teacherIDTextField = new JTextField(10);
        teacherNameTextField = new JTextField(20);
        addressTextField = new JTextField(15);
        workingTypeTextField = new JTextField(10);
        employmentStatusTextField = new JTextField(10);
        workingHoursTextField = new JTextField(10);

        // will store mandatory teacher fields 
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

        // Adding the panel to the frame and positioning it. (  1st Row   )
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        this.add(teacherPanel, gbc);









    
        // For 2nd Row of Frame 



        // Creating panel for 2nd row of frame to include instructions,displaytutor and displaylecturer button and clear field
        JPanel teacherButtonPanel = new JPanel(new BorderLayout());

        // Buttons For Displaying lecturer and tutor details 
        JButton displayTutor = new JButton("Display Tutor Details");
        JButton displayLecturer = new JButton("Display Lecturer Details");

        // clear Button
        JButton clearButton = new JButton("Clear All Input Fields");

        // Changing Fonts And Backgrounds of buttons 
        clearButton.setFont(new Font("Consolas", Font.BOLD, 16));
        clearButton.setForeground(new Color(60, 90, 111));
        clearButton.setBackground(new Color(199, 188, 161));
        displayLecturer.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        displayLecturer.setBackground(new Color(232, 246, 239));
        displayTutor.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        displayTutor.setForeground(Color.BLACK);
        displayTutor.setBackground(new Color(232, 246, 239));

        // Will Contain different Instruction in the form of JLabels 
        JPanel forNote = new JPanel(new GridLayout(10, 1));

        // Instructions to be followed and will be added to forNote panel 
        JLabel note = new JLabel(" Instructions : ");
        JLabel instruction1 = new JLabel(
                "     1)   Please fill all the required input fields with valid values only .");
        JLabel instruction2 = new JLabel(
                "     2)   To add Lecturer provide with Teacher Id, Teacher Name, Address, Working Type, Employment Status, Working Hour, Year of Experience and Department Name.  ");
        JLabel instruction3 = new JLabel(
                "     3)   To add Tutor provide with Teacher Id, Teacher Name, Address, Working Type, Employment Status, Working Hour, Salary, Performance Index, ");
        JLabel subinstruction3 = new JLabel(
                "                  Academic Qualification and Specialization accurately.");
        JLabel instruction4 = new JLabel(
                "     4)   To assign grades provide with Teacher Id, Graded Score, Year of Experience ( YOE ) and Department in their respective input fields .");
        JLabel instruction5 = new JLabel(
                "     5)   To set salary provide with correct Teacher ID, Salary and Performance Index in their respective input fields accurately .");
        JLabel instruction6 = new JLabel(
                "     6)   To remove Tutor provide with correct Tutor ID in Teacher ID Field.");
        JLabel instruction7 = new JLabel(
                "     7)   To display Lecturer's or Tutor's details kindly check console window ( Terminal ) . ");

        // Setting Font for the Instruction Portion
        note.setFont(new Font("Consolas", Font.BOLD, 15));
        instruction1.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction2.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction3.setFont(new Font("Verdana", Font.PLAIN, 13));
        subinstruction3.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction4.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction5.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction6.setFont(new Font("Verdana", Font.PLAIN, 13));
        instruction7.setFont(new Font("Verdana", Font.PLAIN, 13));

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


        // will includes 2 button for displayig tutor and lecturer
        JPanel displayTeachersPanel = new JPanel(new GridLayout(1, 2)); 
                                                                        

        displayTeachersPanel.add(displayLecturer);
        displayTeachersPanel.add(displayTutor);

        // Adding buttons to the panel
        teacherButtonPanel.add(clearButton, BorderLayout.NORTH);
        teacherButtonPanel.add(displayTeachersPanel, BorderLayout.SOUTH);

        // adding instructions onto the panel
        teacherButtonPanel.add(forNote, BorderLayout.CENTER);

        // Adding the panel to the frame    ( 2nd Row )
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 4;

        this.add(teacherButtonPanel);










        // For 3rd Row of Frame 
        
        
        
        // For Lecturer Panel
        
        // Initializing JLabels
        departmentLabel = new JLabel("Department    :");
        gradedScoreLabel = new JLabel("Graded Score   :");
        yearOfExperienceLabel = new JLabel("Year Of Experience   :");

        departmentLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        gradedScoreLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        yearOfExperienceLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        // Initializing JTextFields
        departmentTextField = new JTextField(15);
        gradedScoreTextField = new JTextField(10);
        yearOfExperienceTextField = new JTextField(10);

        // Buttons for Lecturer functions
        JButton addLecturerButton = new JButton("Add Lecturer");
        JButton gradeAssignmentButton = new JButton("Grade Assignment");

        addLecturerButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        addLecturerButton.setBackground(new Color(176, 197, 164));
        gradeAssignmentButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        gradeAssignmentButton.setBackground(new Color(255, 251, 218));

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

        // Creating panel to add add lecturer and gradeassignment button 
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 5, 5));
        buttonPanel.add(addLecturerButton);
        buttonPanel.add(gradeAssignmentButton);

        // Main panel to group button and txtfield of lecturer
        JPanel mainLecturerPanel = new JPanel();
        mainLecturerPanel.setLayout(new BorderLayout());
        mainLecturerPanel.add(lecturerPanel, BorderLayout.CENTER);
        mainLecturerPanel.add(buttonPanel, BorderLayout.SOUTH);

     

        // Adding Tutor Panel

        // Initializing JLabels
        salaryLabel = new JLabel("Salary   :");
        performanceIndexLabel = new JLabel("Performance Index   :");
        academyQualificationLabel = new JLabel("Academy Qualification   :");
        specializationLabel = new JLabel("Specialization   :");

        salaryLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        performanceIndexLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        academyQualificationLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        specializationLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        // Initializing JTextFields
        salaryTextField = new JTextField(10);
        performanceIndexTextField = new JTextField(10);
        academyQualificationTextField = new JTextField(15);
        specializationTextField = new JTextField(15);

        // Tutor Functionality Buttons
        JButton addTutorButton = new JButton("Add Tutor");
        JButton removeTutorButton = new JButton("Remove Tutor");
        JButton setSalaryButton = new JButton("Set Salary");

        // setting fonts and background of the buttons
        addTutorButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        addTutorButton.setBackground(new Color(176, 197, 164));
        setSalaryButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        setSalaryButton.setBackground(new Color(170, 215, 217));
        removeTutorButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        removeTutorButton.setBackground(new Color(255, 128, 128));

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
        majorPanel.add(mainLecturerPanel);
        majorPanel.add(mainTutorPanel);

        // Adding majorPanel to the frame(  3rd Row   )
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4; // let it take all the column space

        this.add(majorPanel, gbc);      

        this.pack();    // will help consume extra spacig on the frame 

        // changing the default visibility of frame & making frame visible
        setVisible(true); 







/*

                <<<  ---------  -----------   -----------   ----------     Action Listeners Portions  ---------  -----------   -----------  ----------    >>>

 */ 







        // for clear button
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all the fields?",
                "Confirmation", JOptionPane.YES_NO_OPTION);


                    if(option == 0){
                        clearTextField();
                
                    }
            }
        });

        // for displaymethod
        displayLecturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayLecturer();

            }
        });
        // for displaytutorbutton
        displayTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // displayTutor();
                displayTutor();

            }

        });

        // foraddlecturerbutton
        addLecturerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher teacher1 = addLecturer();
                if (teacher1 != null) {
                    teachers.add(teacher1);
                }
            }
        });

        // for addtutorbutton
        addTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher teacher2 = addTutor();
                if (teacher2 != null) {
                    teachers.add(teacher2);
                }
            }

        });




/**
 * ActionListener for the gradeAssignmentButton.
 * Assigns a grade to a Lecturer based on the provided teacher ID, graded score, department, and years of experience.
 */


 gradeAssignmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input values from text fields and trim leading/trailing whitespace
                String teacherID = teacherIDTextField.getText().trim();
                String gradeStr = gradedScoreTextField.getText().trim();
                String department = departmentTextField.getText().trim();
                String yearStr = yearOfExperienceTextField.getText().trim();

                try {
                    // Input validation
                    if (!isValidInput(teacherID, gradeStr, yearStr, department)) {
                        JOptionPane.showMessageDialog(null,
                                "\nInvalid input!! \nPlease check your entries for Teacher ID, GradedScore, \nDepartment and Year of Experience.\n\n"+
                                "Note : See instructions for help." );
                        return;
                    }

                    int teacherId = Integer.parseInt(teacherID);
                    int gradedScore = Integer.parseInt(gradeStr);
                    int yearsOfExperience = Integer.parseInt(yearStr);

                    // Checking for negative values
                    if (isNegative(teacherId, gradedScore, yearsOfExperience)) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input!! \nInput Field cannot have negative values.\n");
                        return;
                    }
                    // Check for numeric values in the department field
                    if(containsNumbers(department)){
                        JOptionPane.showMessageDialog(null,
                                "Invalid input! \nNumeric values are not allowed in the department field. "+
                                    "\nPlease correct your input.");
                        return ;
                    }

                    // cheaking identity of lecturer to know if they exists already or not
                    Lecturer lecturer = findLecturer(teacherId);
                    if (lecturer != null) { // if lecturer exists then 
                        // Calling grade assignment method from Lecturer class
                        String result = lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                        if (lecturer.gethasGraded()) {
                            JOptionPane.showMessageDialog(null,
                                    "( " + result + " ) Assigned and Grade assignment successful for lecturer "
                                            + teacherID + "\nTeacher ID : " + teacherId + "\nGraded Score : "
                                            + gradedScore + "\nDepartment : " + department + "\nYears of Experience : "
                                            + yearsOfExperience);
                            clearTextField();   // clearing textfield after gradingAssignment
                        } else {
                            JOptionPane.showMessageDialog(null, result);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Lecturer with ID " + teacherID + " not found.");
                    }
                } catch (NumberFormatException g) {
                    // Display error message for invalid numerical input
                    JOptionPane.showMessageDialog(null,
                            "Oops! It seems you've entered invalid input. \nPlease provide valid numerical values for :\n"+
                            "1) Teacher ID \n"
                            +"2) Graded Score \n"
                            +"3) Year Of Experience \n"
                           );
                } catch (Exception z) {
                    // Displaying standard error message for other exceptions
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! \nGrade cannot be assigned.");
                }
            }
        });







/**
 * ActionListener for the setSalaryButton.
 * Sets the salary and performance index for a Tutor based on the provided teacher ID.
 */  



 setSalaryButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {        
                // Retrieve input values from text fields and trim leading/trailing whitespace
                String teacherID = teacherIDTextField.getText().trim();
                String salaryStr = salaryTextField.getText().trim();
                String performanceStr = performanceIndexTextField.getText().trim();

                try {
                    // check if teacher ID, salary or performanceindex input is empty string or not
                    if (!isValidInput(teacherID, salaryStr, performanceStr)) {
                        // if the input field is empty string showing suitable message in information dialog
                        JOptionPane.showMessageDialog(null,
                                "\nInvalid input!! \nPlease check your entries for Teacher ID,\nSalary and Performance Index.\n\n"+
                                "Note : See instructions for help." );
                        return;
                    }

                    // Parsing input strings to integers
                    int teacherId = Integer.parseInt(teacherID);
                    int salary = Integer.parseInt(salaryStr);
                    int performanceIndex = Integer.parseInt(performanceStr);
                   

                    // Checking for negative values
                    if (isNegative(teacherId, salary, performanceIndex)) {
                         // if the input field is a negative value showing suitable message in information dialdog
                        JOptionPane.showMessageDialog(null,
                                "Invalid input!! \nInput Field cannot have negative values.\n");
                        return;
                    }

                    // Finding tutor to know if they exists already or not
                    Tutor tutor = findTutor(teacherId);
                    if (tutor != null) {
                        // Calling set salary method and storing the returned boolean value onto a variable 
                        boolean isIncreased = tutor.setsalary(salary, performanceIndex);

                        int appraisal = (int)tutor.getsalary() - salary;
                        // if salary was set then show new salary and performance index in a dialog box 
                        if (isIncreased == true) {
                            JOptionPane.showMessageDialog(null,
                                    "Salary and performance index updated for Tutor ID : " + teacherID
                                            + "\nNew Salary : "
                                            + (int)tutor.getsalary() + "\nUpdated Performance Index : " + performanceIndex+
                                            "\nBonus Amount : "+appraisal);
                            clearTextField();       // clearing textfields after setting salary 
                        } else {
                            // if salary was not set then displaying suitable information dialog
                            JOptionPane.showMessageDialog(null, "Requirements not met for salary increment.");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                    }
                } catch (NumberFormatException f) {
                    // Display error message for invalid numerical input
                    JOptionPane.showMessageDialog(null,
                            "Oops! It seems you've entered invalid input. \nPlease provide valid numerical values for  "+                             
                             "1) Teacher ID \n"
                            +"2) Salary \n"
                            +"3) Perforamnce Index");
                } catch (Exception y) {
                    // Displaying standard error message for other exceptions
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Salary was not set.");
                }
            }
        });









/**
 * ActionListener for the removeTutorButton.
 * Removes a Tutor from the list based on the provided teacher ID.
 */
        removeTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve teacher ID from text field and trim leading/trailing whitespace
                String teacherID = teacherIDTextField.getText().trim();

                try {
                    // check if teacher ID input is empty string or not
                    if (!isValidInput(teacherID)) {
                        JOptionPane.showMessageDialog(null, "\nInvalid input!! \n" + 
                                                        "Please check your entries for Teacher ID\n\n"+
                        "Note : See instructions for help." );
                        return;
                    }
                    // Parsing teacher ID to integer
                    int teacherId = Integer.parseInt(teacherID);

                    // Checking for negative values in teacher ID
                    if (isNegative(teacherId)) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input!! \nInput Field cannot have negative values.\n");
                        return;
                    }

                    // Asking for confirmation before removing the tutor
                    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to proceed?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == 0) { 
                    // Finding if Tutor object with given ID already exists or not 
                    Tutor tutor = (Tutor) findTutor(teacherId);
                    if (tutor != null) {
                        // if it yes then do following
                            tutor.removetutor(); // Calling the function to set all of its instances to default
                            teachers.remove(tutor); // Removing the tutor object from the arrayList
                            JOptionPane.showMessageDialog(null,
                                    "Tutor with ID " + teacherID + " removed successfully.");
                            clearTextField();// Clearing text fields after removing tutor
                        }
                    else {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                    }
                }
                } catch (NumberFormatException h) {
                    // Display error message for invalid numerical input
                    JOptionPane.showMessageDialog(null,
                            "Oops! It seems you've entered invalid input. "+
                                "\nPlease provide valid numerical values for : \n1) Teacher ID");
                } catch (Exception y) {
                    // Displaying standard error message for other exceptions
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Tutor was not removed." + y);
                }
            }
        });
    }











/*

                <<<  ---------  -----------   -----------   ----------    Important Method & Functions Section  ---------  -----------   -----------  ----------    >>>

 */ 









/**
 * Method to add a new lecturer.
 * Retrieves input values from text fields, validates them, and creates a new Lecturer object.
 * Displays appropriate error messages if input is invalid or if a lecturer with the same ID already exists.
 * Returns the newly created Lecturer object if successful, otherwise returns null.
 */

    public Lecturer addLecturer() {
        // Retrieving input values from text fields and trim leading/trailing whitespace
        String teacherID = teacherIDTextField.getText().trim();
        String teacherName = teacherNameTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String workingType = workingTypeTextField.getText();
        String employmentStatus = employmentStatusTextField.getText().trim();
        String workingHoursStr = workingHoursTextField.getText().trim();
        String department = departmentTextField.getText().trim();
        String yearOfExperienceStr = yearOfExperienceTextField.getText().trim();

        try{
        if (!isValidInput(teacherID, teacherName, address, workingType, employmentStatus, workingHoursStr, department,
                yearOfExperienceStr)) {
            JOptionPane.showMessageDialog(null, 
                    "Oops! It looks like some fields are empty or contain invalid data.\n"+
                    "Before proceeding, please ensure all required fields are filled properly.\n\n"+
                    "Note : See instructions for help." );
            return null;
        }

            // Check if teacher with the same ID already exists
            if (findTeacher(Integer.parseInt(teacherID)) == null) {

                int teacherId = Integer.parseInt(teacherID);
                int workingHours = Integer.parseInt(workingHoursStr);
                int yearOfExperience = Integer.parseInt(yearOfExperienceStr);

                // Check for negative values in input fields
                if (isNegative(teacherId, workingHours, yearOfExperience)) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input!! \nInput Field cannot have negative values.\n");
                    return null;
                }
                // Check for numeric values in non-numeric fields
                if((containsNumbers(department))||containsNumbers(employmentStatus)||containsNumbers(workingType)
                        ||containsNumbers(address)||containsNumbers(teacherName)){
                    JOptionPane.showMessageDialog(null, 
                            "Invalid input! \nNumeric values are not allowed in name, address, working type,"+
                                "\nand employment status fields. \nPlease correct your input.\n\n"+
                                "Note : See instructions for help." );
                    return null;
                }
                // Creating new Lecturer object
                Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,
                        workingHours, department, yearOfExperience);
                 // Displaying success message, clear text fields, and return newly created Lecturer object
                JOptionPane.showMessageDialog(null, "Lecturer added successfully.");
                clearTextField();
                return lecturer;

            } else {
                // Display error message if teacher with the same ID already exists
                JOptionPane.showMessageDialog(null,
                        "Teacher with ID : " + Integer.parseInt(teacherID) + " already exists.");
            }
        
        return null;
    } catch (NumberFormatException e) {
            // Display error message for invalid numerical input
        JOptionPane.showMessageDialog(null,
                "Oops! It seems you've entered invalid input. \nPlease provide valid numerical values for \n"+
                "1) Teacher ID \n"
                +"2) Working Hours \n"
                +"3) Year of Experience");
        return null;
    } catch (Exception y) {
            // Displaying a standard error message for other exceptions
        JOptionPane.showMessageDialog(null,
                "Invalid input! Tutor was not added .");
        return null;
    }
    }



/**
 * Creates a new Tutor object with the input provided by the user.
 * Validates the input fields and ensures they are not empty or contain invalid data.
 * Displays appropriate error messages if input is invalid or if a teacher with the same ID already exists.
 * Returns the newly created Tutor object if successfully added, otherwise returns null.
 */


 private Tutor addTutor() {

        // Retrieve input values from text fields
        String teacherID = teacherIDTextField.getText().trim();
        String teacherName = teacherNameTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String workingType = workingTypeTextField.getText();
        String employmentStatus = employmentStatusTextField.getText().trim();
        String workingHoursStr = workingHoursTextField.getText().trim();
        String salaryStr = salaryTextField.getText().trim();
        String performanceIndexStr = performanceIndexTextField.getText().trim();
        String academyQualification = academyQualificationTextField.getText().trim();
        String specialization = specializationTextField.getText().trim();


            // Check if all input fields are valid i.e thay are not empty string
        if (!isValidInput(teacherID, teacherName, address, workingType, employmentStatus, workingHoursStr, salaryStr,
                performanceIndexStr, academyQualification, specialization)) {
            // Displaying error message for invalid or empty fields
            JOptionPane.showMessageDialog(null, 
                        "Oops! It looks like some fields are empty or contain invalid data. "
                            +"\nPlease fill in all required fields with accurate information.\n\n"+
                            "Note : See instructions for help." );
            return null;
        }
        try {
            // Checking if teacher with the same ID already exists
            if (findTeacher(Integer.parseInt(teacherID)) == null) {
            
                // Parsing String input values to integaer data types
                int teacherId = Integer.parseInt(teacherID);
                int workingHours = Integer.parseInt(workingHoursStr);
                int salary = Integer.parseInt(salaryStr);
                int performanceIndex = Integer.parseInt(performanceIndexStr);

                // Checking if any numeric field is negative
                if (isNegative(teacherId, workingHours, salary, performanceIndex)) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! \nInput Field cannot have Negative Values");
                    return null;
                }
                           
                // Checking if numeric values are present in non-numeric fields
                if((containsNumbers(specialization))||containsNumbers(academyQualification)
                    ||containsNumbers(employmentStatus)||containsNumbers(workingType)
                    ||containsNumbers(address)||containsNumbers(teacherName)){
                        
                    JOptionPane.showMessageDialog(null, 
                        "Invalid input! \nNumeric values are not allowed in name, address, working type,"+
                        "\nemployment status, specialization and academic qualificationfields. "
                        +"\nPlease correct your input.\n\n"+
                        "Note : See instructions for help." );
                    return null;
                }

                // Creating new Tutor object
                Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours,
                        salary, specialization, academyQualification, performanceIndex);

                                    
                // Displaing success message
                JOptionPane.showMessageDialog(null, "Tutor added successfully!");
                clearTextField(); // clearing TextFields after adding tutors
                return tutor;

            } else {
                // Displaying error message if teacher with the same ID already exists
                JOptionPane.showMessageDialog(null,
                        "Teacher with ID : " + Integer.parseInt(teacherID) + " already exists.");
            }
                // Displaying error message for invalid numerical input
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Oops! It seems you've entered invalid input. \nPlease provide valid numerical values for :\n"+
                "1) Teacher ID \n"
                +"2) Working Hours \n"
                +"3) Salary \n"
                +"4) Perforamnce Index");
            return null;
                 // Displaying a standard error message for other exceptions
        } catch (Exception y) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input! Tutor was not added .");
            return null;
        }
        return null;
    }









/**
 * Clears all text fields in the GUI.
 */
    public void clearTextField() {

      

        // Clear each text field in frame 
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











    



/**
 * Displays details of all lecturers in a new frame.
 * If there are no lecturers to display, shows a message dialog.
 */
public void displayLecturer() {
    int count = 0;

    // Cheak if there exists any Lecturer type of object in ArrayList
    for (Teacher teacher : teachers) {
        if (teacher instanceof Lecturer) {

            
            // if any instance of Lecturer found increase the count value and break the loop 
            count++;
            break;
        }
    }
    if (count <= 0) {
        // If no lecturers found, display a message dialog
        JOptionPane.showMessageDialog(null, "There are currently no Lecturers to display.");
        return;
    } else {
        
        // Creating a new frame to display lecturer details
        JFrame displayLecturerFrame = new JFrame("Lecturer Details");
        displayLecturerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        displayLecturerFrame.setSize(940, 280);
        displayLecturerFrame.setLocationRelativeTo(null); // Center the frame on the screen

        JPanel panel = new JPanel(new BorderLayout());
        displayLecturerFrame.add(panel);

        String[] columnNames = { "ID", "Lecturer Name", "Address", "Working Type", "Employment Status",
                "Working Hour", "Department", "Year Of Experience" };
        String[][] rowData = new String[teachers.size()][columnNames.length];

        int rowIndex = 0;
        // Iterate over the teachers list to populate the table data
        for (Teacher teacher : teachers) {
            if (teacher instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) teacher;
                // Populate rowData with lecturer details
                rowData[rowIndex][0] = String.valueOf(lecturer.getteacher_id());
                rowData[rowIndex][1] = lecturer.getname();
                rowData[rowIndex][2] = lecturer.getaddress();
                rowData[rowIndex][3] = lecturer.getworking_type();
                rowData[rowIndex][4] = lecturer.getemployment_status();
                rowData[rowIndex][5] = String.valueOf(lecturer.getworking_hours());
                rowData[rowIndex][6] = String.valueOf(lecturer.getdepartment());
                rowData[rowIndex][7] = String.valueOf(lecturer.getyearOfExperience());
                rowIndex++;
            }
        }
        // Creating a JTable with the rowData and columnNames
        JTable table = new JTable(rowData, columnNames);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable auto-resizing of columns

        // Set preferred column widths for each column
        table.getColumnModel().getColumn(0).setPreferredWidth(50); // ID
        table.getColumnModel().getColumn(1).setPreferredWidth(125); // Tutor Name
        table.getColumnModel().getColumn(2).setPreferredWidth(160); // Address
        table.getColumnModel().getColumn(3).setPreferredWidth(110); // Working Type
        table.getColumnModel().getColumn(4).setPreferredWidth(130); // Employment Status
        table.getColumnModel().getColumn(5).setPreferredWidth(100); // Working Hour
        table.getColumnModel().getColumn(6).setPreferredWidth(140); // Department
        table.getColumnModel().getColumn(7).setPreferredWidth(115); // Year Of Experience

         // Create a JScrollPane to contain the table
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // setting the visible property to true if display Lecturer button is pressed
        displayLecturerFrame.setVisible(true);
    }
}









/**
* Displays details of all tutors in a new frame.
* If there are no tutors to display, shows a message dialog.
*/

public void displayTutor() {

    // will count the number of Tutor in the ArrayList
    int count = 0;  // starting from zero 

    // iterate over all the ArrayList element & check if there exists any Tutor type of object in ArrayList
    for (Teacher teacher : teachers) {      
        if (teacher instanceof Tutor) {

            // if any instance of Tutor found increase the count value and break the loop 
            count++;    
            break;  
        }
    }
    if (count <= 0) {   // check if there exists atleast one object of tutor in the list or not 
        // if there are not even 1 object of tutor in the list display appropriate message and return 
        JOptionPane.showMessageDialog(null, "There are currently no Tutors to display.");
        return;
    } else {            // if there are objects of tutor in the list do the following things 

        // Creating a new frame to display Tutor details
        JFrame displayTutorFrame = new JFrame("Tutor Details");     
        displayTutorFrame.setTitle("Tutor Details");    
        displayTutorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        displayTutorFrame.setSize(1135, 280); 
        displayTutorFrame.setLocationRelativeTo(null);

        // Creating a panel for the frame and adding it onto the frame 
        JPanel panel = new JPanel(new BorderLayout());
        displayTutorFrame.add(panel);

        // Creating an array for holding column names
        String[] columnNames = { "ID", "Tutor Name", "Address", "Working Type", "Employment Status",
                "Working Hour", "Salary", "Specialization", "Academic Qualification", "Performance Index" };

        // Creating a two-dimensional array to hold the data for each teacher in the table
        String[][] rowData = new String[teachers.size()][columnNames.length];

        int rowIndex = 0;
        for (Teacher teacher : teachers) {
            if (teacher instanceof Tutor) {
                Tutor tutor = (Tutor) teacher;
                // Extracting data from each Tutor object and populating the table row by row
                rowData[rowIndex][0] = String.valueOf(tutor.getteacher_id());
                rowData[rowIndex][1] = tutor.getname();
                rowData[rowIndex][2] = tutor.getaddress();
                rowData[rowIndex][3] = tutor.getworking_type();
                rowData[rowIndex][4] = tutor.getemployment_status();
                rowData[rowIndex][5] = String.valueOf(tutor.getworking_hours());
                rowData[rowIndex][6] = String.valueOf((int) tutor.getsalary());
                rowData[rowIndex][7] = tutor.getspecialization();
                rowData[rowIndex][8] = tutor.getacademic_qualifications();
                rowData[rowIndex][9] = String.valueOf(tutor.getperformance_index());
                rowIndex++;
            }
        }
        
        // Initialized the JTable variable which will contain all the values of the Tutor
        JTable table = new JTable(rowData, columnNames);       
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disabled auto-resizing of columns

        // Set preferred column widths for each column
        table.getColumnModel().getColumn(0).setPreferredWidth(45); // ID
        table.getColumnModel().getColumn(1).setPreferredWidth(120); // Tutor Name
        table.getColumnModel().getColumn(2).setPreferredWidth(160); // Address
        table.getColumnModel().getColumn(3).setPreferredWidth(110); // Working Type
        table.getColumnModel().getColumn(4).setPreferredWidth(120); // Employment Status
        table.getColumnModel().getColumn(5).setPreferredWidth(100); // Working Hour
        table.getColumnModel().getColumn(6).setPreferredWidth(80); // Salary
        table.getColumnModel().getColumn(7).setPreferredWidth(130); // Specialization
        table.getColumnModel().getColumn(8).setPreferredWidth(140); // Academic Qualification
        table.getColumnModel().getColumn(9).setPreferredWidth(120); // Performance Index

        JScrollPane scrollPane = new JScrollPane(table);    // initialized a JScrollpane to contain the table
        panel.add(scrollPane, BorderLayout.CENTER);         // adding scrollPane to the panel of new Popup display Tutor frame

        // if display tutor button is pressed set the visible property of the frame to true and display the frame 
        displayTutorFrame.setVisible(true);
    }   

}









/*

                <<<  ---------  -----------   -----------   ----------    Simple Validation Method & Functions Section  ---------  -----------   -----------  ----------    >>>

 */ 







/**
 * Checks if all given strings are not empty using Method OverLoading.
 *  returns true if all strings are not empty, otherwise false.
 */

    private boolean isValidInput(String a) {
        if (a.equals("")) {
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

    private boolean isValidInput(String a, String b, String c, String d) {
        if ((a.equals("")) || (b.equals("")) || (c.equals("")) || (d.equals(""))) {
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















    /**
     * Cheak if the input is less than 0 
     * if input < 0 return true otherwise, return false
     */

    private boolean isNegative(int a) {
        if (a < 0) {          
            return true;        

        }  
        return false;
    }

    private boolean isNegative(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            return true;
        }
        return false;
    }

    private boolean isNegative(int a, int b, int c, int d) {
        if ((a < 0) || (b < 0) || (c < 0) || (d < 0)) {
            return true;
        }
        return false;
    }













  /**
 * Checks if a teacher with the same ID already exists in the ArrayList.
 * Iterates through each teacher's ID and compares it with the given ID.
 * Returns true if a teacher with the same ID is found, otherwise false.
 */

    // for Teacher as a whole
    private Teacher findTeacher(int teacherId) {
        for (Teacher teacher : teachers) {  // iterate over each elements present in teacherlist 

            // if its a instance of Teacher class and also the id matches return the object
            if ((teacher instanceof Teacher) && (teacher.getteacher_id() == teacherId)) {   
                return teacher;
            }
        }
        return null;
    }



    // for Lecturer
    private Lecturer findLecturer(int teacherId) {
        for (Teacher teacher : teachers) {  // iterate over each elements present in teacherlist 

            // if its a instance of Teacher class and also the id matches return the object of Teacher type 
            if ((teacher instanceof Lecturer) && (teacher.getteacher_id() == teacherId)) {
                return (Lecturer) teacher; // Casting to Lecturer class 
            }
        }
        return null;
    }



    // for Tutor
    private Tutor findTutor(int teacherId) {

        for (Teacher teacher : teachers) {  // iterate over each elements present in teacherlist 

            // if its a instance of Teacher class and also the id matches return the object of Teacher type 
            if ((teacher instanceof Tutor) && (teacher.getteacher_id() == teacherId)) {
                return (Tutor) teacher; // Casting to Tutor class 
            }
        }
        return null;
    }







/**
 * Checks if the given string contains any numeric digits.
 * takes input and cheak each character using charat and compare it with number using isDigit() method
 * returns true if if contains number, otherwise false
 */
public static boolean containsNumbers(String value) {

    // Iterating over each character in value
    for (int i = 0; i < value.length(); i++) {
        char character = value.charAt(i);
        // Checking if the character is the digit
        if (Character.isDigit(character)) {
            return true;        // Return true if a digit is found
        }
    }
    // Return false if no digits are found
    return false;
}


}







/*

                <<<  ---------  -----------   -----------   ----------    Main Method & Object Creation Section    ---------  -----------   -----------  ----------    >>>

 */ 









public class TeacherGUI extends Teacher {

    public static void main(String[] args) {

        // Creating an object of the frame which will cause the constructor to display the frame 
        MyFrame frame = new MyFrame();

    }
}