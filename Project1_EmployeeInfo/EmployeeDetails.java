public class EmployeeDetails {

    public static void main(String[] args) {

        int[] empId = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] doj = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basicPay = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hraPay = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] itDeduction = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        if (args.length == 0) {
            System.out.println("Please pass the Employee ID as a command line argument.");
            return;
        }

        int empIdToSearch = Integer.parseInt(args[0]);
        boolean recordFound = false;

        for (int index = 0; index < empId.length; index++) {

            if (empId[index] != empIdToSearch) {
                continue;
            }

            recordFound = true;
            String designation;
            int dearnessAllowance;

            switch (designationCode[index]) {
                case 'e':
                    designation = "Engineer";
                    dearnessAllowance = 20000;
                    break;
                case 'c':
                    designation = "Consultant";
                    dearnessAllowance = 32000;
                    break;
                case 'k':
                    designation = "Clerk";
                    dearnessAllowance = 12000;
                    break;
                case 'r':
                    designation = "Receptionist";
                    dearnessAllowance = 15000;
                    break;
                case 'm':
                    designation = "Manager";
                    dearnessAllowance = 40000;
                    break;
                default:
                    designation = "Not Assigned";
                    dearnessAllowance = 0;
            }

            int netSalary = basicPay[index] + hraPay[index] + dearnessAllowance - itDeduction[index];

            System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
            System.out.println(empId[index] + "\t" + empName[index] + "\t\t" +
                    department[index] + "\t\t" + designation + "\t" + netSalary);
        }

        if (!recordFound) {
            System.out.println("There is no employee with empid : " + empIdToSearch);
        }
    }
}
