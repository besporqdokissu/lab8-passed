import java.util.Objects;

public abstract class Employee {
    private final String name;
    private final int experience;
    private final int id;

    public Employee(String name, int experience, int id) {

        this.name = name;

        this.experience = experience;

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("name: %s, experience: %d, id: %d", this.name, this.experience, this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Employee employee = (Employee) obj;
        return (employee.getExperience() == this.experience &&
                Objects.equals(employee.getName(), this.name)) &&
                employee.getId() == this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, id);
    }
}