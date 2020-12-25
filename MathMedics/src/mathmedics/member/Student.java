package mathmedics.member;

public class Student {

    private int birthday ;
    private String mobile ;
    private String grade ;
    private String name ;
    private String gender ;
    private String address ;

    public Student(String grade, String name, int birthday, String gender, String mobile, String address){
        this.grade = grade;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString(){
        return grade+",'"+name +"',"+birthday +",'"+gender+"','"+mobile +"','"+ address+"'" ;
    }


    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
