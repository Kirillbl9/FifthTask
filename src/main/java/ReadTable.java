import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static db.Tables.AUTHORS;

public final class ReadTable implements UseTable{
     static void useTable(){
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);

            Result<Record> result = create.select().from(AUTHORS).fetch();

            for (Record r : result) {
                Integer id = r.getValue(AUTHORS.ID);
                String firstName = r.getValue(AUTHORS.FIRSNAME);
                String SecondName = r.getValue(AUTHORS.SECONDNAME);
                System.out.println("ID: " + id + " first name: " + firstName + " last name: " + SecondName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


