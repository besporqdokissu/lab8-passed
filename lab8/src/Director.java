import java.util.Objects;

public final class Director extends Employee{
    private final String specialInfo;

    public Director(String name, int experience, int id, String specialInfo) {
        super(name, experience, id);

        this.specialInfo = specialInfo;
    }

    public Director(String name, int experience, int id) {
        super(name, experience, id);
        this.specialInfo="No special information";
    }

    public String getSpecialInfo() {
        return specialInfo;
    }

    public String callEmployee(int id){
        return String.format("I want to see the %d in my office", id);
    }

    public String callEmployee(){
        return "I want to see anyone in my office";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nspecial info: %s", this.specialInfo);
    }

    @Override
    public Director clone(){
        return new Director(super.getName(), super.getExperience(), super.getId(), specialInfo);
    }

    public Director newSpecial(String specialInfo){
        return new Director(super.getName(), super.getExperience(), super.getId(), specialInfo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(!super.equals(obj))
            return false;
        Director director = (Director) obj;
        return (Objects.equals(director.getSpecialInfo(), this.specialInfo));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialInfo);
    }
}
