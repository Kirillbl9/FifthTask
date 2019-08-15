import com.sun.istack.internal.NotNull;
import java.sql.*;

public final class JDBC {
    @NotNull
    public static Connection con=null;

    public static void main(@NotNull String[] args) throws SQLException {

        try {

            con=DriverManager.getConnection( "jdbc:postgresql://localhost:5432/postgres", "postgres", "tsucanovden" );
            //CRUD operation:
            // CreateTable.useTable();
            // UpdateTable.useTable();
            // ReadTable.useTable();
            // DeleteTable.useTable();

            //Step 3:
            // ThirdTask_3_1.thirdTask_3_1();
            // ThirdTask_3_2.thirdTask_3_2(1000);
            // ThirdTask_3_3.thirdTask_3_3( Date.valueOf( "2006-03-03" ), Date.valueOf( "2010-03-03" ));
            // ThirdTask_3_4.thirdTask_3_4( Date.valueOf( "2006-03-03" ), Date.valueOf( "2010-03-03" ));
            // ThirdTask_3_5.thirdTask_3_5( Date.valueOf( "2006-03-03" ), Date.valueOf( "2010-03-03" ));

        } catch (SQLException err) {
            System.out.println( err.getMessage() );
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}


