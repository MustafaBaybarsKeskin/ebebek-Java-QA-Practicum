public class Employee {
    private String _name;
    private double _salary;
    private double _workHours;
    private int _hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        _name = name;
        _salary = salary;
        _workHours = workHours;
        _hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;

        if(_salary > 1000) {
            tax = _salary * 0.03;
        }

        return tax;
    }

    public double bonus() {
        double bonusTime = 0;

        if(_workHours > 40) {
            bonusTime = (_workHours - 40) * 30;
        }

        return bonusTime;
    }

    public double raiseSalary() {
        int thisYear = 2021;
        double raise = 0;

        if (thisYear - _hireYear < 10) {
            raise = _salary * 0.05;
        } else if (thisYear - _hireYear > 9 && thisYear - _hireYear< 20) {
            raise = _salary * 0.10;
        } else if (thisYear - _hireYear > 19) {
            raise = _salary * 0.15;
        }

        return raise;
    }

    @Override
    public String toString() {
        return "*** Employee ***" +
                "\nName: " + _name +
                "\nSalary: " + _salary +
                "\nWorkHours: " + _workHours +
                "\nHireYear: " + _hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nRaise Salary: " + raiseSalary() +
                "\nSalary With Tax and Bonus: " + (_salary + (bonus() - tax())) +
                "\nTotal Salary: " + (_salary + raiseSalary());
    }
}
