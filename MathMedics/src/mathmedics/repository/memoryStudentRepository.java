package mathmedics.repository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mathmedics.member.Student;
import mathmedics.model.Grade;
import mathmedics.model.MC_Table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import static java.sql.DriverManager.getConnection;

public class memoryStudentRepository implements StudentRepository{

    Connection conn = null;
    String sql;
    String url = "jdbc:mysql://3.36.62.82/project2?characterEncoding=UTF-8&serverTimezone=UTC";


    @Override
    public String save(Student student) {
        String save_result = "이미 가입된 회원정보입니다.";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(url, "userstudent", "7276");
            Statement stmt = conn.createStatement();
            sql = "INSERT INTO student_info(grade,Student_name,birthday,gender,mobile,address) VALUES("+ student.toString()+");";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Class_info(Student_name) VALUES('"+ student.getName()+"');";
            stmt.executeUpdate(sql);
            save_result = "입력하신 정보가 성공적으로 DB에 저장 되었습니다.!\r\r" +
                    "\n[ 학년: " + student.getGrade() + " ]" +"\n[ 이름: " + student.getName() + " ]" +
                    "   [ 생일: " + student.getBirthday() + " ]" + "   [ 성별: " + student.getGender() + " ]" +
                    "\n[ 전화: " + student.getMobile() + " ]" + "   [ 주소: " + student.getAddress() + " ]";
        }catch(ClassNotFoundException e){
            System.out.println("드라이버로딩실패");
        }catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return save_result;
    }

    @Override
    public ObservableList<MC_Table> findByclass(String s) {
        ObservableList<MC_Table> list = FXCollections.observableArrayList();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(url, "userstudent", "7276");
            Statement stmt = conn.createStatement();
            sql = "select DISTINCT grade,className,Student_Class.Student_name,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9 "+
                    "from student_info left join Class_info on student_info.Student_name = Class_info.Student_name left join Student_Class on student_info.Student_name = Student_Class.Student_name "
                    + s ;
            ResultSet srs = stmt.executeQuery(sql);

            while(srs.next()){
                list.addAll(FXCollections.observableArrayList(
                        new MC_Table(srs.getInt("ch1"),srs.getInt("ch2"),srs.getInt("ch3"),
                                srs.getInt("ch4"),srs.getInt("ch5"),srs.getInt("ch6"),
                                srs.getInt("ch7"),srs.getInt("ch8"),srs.getInt("ch9"),
                                srs.getString("grade"),srs.getString("className"),srs.getString("Student_name")
                                )
                ));
            }
            return list;

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버로딩실패");
        } catch (SQLException e) {
            System.out.println("에러: " + e);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
        
    }

    @Override
    public ObservableList<Grade> findAll(String s) {
        ObservableList<Grade> list = FXCollections.observableArrayList();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(url, "userstudent", "7276");
            Statement stmt = conn.createStatement();
            sql = "select * from student_info "+s;
            ResultSet srs = stmt.executeQuery(sql);

            while(srs.next()){
                list.addAll(FXCollections.observableArrayList(
                        new Grade(srs.getString("grade"), srs.getString("Student_name"),
                                srs.getString("birthday"), srs.getString("gender"),
                                srs.getString("mobile"), srs.getString("address"))
                ));
            }
            return list;

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버로딩실패");
        } catch (SQLException e) {
            System.out.println("에러: " + e);
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                }
            }
        return list;
    }

    @Override
    public void saveclass(Student student) {
        }
    }
