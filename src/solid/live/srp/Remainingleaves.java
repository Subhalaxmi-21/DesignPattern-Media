package solid.live.srp;

public class Remainingleaves {
    int[] leavesleft;
    int yearsInOrg;
    public Remainingleaves(int yearsInOrg,int[] leavesleft){
        this.leavesleft=leavesleft;
        this.yearsInOrg=yearsInOrg;

    }

    public int getData(){
        int years = 3;
        if (this.yearsInOrg < 3) {
            years = this.yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.leavesleft[this.yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
