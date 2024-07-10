package modelTest;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User implements AdminInterface, java.io.Serializable{ 
    public static ArrayList<Student> masterRegistry = new ArrayList<Student>();

    public Admin(){
        super();
        this.userName = "admin";
        this.passWord = "admin001";
    }

    @Override
    public void createCourse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the course name: ");
        this.courseName = sc.nextLine();

        System.out.println("Enter the course ID: ");
        this.courseID = sc.nextLine();

        System.out.println("Enter the maximum number of students that can register: ");
        this.maxStudents = sc.nextInt();

        System.out.println("Enter the current number of students that are registerd: ");
        this.currentStudents = sc.nextInt();
		sc.nextLine();

        System.out.println("Enter the instructor's name: ");
        this.instructorName = sc.nextLine();

        System.out.println("Enter the course section number: ");
        this.courseSection = sc.nextInt();
		sc.nextLine();

        System.out.println("Enter the course location: ");
        this.courseLocation = sc.nextLine();

        Course c = new Course(this.courseName, this.courseID, this.maxStudents, 
                    this.currentStudents, this.instructorName, this.courseSection, this.courseLocation);
        courseList.add(c);

        System.out.println("The new course " + courseName + " has been succesfully added!");
    }
    @Override
    public void deleteCourse(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course name to be deleted: ");
		String courseName = sc.nextLine();

		for (int i = 0; i < courseList.size(); i++) {
			String j = courseList.get(i).getCourseName();
			System.out.println(courseList.get(i).getCourseName());
			if (j.contentEquals(courseName)) {
				courseList.remove(i);
				System.out.println("The course " + courseName + " has been successfully removed!");
				System.out.println(" ");
				break;
			} else if ((!j.contentEquals(courseName)) && (i == courseList.size() - 1)) {
				System.out.println("Oops! We are unable to find that course, let's try again!");
				Admin admin = new Admin();
				admin.deleteCourse();
			}
		}
    }

    @Override
    public void editCourse(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter '1' to change a course's instructor.");
		System.out.println("Enter '2' to change a course's location.");
		String option = sc.nextLine();
		System.out.println("Enter the name of the course you would like to edit: ");
		String courseName = sc.nextLine();

		if (option.contentEquals("1")) {
			System.out.println("Enter the new instructor's name: ");
			String instructorName = sc.nextLine();
			for (int i = 0; i < courseList.size(); i++) {
				String j = courseList.get(i).getCourseName();
				if (j.contentEquals(courseName)) {
					courseList.get(i).setInstructorName(instructorName);
					System.out.println("Course instructor name has been successfully edited to: " + instructorName);
					System.out.println("");
				}
			}
		} else if (option.contentEquals("2")) {
			System.out.println("Enter the course's new location: ");
			String courseLocation = sc.nextLine();
			for (int i = 0; i < courseList.size(); i++) {
				String j = courseList.get(i).getCourseName();
				if (j.contentEquals(courseName)) {
					courseList.get(i).setCourseLocation(courseLocation);
					System.out.println("Course location has been successfully edited to: " + courseLocation);
					System.out.println(" ");
				}
			}
		}
    }

    @Override
    public void displayCourseInfo(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course ID: ");
		String courseID = sc.nextLine();
		for (int i = 0; i < courseList.size(); i++) {
			String j = courseList.get(i).getCourseID();
			if (j.contentEquals(courseID)) {
				courseList.get(i).print();
			}
		}
    }

    @Override
    public void registerStudent(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the new student's first name: ");
		String firstName = sc.next();
        System.out.println("Enter the new student's middle name ");
        String midName = sc.next();
		System.out.println("Enter the new student's last name: ");
		String lastName = sc.next();

		Student newStudent = new Student(firstName, midName, lastName);
		masterRegistry.add(newStudent);
		System.out.println(masterRegistry.get(masterRegistry.size() - 1).getFirstName());
		System.out.println("New student has been successfully added!");
		System.out.println(" ");
    }

    @Override
    public void adminViewAllCourses() {
        for (int i = 0; i < courseList.size(); i++) {
			// prints out the courses within the course list
			courseList.get(i).print();
		}
    }

    @Override
    public ArrayList<Course> viewFullCourses() {
        ArrayList<Course> returnCourses = new ArrayList<Course>();
		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCurrentStudents() == courseList.get(i).getMaxStudents()) {
				courseList.get(i).print();
				returnCourses.add(courseList.get(i));
			}
		}
		return returnCourses;
    }

    @Override
    public void writeToFile() {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i < viewFullCourses().size(); i++) {
				String text = viewFullCourses().get(i).print();
				bufferedWriter.write(text);
				bufferedWriter.newLine();
			}
			// Always close writer
			bufferedWriter.close();
		}
		// Always close files

		catch (IOException exk) {
			System.out.println("Error writing file '" + fileName + "'");
			exk.printStackTrace();
		}
    }

    @Override
    public void viewRegisteredStudent(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the course's name: ");
		String courseName = sc.nextLine();

		for (int i = 0; i < courseList.size(); i++) {
			if (courseList.get(i).getCourseName() == courseName) {
				for (int j = 0; j < studentList.size(); j++) {
					String firstName = courseList.get(i).getStudentList().get(j).getFirstName();
					String midName = courseList.get(i).getStudentList().get(i).getMidName();
					String lastName = courseList.get(i).getStudentList().get(j).getLastName();
					System.out.println("Registered Students for " + courseName);
					System.out.print("* " + firstName + " " + midName+ " " +  lastName);
				}
			}
		}
    }

    @Override
    public void viewAllStudentCourses(){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the new student's first name: ");
		String firstName = sc.next();
		System.out.println("Enter the new student's middle name: ");
		String midName = sc.next();
		System.out.println("Enter the new student's last name: ");
		String lastName = sc.next();

		System.out.println(firstName + " " + midName + " " +  lastName + "'s Classes:");
		for (int i = 0; i < courseList.size(); i++) {
			for (int j = 0; j < studentList.size(); j++) {
				if (courseList.get(i).getStudentList().get(j).getFirstName() == firstName && 
						courseList.get(i).getStudentList().get(j).getMidName() == midName
						&& courseList.get(i).getStudentList().get(j).getLastName() == lastName) {
					String courseName = courseList.get(i).getCourseName();
					System.out.println("* " + courseName);
				}
			}
		}
    }

    @Override
    public void sortCoursesByStudents() {
        for (int i = 0; i < courseList.size(); i++) {
			for (int j = courseList.size() - 1; j > i; j--) {
				if (courseList.get(i).getCurrentStudents() > courseList.get(j).getCurrentStudents()) {
					Course tmp = courseList.get(i);
					courseList.set(i, courseList.get(j));
					courseList.set(j, tmp);
				}

			}

		}

		for (int i = 0; i < courseList.size(); i++) {
			// prints out the courses within the course list
			courseList.get(i).print();
		}
    }

    // getter and setter
    public static ArrayList<Student> getMasterRegistry() {
        return masterRegistry;
    }

    public static void setMasterRegistry(ArrayList<Student> masterRegistry) {
        Admin.masterRegistry = masterRegistry;
    }
}
   
