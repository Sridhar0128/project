import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;;
import java.util.regex.Matcher;

interface EmployeeDisplayable {
    void displayDetails();
}
abstract class EmployeeDetails implements EmployeeDisplayable {
    private String name;
    private long mobileNo;
    private String mailId;
    private String address;
    private String position;
    private double experience;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }
    public void displayDetails() {
        System.out.println("Employee details");
    }
}
class Aggregation {
    private String info;
    public String getInfo(){
        return info;
    }
    public void setInfo(String Info){
        this.info=info;
    }
}
class Compo {
    void method() {
        System.out.println("Employee mail id : ");
    }
}
class Employee1 extends EmployeeDetails {
    private static final Pattern NAME_PATTERN=Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)*$");
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,3}$");
    private static final Pattern MOBILE_PATTERN = Pattern.compile("^\\d{10}$");
    private static final Pattern POSITION_PATTERN = Pattern.compile("^[a-zA-Z]+( [a-zA-Z]+)*$");
    private static final Pattern EXPERIENCE_PATTERN = Pattern.compile("^\\d+(\\.\\d+)?$");
     private Compo compo;
     private Aggregation aggregation;
    Scanner sc = new Scanner(System.in);
    private static int nextId = 1;
    private int id;
    Employee1() {
        compo = new Compo();
        this.id = nextId++;
    }
    public int getId() {
        return id;
    }
    public void addEmployee(List<Employee1> employees) {
        System.out.println("Employee ID: " + id);
            String newName;
            while (true) {
                System.out.println("Enter the Employee name : ");
                newName = sc.nextLine();
                if (validate1(newName)) {
                    setName((newName));
                    break;
                } else {
                    System.out.println("Invalid Name format");
                }
            }
            String mobileNo;
            while (true) {
                System.out.println("Mobile No : ");
                mobileNo = sc.nextLine();
                if (validate4(mobileNo)) {
                    setMobileNo(Long.parseLong(mobileNo));
                    break;
                } else {
                    System.out.println("Invalid mobile number. Please enter a 10-digit number.");
                }
            }
            String email;
            while (true) {
                compo.method();
                email = sc.nextLine();
                if (validate(email)) {
                    setMailId(email);
                    break;
                } else {
                    System.out.println("Invalid email address. Please enter a valid email.");
                }
            }
            System.out.println("Employee address : ");
            setAddress(sc.nextLine());
            String Position;
            while (true) {
                System.out.println("Employee position : ");
                Position = sc.nextLine();
                if (validate2(Position)) {
                    setPosition((Position));
                    break;
                } else {
                    System.out.println("Invalid position");
                }
            }
            String Experience;
        while (true) {
            System.out.println("Employee Experience (In years) : ");
            Experience = sc.nextLine();
            if (validate3(Experience)) {
                setExperience(Double.parseDouble(Experience));
                break;
            } else {
                System.out.println("Invalid Experience enter in years");
            }
        }
            employees.add(this);
    }
    private boolean validate1(String name){
        Matcher matcher = NAME_PATTERN.matcher(name);
        return matcher.matches();
    }
    private boolean validate(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    private boolean validate4(String mobileNo) {
        Matcher matcher = MOBILE_PATTERN.matcher(String.valueOf(mobileNo));
        return matcher.matches();
    }
    private boolean validate2(String position){
        Matcher matcher = POSITION_PATTERN.matcher((position));
        return matcher.matches();
    }
    private boolean validate2(long experience){
        Matcher matcher = POSITION_PATTERN.matcher((String.valueOf(experience)));
        return matcher.matches();
    }
    private boolean validate3(String experience){
        Matcher matcher = EXPERIENCE_PATTERN.matcher(String.valueOf(experience));
        return matcher.matches();
    }
    public void editEmployee(List<Employee1> employees) {
        System.out.println("Enter the Employee id to update : ");
        int id1 = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Employee1 emp : employees) {
            if (id1 == emp.getId()) {
                found=true;
                System.out.println("1---->Name");
                System.out.println("2---->Mobile Number");
                System.out.println("3---->Email-ID");
                System.out.println("4---->Address");
                System.out.println("5---->position");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        String newName;
                        while (true) {
                            System.out.println("Enter the Employee name : ");
                            newName = sc.nextLine();
                            if (validate1(newName)) {
                                emp.setName((newName));
                                break;
                            } else {
                                System.out.println("Invalid Name format");
                            }
                        }
                        break;
                    case 2:
                        String newMobileNo;
                        while (true) {
                            System.out.println("Mobile No : ");
                            newMobileNo = sc.nextLine();
                            if (validate4(newMobileNo)) {
                                emp.setMobileNo(Long.parseLong(newMobileNo));
                                break;
                            } else {
                                System.out.println("Invalid mobile number. Please enter a 10-digit number.");
                            }
                        }
                        break;
                    case 3:
                        String newEmail;
                        while (true) {
                            System.out.println("Employee mail id : ");
                            newEmail = sc.nextLine();
                            if (validate(newEmail)) {
                                emp.setMailId(newEmail);
                                break;
                            } else {
                                System.out.println("Invalid email address. Please enter a valid email.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Enter the new address : ");
                        emp.setAddress(sc.nextLine());
                        break;
                    case 5:
                        String Position1;
                        while (true) {
                            System.out.println("Employee position : ");
                            Position1 = sc.nextLine();
                            if (validate2(Position1)) {
                                emp.setPosition((Position1));
                                break;
                            } else {
                                System.out.println("Invalid position");
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
             if(!found)
                System.out.println("Employee id not found");
        }
    }
    public void deleteEmployee(List<Employee1> employees) {
        System.out.println("Enter the employee id to delete : ");
        boolean found =false;
        int id2 =sc.nextInt();
        for (Employee1 emp : employees) {
            if (id2 == emp.getId()) {
                employees.remove(emp);
                System.out.println("The Entered employee details are deleted");
                found = true;
                break;
            }
        }
           if(!found)
                System.out.println("The id is mismatched");
        }
    public void displayDetails(List<Employee1> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Details:");
            for (Employee1 emp : employees) {
                System.out.println("Employee id : " + emp.getId());
                System.out.println("Employee name : " + emp.getName());
                System.out.println("Employee mobile no : " + emp.getMobileNo());
                System.out.println("Employee mail id : " + emp.getMailId());
                System.out.println("Employee address : " + emp.getAddress());
                System.out.println("Employee position : " + emp.getPosition());
                System.out.println("Employee experience(In years): " + emp.getExperience());
                System.out.println();
            }
        }
    }
    public void searchEmployee(List<Employee1> employees){
        System.out.println("Enter employee name to search (partial name is allowed): ");
        String searchName = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Employee1 emp : employees) {
            if (emp.getName().toLowerCase().contains(searchName)) {
                System.out.println("Searched employee detail: ");
                System.out.println("Employee id : " + emp.getId());
                System.out.println("Employee name : " + emp.getName());
                System.out.println("Employee mobile no : " + emp.getMobileNo());
                System.out.println("Employee mail id : " + emp.getMailId());
                System.out.println("Employee address : " + emp.getAddress());
                System.out.println("Employee position : " + emp.getPosition());
                System.out.println("Employee experience(In years): " + emp.getExperience());
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employee found with the given name.");
        }
    }
    }
public class Main {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        Aggregation as=new Aggregation();
        Scanner sd = new Scanner(System.in);
        while (true) {
            System.out.println("\n");
            System.out.println("Enter 1 for add employee details");
            System.out.println("Enter 2 for edit employee details");
            System.out.println("Enter 3 for delete employee details");
            System.out.println("Enter 4 for display employee details");
            System.out.println("Enter 5 for search employee details ");
            System.out.println("Enter 6 for Exit ");
            System.out.println("Enter your choice : ");
            int choice = sd.nextInt();
            switch (choice) {
                case 1:
                    Employee1 emp = new Employee1();
                    emp.addEmployee(employees);
                    break;
                case 2:
                    Employee1 empToEdit = new Employee1();
                    empToEdit.editEmployee(employees);
                    break;
                case 3:
                    Employee1 empToDelete = new Employee1();
                    empToDelete.deleteEmployee(employees);
                    break;
                case 4:
                    Employee1 empToDisplay = new Employee1();
                    empToDisplay.displayDetails(employees);
                    break;
                case 5:
                    Employee1 empToSearch=new Employee1();
                   empToSearch.searchEmployee(employees);
                   break;
                case 6:
                    System.out.println("Exit");
                    sd.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}

