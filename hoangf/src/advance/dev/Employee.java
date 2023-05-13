package advance.dev;

class Employee extends Person implements Comparable<Employee> {
    private double salary;
    
    public Employee(String name, int age, String city, double salary) {
        super(name, age, city);
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }
    
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}
