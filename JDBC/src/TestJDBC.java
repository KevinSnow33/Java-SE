import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into shoter values(null,?,?,?)";
        String sql1 = "delete from shoter where id = ?";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "admin");
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement ps1 = c.prepareStatement(sql1);
        ) {

            ps.setString(1, "枪皇");
            ps.setFloat(2, 100);
            ps.setInt(3, 500);

            // 执行插入语句
            ps.execute();

            // 在执行完插入语句后，MySQL会为新插入的数据分配一个自增长id
            // JDBC通过getGeneratedKeys获取该id
            ResultSet rs = ps.getGeneratedKeys();
            int id;
            if (rs.next()) {
                id = rs.getInt(1);
                System.out.println(id);
                ps1.setInt(1, 300);
                ps1.execute();
            }






        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}