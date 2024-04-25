
// Importing Essentials 
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
        setTitle("Teacher Database Portal ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 900);
        setLocation(130, 20);

        GridLayout gridLayout = new GridLayout(3, 4); // for entire frame

        // for positioning elements onto frame with points
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gridLayout); // setting gridlayout to frame

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
        gbc.gridwidth = 4;
        this.add(teacherPanel, gbc);

        // Creating panel for 2nd row to include instructions,displaytutor and

        // For Clear and Display Button

        // displayLecturer
        JPanel teacherButtonPanel = new JPanel(new BorderLayout());
        JButton displayTutor = new JButton("Display Tutor Details");
        JButton displayLecturer = new JButton("Display Lecturer Details");

        // clear Button
        JButton clearButton = new JButton("Clear All Input Fields");

        // Changing Fonts And Backgrounds
        clearButton.setFont(new Font("Consolas", Font.BOLD, 16));
        clearButton.setForeground(new Color(60, 90, 111));
        clearButton.setBackground(new Color(199, 188, 161));
        displayLecturer.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        displayLecturer.setBackground(new Color(232, 246, 239));
        displayTutor.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        displayTutor.setForeground(Color.BLACK);
        displayTutor.setBackground(new Color(232, 246, 239));

        // Will Contain Instructionn in 2nd Panel
        JPanel forNote = new JPanel(new GridLayout(10, 1));

        // Instructions to be followed
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
        gbc.gridwidth = 4;

        this.add(teacherButtonPanel);

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
        majorPanel.add(mainPanel);
        majorPanel.add(mainTutorPanel);

        // Adding majorPanel to the frame
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4; // let it take all the column space

        this.add(majorPanel, gbc);

        this.pack();
        setVisible(true); // making frame vivible

        // Here Comes ActionListeners Portions

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
                String teacherID = teacherIDTextField.getText().trim();
                String gradeStr = gradedScoreTextField.getText().trim();
                String department = departmentTextField.getText().trim();
                String yearStr = yearOfExperienceTextField.getText().trim();

                try {
                    // Input validation
                    if (!isValidInput(teacherID, gradeStr, yearStr, department)) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input! Please check your entries for ID, GradedScore,Department and YOE.");
                        return;
                    }

                    int teacherId = Integer.parseInt(teacherID);
                    int gradedScore = Integer.parseInt(gradeStr);
                    int yearsOfExperience = Integer.parseInt(yearStr);

                    if (isNegative(teacherId, gradedScore, yearsOfExperience)) {
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
                                            + teacherID + "\nTeacher ID : " + teacherId + "\nGraded Score : "
                                            + gradedScore + "\nDepartment : " + department + "\nYears of Experience : "
                                            + yearsOfExperience);
                            clearTextField();
                        } else {
                            JOptionPane.showMessageDialog(null, result);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Lecturer with ID " + teacherID + " not found.");
                    }
                } catch (NumberFormatException g) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Please fill input fields with their specific values only.");
                } catch (Exception z) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Grade cannot be assigned.");
                }
            }
        });

        // for setsalarybutton
        setSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherID = teacherIDTextField.getText().trim();
                String salaryStr = salaryTextField.getText().trim();
                String performanceStr = performanceIndexTextField.getText().trim();

                try {

                    if (!isValidInput(teacherID, salaryStr, performanceStr)) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input! Please check your entries for ID, Salary and Performance Index.");
                        return;
                    }

                    int teacherId = Integer.parseInt(teacherID);
                    int salary = Integer.parseInt(salaryStr);
                    int performanceIndex = Integer.parseInt(performanceStr);

                    if (isNegative(teacherId, salary, performanceIndex)) {
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
                                    "Salary and performance index updated for Tutor " + teacherID + "\nNew Salary : "
                                            + salary + "\nUpdated Performance Index : " + performanceIndex);
                            clearTextField();
                        } else {
                            JOptionPane.showMessageDialog(null, "Requirements didnt exactly meet for salary increment");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                    }
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Please fill input fields with their specific values only.");
                } catch (Exception y) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Salary was not set.");
                }
            }
        });

        // for removetutorbutton
        removeTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherID = teacherIDTextField.getText().trim();

                try {
                    if (!isValidInput(teacherID)) {
                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid teacher ID.");
                        return;
                    }

                    int teacherId = Integer.parseInt(teacherID);

                    if (isNegative(teacherId)) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input! Input Field cannot be less than zero.");
                        return;
                    }

                    Tutor tutor = (Tutor) findTutor(teacherId);
                    if (tutor != null) {
                        // Take Conformation From User to Remove the tutor
                        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to proceed?",
                                "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (option == 0) { // if it yes then do following
                            tutor.removetutor(); // Calling the function to set all of its instances to default
                            teachers.remove(tutor); // Removing the tutor object from the arrayList
                            JOptionPane.showMessageDialog(null,
                                    "Tutor with ID " + teacherID + " removed successfully.");
                            clearTextField();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tutor with ID " + teacherID + " not found.");
                    }
                } catch (NumberFormatException h) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Please fill input fields with their specific values only.");
                } catch (Exception y) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid input! Tutor was not removed.");
                }
            }
        });
    }

    // Here Comes Functions (Greatest of All Time) of this program

    public Lecturer addLecturer() {
        String teacherID = teacherIDTextField.getText().trim();
        String teacherName = teacherNameTextField.getText().trim();
        String address = addressTextField.getText().trim();
        String workingType = workingTypeTextField.getText();
        String employmentStatus = employmentStatusTextField.getText().trim();
        String workingHoursStr = workingHoursTextField.getText().trim();
        String department = departmentTextField.getText().trim();
        String yearOfExperienceStr = yearOfExperienceTextField.getText().trim();

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

                if (isNegative(teacherId, workingHours, yearOfExperience)) {
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
        } catch (Exception y) {
            JOptionPane.showMessageDialog(null,
                    "Invalid input! Lecturer was not added.");
            return null;
        }
        return null;
    }

    // new Tutor object
    private Tutor addTutor() {
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

                if (isNegative(teacherId, workingHours, salary, performanceIndex)) {
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
        } catch (Exception y) {
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
        int teacherId = Integer.parseInt(teacherIDTextField.getText().trim());

        for (Teacher i : teachers) {
            if (i.getteacher_id() == teacherId) {
                teachers.remove(i);
            }
        }
    }

    // for checking Empty Field
    /*
     * Using Variable Arguments
     * // for cheaking isValidMethod
     * private boolean isValidInput(String... inputs) {
     * for (String input : inputs) {
     * String a = input.trim();
     * if (a.equals("")) {
     * return false;
     * }
     * }
     * return true;
     * }
     */

    // Using Method OverLoading

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

    // Cheak For Negative Ones using Method OverLoading

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

    // cheking if lecturer with the same id already exists in the ArrayList or not
    // will cheak every id and found it the right one

    // for Lecturer
    private Lecturer findLecturer(int teacherId) {
        for (Teacher teacher : teachers) {
            if ((teacher instanceof Lecturer) && (teacher.getteacher_id() == teacherId)) {
                return (Lecturer) teacher; // Casting to Lecturer
            }
        }
        return null;
    }

    // for Tutor
    private Tutor findTutor(int teacherId) {

        for (Teacher teacher : teachers) {
            if ((teacher instanceof Tutor) && (teacher.getteacher_id() == teacherId)) {
                return (Tutor) teacher;
            }
        }
        return null;
    }

    // For displaying Lecturer List inn the Program
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
            for (Teacher teacher : teachers) {
                if (teacher instanceof Lecturer) {
                    Lecturer lecturer = (Lecturer) teacher;
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

            JTable table = new JTable(rowData, columnNames);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable auto-resizing of columns

            // Set preferred column widths for each column
            table.getColumnModel().getColumn(0).setPreferredWidth(50); // ID
            table.getColumnModel().getColumn(1).setPreferredWidth(120); // Tutor Name
            table.getColumnModel().getColumn(2).setPreferredWidth(160); // Address
            table.getColumnModel().getColumn(3).setPreferredWidth(110); // Working Type
            table.getColumnModel().getColumn(4).setPreferredWidth(130); // Employment Status
            table.getColumnModel().getColumn(5).setPreferredWidth(100); // Working Hour
            table.getColumnModel().getColumn(6).setPreferredWidth(140); // Department
            table.getColumnModel().getColumn(7).setPreferredWidth(115); // Year Of Experience

            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);

            displayLecturerFrame.setVisible(true);
        }
    }

    // For Displaying Tutor in The List
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
            JOptionPane.showMessageDialog(null, "There are currently no Tutors to display.");
            return;
        } else {

            JFrame displayTutorFrame = new JFrame("Tutor Details");
            displayTutorFrame.setTitle("Tutor Details");
            displayTutorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            displayTutorFrame.setSize(1135, 280);
            // displayTutorFrame.setSize(500, 280);
            displayTutorFrame.setLocationRelativeTo(null); // Center the frame on the screen

            JPanel panel = new JPanel(new BorderLayout());
            displayTutorFrame.add(panel);

            String[] columnNames = { "ID", "Tutor Name", "Address", "Working Type", "Employment Status",
                    "Working Hour", "Salary", "Specialization", "Academic Qualification", "Performance Index" };
            String[][] rowData = new String[teachers.size()][columnNames.length];

            int rowIndex = 0;
            for (Teacher teacher : teachers) {
                if (teacher instanceof Tutor) {
                    Tutor tutor = (Tutor) teacher;
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

            JTable table = new JTable(rowData, columnNames);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Disable auto-resizing of columns

            // Set preferred column widths for each column
            table.getColumnModel().getColumn(0).setPreferredWidth(45); // ID
            table.getColumnModel().getColumn(1).setPreferredWidth(120); // Tutor Name
            table.getColumnModel().getColumn(2).setPreferredWidth(160); // Address
            table.getColumnModel().getColumn(3).setPreferredWidth(110); // Working Type
            table.getColumnModel().getColumn(4).setPreferredWidth(130); // Employment Status
            table.getColumnModel().getColumn(5).setPreferredWidth(100); // Working Hour
            table.getColumnModel().getColumn(6).setPreferredWidth(80); // Salary
            table.getColumnModel().getColumn(7).setPreferredWidth(130); // Specialization
            table.getColumnModel().getColumn(8).setPreferredWidth(140); // Academic Qualification
            table.getColumnModel().getColumn(9).setPreferredWidth(120); // Performance Index

            JScrollPane scrollPane = new JScrollPane(table);
            panel.add(scrollPane, BorderLayout.CENTER);

            displayTutorFrame.setVisible(true);
        }

    }

}

public class TeacherGUI_Final extends Teacher {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }
}