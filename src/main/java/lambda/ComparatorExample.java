package lambda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    static class Developer{
        String name;
        BigDecimal salary;
        int age;
        public Developer(String name,
                         BigDecimal salary,
                         int age){
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Developer [name="+name+"" +
                    ",salary="+ salary +"" +
                    ",age="+age+"]";
        }
    }

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();
        System.out.println("Before Sort");
        listDevs.forEach((developer)-> System.out.println(developer));

        //use Collections.sort()
        Collections.sort(listDevs,Comparator.comparing(Developer::getName));
        System.out.println("After Age Sort");
        listDevs.forEach((developer)-> System.out.println(developer));

        //use listDevs.sort()
        listDevs.sort(Comparator.comparing(Developer::getSalary));
        System.out.println("After Salary Sort");
        listDevs.forEach((dev)-> System.out.println(dev));


    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<>();
        result.add(new Developer("mkyong",
                new BigDecimal("700000"),
                33));
        result.add(new Developer("alvin",
                new BigDecimal("800000"),
                20));
        result.add(new Developer("jason",
                new BigDecimal("1000000"),
                10));
        result.add(new Developer("iris",
                new BigDecimal("1700000"),
                55));
        return result;
    }


}
