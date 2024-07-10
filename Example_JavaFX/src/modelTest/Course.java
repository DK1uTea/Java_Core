package modelTest;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Course implements java.io.Serializable{
    public String courseName;
    public String courseID;
    public int maxStudents;
    public int currentStudents;
    public ArrayList<Student> studentList;
    public String instructorName;
    public int courseSection;
    public String courseLocation;
    public static ArrayList<Course> courseList = new ArrayList<Course>();
    
    public Course() {
    }

    public Course(String courseName, String courseID, int maxStudents, int currentStudents,
                String instructorName, int courseSection, String courseLocation) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        this.studentList = new ArrayList<Student>();
        this.instructorName = instructorName;
        this.courseSection = courseSection;
        this.courseLocation = courseLocation;
    }

    public String print() {
		String names = "";

		if (studentList != null) {
			for (int i = 0; i < studentList.size(); i++) {
				String addFirst = studentList.get(i).getFirstName();
                String addMid = studentList.get(i).getMidName();
				String addLast = studentList.get(i).getLastName();
				names = names + addFirst + " " + addMid + " " +  addLast + ", ";
			}
			System.out.println("Course: " + courseName + "\n" + "Course ID: " + courseID + "\n"
					+ "Maximum # of Students: " + maxStudents + "\n" + "Current # of Students: " + currentStudents
					+ "\n" + "Registered Students: " + names + "\n" + "Instructor: " + instructorName + "\n"
					+ "Section: " + courseSection + "\n" + "Location: " + courseLocation);
			System.out.println("==========");
			String text1 = "Course: " + courseName + "\n" + "Course ID: " + courseID + "\n" + "Maximum # of Students: "
					+ maxStudents + "\n" + "Current # of Students: " + currentStudents + "\n" + "Registered Students: "
					+ names + "\n" + "Instructor: " + instructorName + "\n" + "Section: " + courseSection + "\n"
					+ "Location: " + courseLocation;
			return (text1);
		} else {
			System.out.println("Course: " + courseName + "\n" + "Course ID: " + courseID + "\n"
					+ "Maximum # of Students: " + maxStudents + "\n" + "Current # of Students: " + currentStudents
					+ "\n" + "Registered Students: " + studentList + "\n" + "Instructor: " + instructorName + "\n"
					+ "Section: " + courseSection + "\n" + "Location: " + courseLocation);
			System.out.println("==========");
			String text2 = "Course: " + courseName + "\n" + "Course ID: " + courseID + "\n" + "Maximum # of Students: "
					+ maxStudents + "\n" + "Current # of Students: " + currentStudents + "\n" + "Registered Students: "
					+ studentList + "\n" + "Instructor: " + instructorName + "\n" + "Section: " + courseSection + "\n"
					+ "Location: " + courseLocation;
			return (text2);
		}
	}

	public String studentPrint() {
		System.out.println("Course: " + courseName + "\n" + "Course ID: " + courseID + "\n" + "Maximum # of Students: "
				+ maxStudents + "\n" + "Current # of Students: " + currentStudents + "\n" + "Registered Students: "
				+ "\n" + "Instructor: " + instructorName + "\n" + "Section: " + courseSection + "\n" + "Location: "
				+ courseLocation);
		System.out.println("==========");
		String text = "Course: " + courseName + "\n" + "Course ID: " + courseID + "\n" + "Maximum # of Students: "
				+ maxStudents + "\n" + "Current # of Students: " + currentStudents + "\n" + "Registered Students: "
				+ "\n" + "Instructor: " + instructorName + "\n" + "Section: " + courseSection + "\n" + "Location: "
				+ courseLocation;
		return (text);
	}

    public static void readCourseDataFromFile() {
		try {
			FileInputStream fis = new FileInputStream("D:\\Source_code\\Java_Project\\Java_codeptit\\course.csv.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			courseList = (ArrayList<Course>) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Deserialization complete");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
		}
	}

	public static void writeCourseDataToFile() {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Source_code\\Java_Project\\Java_codeptit\\course.csv.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(courseList);
			oos.close();
			fos.close();
			System.out.println("Serialization complete");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
    // getter and setter
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getCurrentStudents() {
        return currentStudents;
    }

    public void setCurrentStudents(int currentStudents) {
        this.currentStudents = currentStudents;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(int courseSection) {
        this.courseSection = courseSection;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public static ArrayList<Course> getCourseList() {
        return courseList;
    }

    public static void setCourseList(ArrayList<Course> courseList) {
        Course.courseList = courseList;
    }

    public static void main(String[] args) {
        readCourseDataFromFile();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter '1' to login as Admin!");
        System.out.println("Enter '2' to login as Staff!");
        System.out.println("Enter '3' to login as Student!");
        System.out.println("Enter '0' to Exit!");
        String option = sc.next();

        while (!option.contentEquals("1") && !option.contentEquals("2") && !option.contentEquals("3") && !option.contentEquals("0")) {
            System.out.println("Sorry, your input is not valid! Please, try again!");
            System.out.println("Enter '1' to login as Admin!");
            System.out.println("Enter '2' to login as Staff!");
            System.out.println("Enter '3' to login as Student!");
            System.out.println("Enter '0' to Exit!");
            option = sc.next();
        }
        // Admin
        if(option.contentEquals("1")){
            sc.nextLine();
            System.out.println("Enter the Admin username: ");
            String userInput = sc.nextLine();
            System.out.println("Enter the Admin password: ");
            String passInput = sc.nextLine();

            while (!userInput.contentEquals("admin") && !passInput.contentEquals("admin001")) {
                if (!userInput.contentEquals("admin")) {
					System.out.println("Sorry the username is not correct! Try again.");
					System.out.println("Enter the Admin username:");
					userInput = sc.nextLine();
					System.out.println("Enter the Admin password:");
					passInput = sc.nextLine();
				} else if (!passInput.contentEquals("admin001")) {
					System.out.println("Sorry the password is not correct! Try again.");
					System.out.println("Enter the Admin username:");
					userInput = sc.nextLine();
					System.out.println("Enter the Admin password:");
					passInput = sc.nextLine();
				}
            }
            System.out.println("Congrats! You have been successfully logged in as an admin!");
            Admin admin = new Admin();
            boolean logout = false;
            while (!logout) {
                System.out.println("What would you like to do today?");
                System.out.println("Enter '1' to Manage Courses");
                System.out.println("Enter '2' to View Reports");
                System.out.println("Enter '0' to Exit");
                String option2 = sc.next();
                if(option2.contentEquals("1")){
                    System.out.println("Course Management!");
                    System.out.println("Enter '1' to Create a New Course");
                    System.out.println("Enter '2' to Delete a Course");
                    System.out.println("Enter '3' to Edit a Course");
                    System.out.println("Enter '4' to Display Information for a Given Course");
                    System.out.println("Enter '5' to Register a Student");
                    System.out.println("Enter '0' to Exit");
                    String option3 = sc.next();

                    if(option3.contentEquals("1")){
                        admin.createCourse();
                    }
                    else if(option3.contentEquals("2")){
                        admin.deleteCourse();
                    }
                    else if(option3.contentEquals("3")){
                        admin.editCourse();
                    }
                    else if(option3.contentEquals("4")){
                        admin.displayCourseInfo();
                    }
                    else if(option3.contentEquals("5")){
                        admin.registerStudent();
                    }
                    else{
                        System.out.println("Thank you & come again! :D");
                        logout = true;
                        writeCourseDataToFile();
                        System.exit(0);
                    }
                }
                else if(option2.contentEquals("2")){
                    System.out.println("View Reports");
                    System.out.println("Enter '1' to View All  Student Courses");
                    System.out.println("Enter '2' to View All Full Courses");
                    System.out.println("Enter '3' to Write to File All Full Courses");
                    System.out.println("Enter '4' to View Registered Students of Specific Course");
                    System.out.println("Enter '5' to View All Registered Courses of Specific Student");
                    System.out.println("Enter '6' to Sort Courses");
                    System.out.println("Enter '0' to Exit");
                    String option3 = sc.next();

                    if(option3.contentEquals("1")){
                        admin.viewAllStudentCourses();
                    }
                    else if(option3.contentEquals("2")){
                        admin.viewFullCourses();
                    }
                    else if(option3.contentEquals("3")){
                        admin.writeToFile();
                    }
                    else if(option3.contentEquals("4")){
                        admin.viewRegisteredStudent();
                    }
                    else if(option3.contentEquals("5")){
                        admin.viewAllStudentCourses();
                    }
                    else if(option3.contentEquals("6")){
                        admin.sortCoursesByStudents();
                    }
                    else{
                        System.out.println("Thank you & come again :D");
                        logout = true;
                        writeCourseDataToFile();
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("Thank you & come again :D");
                    logout = true;
                    writeCourseDataToFile();
                    System.exit(0);
                }
            }
        }
        // Staff
        else if(option.contentEquals("2")){
            sc.nextLine();
            System.out.println("Enter the Staff user name: ");
            String userInput = sc.nextLine();
            System.out.println("Enter the Staff password: ");
            String userPass = sc.nextLine();

            System.out.println("Congrats! You have been successfully logged in as an staff!");
            Staff staff = new Staff();
            boolean logout = false;
            while (!logout) {
                System.out.println("What would you like to do today!");
                System.out.println("Enter '1' to View All Courses");
                System.out.println("Enter '2' to Regist In Course");
                System.out.println("Enter '3' to Withdraw From A Course");
                System.out.println("Enter '4' to view all Registered Course");
                System.out.println("Enter '0' to Exit");
                String option2 = sc.next();

                if(option2.contentEquals("1")){
                    staff.viewAllCourses();
                }
                else if(option2.contentEquals("2")){
                    staff.registerInCourse();
                }
                else if(option2.contentEquals("3")){
                    staff.withDrawFromCourse();
                }
                else if(option2.contentEquals("4")){
                    staff.viewRegisteredCourses();
                }
                else{
                    System.out.println("Thank you & come again :D");
                    logout = true;
                    writeCourseDataToFile();
                    System.exit(0);
                }
            }
        }
        // Student
        else if(option.contentEquals("3")){
            sc.nextLine();
            System.out.println("Enter the Student username: ");
            String userInput = sc.nextLine();
            System.out.println("Enter the Student password: ");
            String userPass = sc.nextLine();

            System.out.println("Enter your First Name: ");
            String firstName = sc.next();
            System.out.println("Enter your Middle Name: ");
            String midName = sc.next();
            System.out.println("Enter your Last Name: ");
            String lastName = sc.next();

            System.out.println("Congrats! You have been successfully logged in as an student!");
            System.out.println("Welcome " + firstName + " " +  midName + " " + lastName);
            
            Student student = new Student(firstName, midName, lastName);

            boolean logout = false;
            while (!logout) {
                System.out.println("What would you like to do today?");
                System.out.println("Enter '1' to View All Courses");
                System.out.println("Enter '2' to View All Available Courses");
                System.out.println("Enter '3' to Register to a Course");
                System.out.println("Enter '4' to Withdraw from a Course");
                System.out.println("Enter '5' to View All Registered Courses");
                System.out.println("Enter '0' to Exit");
                String option2 = sc.next();

                if(option2.contentEquals("1")){
                    student.viewAllCourses();
                }
                else if(option2.contentEquals("2")){
                    student.viewOpenCourses();
                }
                else if(option2.contentEquals("3")){
                    student.registerInCourse();
                }
                else if(option2.contentEquals("4")){
                    student.withDrawFromCourse();
                }
                else if(option2.contentEquals("5")){
                    student.viewRegisteredCourses();
                }
                else{
                    System.out.println("Thank you & come again!");
                    logout = true;
                    writeCourseDataToFile();
                    System.exit(0);
                }
            }
        }
    }
}
