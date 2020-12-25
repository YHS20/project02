package mathmedics.repository;

import mathmedics.member.Student;

import java.sql.*;
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
            sql = "INSERT INTO student_info(grade,name,birthday,gender,mobile,address) VALUES("+ student.toString()+");";
            System.out.println(sql);
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
    public Optional<Student> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public ResultSet findAll() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = getConnection(url, "userstudent", "7276");
            Statement stmt = conn.createStatement();
            sql = "select * from student_info";
            ResultSet srs = stmt.executeQuery(sql);
            System.out.println("번호\t\t이름\t학년\t 반\t생일\t성별\t번호\t주소");
            while(srs.next()){
                System.out.print(srs.getString("id")+"\t\t");
                System.out.print(srs.getString("name")+"\t");
                System.out.print(srs.getString("grade")+"\t");
                System.out.print(srs.getString("mClass")+"\t");
                System.out.print(srs.getString("birthday")+"\t");
                System.out.print(srs.getString("gender")+"\t");
                System.out.print(srs.getString("mobile")+"\t");
                System.out.print(srs.getString("address")+"\t");
                System.out.println();
            }
            return srs;

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
        return null;
    }

    @Override
    public void saveclass(Student student) {
        }
    }
