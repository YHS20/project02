package mathmedics.model;

public class FirstGrade {

    int id;
    String grade, MClass, name, birthday, gender, mobile, address;

    public FirstGrade(int id, String grade, String MClass, String name, String birthday, String gender, String mobile, String address) {
        this.id = id;
        this.grade = grade;
        this.MClass = MClass;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMClass(String MClass) {
        this.MClass = MClass;
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

    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public String getMClass() {
        return MClass;
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
