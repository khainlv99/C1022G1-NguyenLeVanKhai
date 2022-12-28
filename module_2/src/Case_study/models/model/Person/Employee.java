package Case_study.models.model.Person;

public class Employee extends Person{
    private String employeeCode;
    private String level;
    private String position;
    private String wage;

    public Employee(String fullName, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String employeeCode, String level, String position, String wage) {
        super(fullName, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                "} " + super.toString();
    }
}
