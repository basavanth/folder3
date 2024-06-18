import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Person {
protected String name;
private Date dateOfBirth;
public Person(String name, String dob) throws ParseException {
this.name = name;
SimpleDateFormat sdf = new SimpleDateFormat(&quot;dd-MM-yyyy&quot;); // Assuming date
format is DD-MM-YYYY
this.dateOfBirth = sdf.parse(dob);
}
public void displayName() {
System.out.println(&quot;Person Name: &quot; + name);
}
public void displayAge() {
System.out.println(&quot;Age: &quot; + calculateAge() + &quot; years&quot;);
}
private int calculateAge() {
Date currentDate = new Date();
long diff = currentDate.getTime() - dateOfBirth.getTime();
return (int) (diff / (1000L * 60 * 60 * 24 * 365));
}
public static void main(String[] args) throws ParseException {

// Creating a person
Person person = new Person(&quot;Arun&quot;, &quot;01-11-2004&quot;);
// Displaying person details
person.displayName();
person.displayAge();
EmployeeDetails employee = new EmployeeDetails(&quot;Amith&quot;, &quot;2004-6-2&quot;, 1001,
60000.0);
// Displaying employee details
employee.displayName();
employee.displayAge();
employee.displayEmployeeDetails();

System.out.println();
}
}

EmployeeDetails.java

import java.text.ParseException;
public class EmployeeDetails extends Person {
private int empId;
private double salary;
public EmployeeDetails(String name, String dob, int empId, double salary) throws
ParseException {
super(name, dob);
this.empId = empId;
this.salary = salary;
}
public void displayEmployeeDetails() {
System.out.println(&quot;Employee ID: &quot; + empId);
System.out.println(&quot;Salary: $&quot; + salary);
}
}