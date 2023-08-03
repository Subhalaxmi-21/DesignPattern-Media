package solid.live.srp;

public class Formatter{
    //    Employee emp;


    public String toHtml(Employee emp) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + emp.getEmpId() + "'>" +
                "<span>" + emp.getEmpName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (emp.getLeavesLeft()-emp.getLeavesTaken() )+"</span>";
        str += "<span>" + Math.round(emp.getSalary()* 12) + "</span>";
        if (emp.getManager() != null) str += "<span>" + emp.getManager() + "</span>";
        else str += "<span>None</span>";

        str += "<span>" + emp.getLeavesLeft() + "</span>";
        return str + "</div> </div>";
    }

}
