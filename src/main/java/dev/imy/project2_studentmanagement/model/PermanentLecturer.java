package dev.imy.project2_studentmanagement.model;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PermanentLecturer extends Lecturer {

    private float salary;

    public PermanentLecturer(String name, String address, String phoneNumber, float salary) {
        super(name, address, phoneNumber);
        this.salary = salary;
    }
    public PermanentLecturer(float salary) {
        this.salary = salary;
    }
    public PermanentLecturer() {
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentLecturer that = (PermanentLecturer) o;
        return Float.compare(that.salary, salary) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }
    @Override
    public String toString() {
        return "PermanentLecturer{" +
                "salary=" + salary +
                '}';
    }
}
