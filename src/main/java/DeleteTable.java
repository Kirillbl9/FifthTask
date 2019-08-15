import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static db.Tables.AUTHORS;

public final class DeleteTable implements UseTable{
    public static void useTable() {
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);
            create.delete(AUTHORS).execute();

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}

