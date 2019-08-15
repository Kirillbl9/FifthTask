import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import static db.Tables.AUTHORS;

public final class UpdateTable implements UseTable{
    public static void useTable() {
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);
            create.insertInto(AUTHORS, AUTHORS.ID, AUTHORS.FIRSNAME, AUTHORS.SECONDNAME)
                    .values(3, "Hermann", "Hesse")
                    .values(4, "Alfred", "Döblin")
                    .execute();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}

