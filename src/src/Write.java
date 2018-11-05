package src;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Write {
    public static void main(String[] args) {

        List<Employee1> employeeList = new LinkedList<>();

        employeeList.add(new EmployeeFixedPayment1("Sue", 2000));
        employeeList.add(new EmployeeHourlyWage1("Terry", 20));
        employeeList.add(new EmployeeHourlyWage1("Frank", 5));
        employeeList.add(new EmployeeFixedPayment1("Sofie", 2100));
        employeeList.add(new EmployeeFixedPayment1("Andrew", 2000));
        employeeList.add(new EmployeeFixedPayment1("Jack", 3000));
        employeeList.add(new EmployeeHourlyWage1("Hue", 30));
        employeeList.add(new EmployeeHourlyWage1("Larry", 30));

        // write collection to file
        writeEmployees(employeeList);

        // read collection from file
        System.out.println("\nreading files");
        List<Employee1> list = readEmployees();
        for (Employee1 employee : list) {
            System.out.println(employee);
        }
    }

    // writing collection of employees to file
    public static void writeEmployees (List<Employee1> employeeList) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
            oos.writeObject(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // reading collection of employees from file
    public static List<Employee1> readEmployees () {
        List<Employee1> result = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"))) {
            result = (List<Employee1>) ois.readObject();

            // handling the incorrect format of incoming file with catch clause
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

        abstract class Employee1 implements Serializable {
            static int idCounter;
            int id = 0;
            String name;

            public Employee1() {
                idCounter++;
                id = idCounter;
            }
            public abstract double getMonthlySalary();
            public int getId() {
                return id;
            }
            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return name + ": " + getMonthlySalary();
            }
        }


        class EmployeeFixedPayment1 extends Employee1 {
            int fixedPayment;
            public EmployeeFixedPayment1(String name, int fixedPayment) {
                this.name = name;
                this.fixedPayment = fixedPayment;
            }
            public double getMonthlySalary() {
                return fixedPayment;
            }
        }

        class EmployeeHourlyWage1 extends Employee1 {
            int hourlyRate;
            public EmployeeHourlyWage1(String name, int hourlyRate) {
                this.name = name;
                this.hourlyRate = hourlyRate;
            }
            public double getMonthlySalary() {
                return 20.8 * 8 * hourlyRate;
            }
        }


