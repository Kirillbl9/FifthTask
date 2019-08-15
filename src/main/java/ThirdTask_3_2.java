import org.jooq.*;
import org.jooq.impl.DSL;
import java.math.BigDecimal;
import static db.Tables.WAYBILLPOSITION;
import static db.Tables.WAYBILLS;
import static org.jooq.impl.DSL.sum;

public final class ThirdTask_3_2 {
    public static void thirdTask_3_2(int quantitySum){
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);
            Result<Record2<String, BigDecimal>> result =
                    create.select(WAYBILLS.ORGANIZATION, sum(WAYBILLPOSITION.QUANTITY).as( WAYBILLPOSITION.QUANTITY ))
                            .from(WAYBILLS)
                            .innerJoin(WAYBILLPOSITION)
                            .on(WAYBILLS.WAYBILLSID.eq(WAYBILLPOSITION.WAYBILLSID))
                            .where(WAYBILLPOSITION.QUANTITY.greaterThan(quantitySum))
                            .groupBy(WAYBILLS.ORGANIZATION, WAYBILLPOSITION.QUANTITY)
                            .fetch();

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   // String sql = "select Organization, sum(Quantity) as QuantitySum  from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID  where Quantity >"+quantitySum+" GROUP BY waybills.Organization, waybillPosition.Quantity";
