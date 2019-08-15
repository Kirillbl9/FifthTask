import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

final class CreateTable implements UseTable{
    static void useTable(){


        DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);

        CreateTableAsStep<Record> table = create.createTable("AUTHORSq");
        CreateTableColumnStep step1 = table.column("ID", SQLDataType.INTEGER);
        CreateTableColumnStep step2 = table.column("FIRSNAME", SQLDataType.VARCHAR( 255 ));
        CreateTableColumnStep step3 = table.column("SECONDNAME", SQLDataType.VARCHAR( 255 ));
        step1.execute();
        step2.execute();
        step3.execute();

    }
}
