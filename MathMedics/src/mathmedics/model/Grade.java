package mathmedics.model;

public class Grade {

    String grade, name, birthday, gender, mobile, address;

    public Grade(String grade, String name, String birthday, String gender, String mobile, String address) {
        this.grade = grade;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
}
