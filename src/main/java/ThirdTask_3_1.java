import org.jooq.*;
import org.jooq.impl.DSL;
import static db.Tables.WAYBILLPOSITION;
import static db.Tables.WAYBILLS;

public final class ThirdTask_3_1 {
    public static void thirdTask_3_1(){
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);

            Result<Record2<String, Integer>> result =
                    create.select(WAYBILLS.ORGANIZATION, WAYBILLPOSITION.QUANTITY )
                    .from(WAYBILLS)
                            .join(WAYBILLPOSITION)
                            .on(WAYBILLS.WAYBILLSID.eq(WAYBILLPOSITION.WAYBILLSID))
                            .orderBy(WAYBILLPOSITION.QUANTITY)
                            .limit(5)
                    .fetch();
            for (Record2 r : result) {
                Integer QUANTITY = r.getValue( WAYBILLPOSITION.QUANTITY );
                String ORGANIZATION = r.getValue(WAYBILLS.ORGANIZATION);

                System.out.println("ID: " + QUANTITY + " first name: " + ORGANIZATION );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   // String sql = "select Organization, Quantity from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID ORDER BY Quantity DESC LIMIT 10";
