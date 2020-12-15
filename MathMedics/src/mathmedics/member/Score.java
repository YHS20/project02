package mathmedics.member;


public class Score {
    private String Name;
    private String supClass;
    private int point;       //점수

    public Score(Student student,String supClass, int point) {
        this.Name = student.getName();
        this.supClass = supClass;
        this.point = point;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSupClass() {
        return supClass;
    }

    public void setSupClass(String supClass) {
        this.supClass = supClass;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
