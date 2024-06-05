<h1>Student Database Application</h1>

**Overview:**<br>
This Java console application helps you manage student enrollments and track their financial balances. It offers functionalities for:
  Adding new students
  Generating unique 5-digit student IDs (first digit reflects year)
  Registering students for courses (assuming a flat fee of 600 rupees per course)
  Viewing student information and enrollment status

**System Requirements:** <br>
  Operating System: Any operating system that supports Java (Windows, macOS, Linux)
  Java Development Kit (JDK): A recent version of JDK is recommended (e.g., JDK 17). You can download it from https://www.oracle.com/java/technologies/downloads/.

**Getting Started:**<br>
<p>Install Java JDK:<br>If you haven't already, download and install the Java Development Kit from the official Oracle website.</p>
<p>Compile the Application:<br>(Assuming the main class is StudentDatabaseApp and it's located in a package named edu.yourinstitution.app)</p>

Bash:<br>
  javac -cp .:./lib/* edu/manishjangra/app/StudentDatabaseApp.java  # Replace with actual class path if different.
      Replace ./lib/* with the path to any external libraries used by the application (if applicable).

Run the Application:<br>
  Bash<br>
  java -cp .:./lib/* edu/manishjangra/app/StudentDatabaseApp  # Replace with actual class path if different

**Features:**<br>

Adding Students:<br>
  The application prompts you to enter the number of new students to add.<br>
  For each student, you'll be asked to provide their name and year of enrollment.<br>
  A unique 5-digit student ID is automatically generated, with the first digit reflecting the enrollment year (e.g., 4XXXX for students enrolled in 2024).<br>
Registering for Courses:<br>
  Once students are added, you can choose to register a student for a course.<br>
  The application displays a list of currently registered students.<br>
  Select a student and the course they want to enroll in.<br>
  The application updates the student's enrollment information and calculates their total balance (600 rupees per course).<br>
Viewing Student Status:<br>
  You can view the details of any student, including their name, ID, year, enrolled courses, and total balance.<br>

**Screenshots**<br>
<img width="324" alt="1" src="https://github.com/manishjangra1/Student-Database-App/assets/129877551/24aa697b-824b-4b60-9c77-7f1bd699edf3"><br>
<img width="353" alt="2" src="https://github.com/manishjangra1/Student-Database-App/assets/129877551/f385292e-0c3e-48c5-bbf9-806966c95bf6"><br>
<img width="259" alt="3" src="https://github.com/manishjangra1/Student-Database-App/assets/129877551/ed688e43-f8b1-4a43-bf79-dceac1d4d41f"><br>

  
**Additional Notes:**<br>
  Error handling is recommended to catch invalid inputs and provide informative messages.<br>
  Data persistence (saving student information beyond program execution) is not included in this basic version. Consider using a database like MySQL or a file-based approach for larger-scale applications.<br>

**Future Enhancements:**<br>
  Implement data persistence using a database or file-based storage.<br>
  Allow for adding, editing, and deleting courses.<br>
  Introduce features for handling fees, including payments and generating receipts.<br>
  Provide options for searching and filtering student data.<br>
