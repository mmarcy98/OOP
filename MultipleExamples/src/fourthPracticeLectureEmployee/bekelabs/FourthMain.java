package fourthPracticeLectureEmployee.bekelabs;

public class FourthMain {

    public static void main(String[] args) {
	Employee Daniel= new Employee("Daniel1",5);

        Daniel.setName("MindlessWorker");
        Daniel.setSalary(1000);

        Daniel.increaseSalary(500);
		System.out.println(Daniel.employeeData());

		Employee employee2 = new Employee();

		employee2.setName("Dani");
		employee2.setSalary(2000);

		System.out.println(Daniel.employeeData() + employee2.employeeData());

		System.out.println(Daniel.isInSalaryRange(500, 3000)+"\n  "+ Daniel.getTax()+"\n  "+Daniel.hasHigherSalary(employee2));

        Employee[] employeeArray= new Employee[10];

        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i]= new Employee();
            employeeArray[i].setSalary(i*1000+i*200);
            employeeArray[i].setName("MindlessWorker"+i);
        }

        int maxIndex= 0;

        for (int i = 1; i < employeeArray.length; i++) {
            if (employeeArray[i].hasHigherSalary(employeeArray[maxIndex])) {
                maxIndex=i;
            }
        }

        int counter= 0;
        long salaryStart=3000;
        long salaryEnd= 6000;


        for (Employee employee : employeeArray) {
            if (employee.isInSalaryRange(salaryStart, salaryEnd)) {
                counter++;
            }
        }

        counter= 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].isInSalaryRange(salaryStart, salaryEnd)) {
                counter++;
            }
        }

        long avg=0;
        for (Employee employee : employeeArray) {
            avg+=employee.getSalary();
        }
        avg/=employeeArray.length;


        long sum=0;
        for (Employee employee : employeeArray) {
            sum+=employee.getTax();
        }

        System.out.println(sum + "   "+ avg+ "   "+ counter );

    }

}

