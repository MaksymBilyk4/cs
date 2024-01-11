package kol2prep;

public class Employer extends Person{

    private double salary;
    private String jobCity;

    public Employer(String name, int age, double salary, String jobCity) {
        super(name, age);
        this.salary = salary;
        this.jobCity = jobCity;
    }

    @Override
    public void greeting() {
        System.out.println("My name is, " + this.getName() + ", my salary is " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    @Override
    public String toString() {
        return "Employer -> {name: " + this.getName() + ", age: " + this.getAge() + ", salary:" + this.salary + ", city of job:" + this.jobCity + " }";
    }

}
