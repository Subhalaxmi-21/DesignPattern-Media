package solid.live.srp;


public class Employee {
int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private String manager;
    private int yearsInOrg;

    private int remleaves;
    private int[] leavesLeftPreviously;



    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
        this. remleaves = new Remainingleaves(this.yearsInOrg, this.leavesLeftPreviously).getData();
    }

    public int getLeavesLeft() {
        return remleaves;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName(){ return name;}

    public int getLeavesTaken(){return this.leavesTaken;}

    public double getSalary(){
        return this.monthlySalary;
    }
    public String getManager(){
        return this.manager;
    }


    public String formatAsHTML(){
        Formatter format=new Formatter();
        return format.toHtml(this);
    }

}
