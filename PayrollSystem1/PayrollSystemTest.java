package PayrollSystem1;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee =
                new SalariedEmployee ("John", "Smith", "111-11-1111", new Date(07, 31, 2016), 800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(01, 12, 2005), 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date (9, 21, 1998), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date (10, 10, 2000), 5000, .04, 300);
        PieceWorker pieceWorker =
                new PieceWorker("Anna", "Kim", "5555-55-5555", new Date(11, 3, 1999), 14, 100);

        Date currentDate = new Date(9, 7, 2021);

        Employee[] employees = new Employee[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically: %n%n");

        for (Employee currentEmployee : employees)
        {

            if (currentEmployee.getBirthDate().getMonth() == currentDate.getMonth())
            {
                System.out.printf(
                        "%s%nEarned: $%,.2f with $100 bonus.%n%n",currentEmployee, currentEmployee.earnings() + 100);
            }
            else
                System.out.printf(
                        "%s%nEarned: $%,.2f%n%n",currentEmployee, currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
    }
}
