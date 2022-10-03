package Employee_Dtabase;

public class Employee {
    public static void main(String[] args) {
        Employee1[] emp = new Employee1[2];
        emp[0] = new Employee1(1, "2/2/2022", "2/3/2022", "ise", 't', 20000, 30000, 200);
        emp[1] = new Employee1(2, "4/4/2022", "3/5/2021", "ise", 't', 20000, 30000, 400);
        for(int i=0;i<emp.length;i++)
        {
            Employee1 employee1 = emp[i];
            employee1.showData();
        }
    }}

    class Employee1 {
        String emp_date, join_date, dept;
        char desi_code;
        double basic, it, har;
        int emp_no;

        Employee1(int emp_no, String emp_date, String join_date, String dept, char desi_code, double it, double basic, double har) {
            this.emp_no = emp_no;
            this.emp_date = emp_date;
            this.join_date = join_date;
            this.dept = dept;
            this.desi_code = desi_code;
            this.it = it;
            this.basic = basic;
            this.har = har;
        }

        public void showData() {
            System.out.print("Emp_no = " + emp_no + "  " + " Emp_date= " + emp_date + " " + "join date=" + join_date + " " + "dept=" + dept + " " + "desi_code=" + desi_code + " " + "it=" + it + " " + "basic=" + basic + " har=" + har);
            System.out.println();
        }
    }
