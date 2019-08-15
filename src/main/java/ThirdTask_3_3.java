import org.jooq.*;
import org.jooq.impl.DSL;
import java.math.BigDecimal;
import java.sql.Date;
import static db.Tables.WAYBILLPOSITION;
import static db.Tables.WAYBILLS;
import static org.jooq.impl.DSL.sum;

public final class ThirdTask_3_3 {
    public static void thirdTask_3_3(Date firstPeriod,Date secondPeriod){
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);
           Result<Record3<Date, BigDecimal, BigDecimal>> result = create.select(WAYBILLS.WAYBILLDATE,sum(WAYBILLPOSITION.QUANTITY).as("quantSum"), sum(WAYBILLPOSITION.PRICE).as( "priceSum" ))
                    .from(WAYBILLS)
                    .innerJoin(WAYBILLPOSITION)
                    .on(WAYBILLS.WAYBILLSID.eq(WAYBILLPOSITION.WAYBILLSID))
                    .where(WAYBILLS.WAYBILLDATE.greaterThan(firstPeriod))
                    .and(WAYBILLS.WAYBILLDATE.lessThan(secondPeriod))
                    .groupBy(WAYBILLPOSITION.PRICE, WAYBILLPOSITION.QUANTITY,WAYBILLS.WAYBILLDATE)
                    .fetch();

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  //  String sql = "SELECT Sum(Price) as SumPrice,Sum(Quantity) as SumQuantity  from waybills  join  waybillPosition on waybills.WaybillsID  = waybillPosition.WaybillsID   WHERE WaybillDate between '2007-07-07' and '2010-07-07'";
