import org.jooq.*;
import org.jooq.impl.DSL;
import java.math.BigDecimal;
import java.sql.Date;
import static db.Tables.WAYBILLPOSITION;
import static db.Tables.WAYBILLS;
import static org.jooq.impl.DSL.avg;

public final class ThirdTask_3_4 {
    public static void thirdTask_3_4(Date firstPeriod, Date secondPeriod) {
        try {
            DSLContext create=DSL.using( JDBC.con, SQLDialect.POSTGRES_10 );
            Result<Record2<String, BigDecimal>> result=create.select( WAYBILLS.ORGANIZATION, avg( WAYBILLPOSITION.PRICE ).as( "avgPrice" ) )
                    .from( WAYBILLS )
                    .join( WAYBILLPOSITION )
                    .on( WAYBILLS.WAYBILLSID.eq( WAYBILLPOSITION.WAYBILLSID ) )
                    .where( WAYBILLS.WAYBILLDATE.greaterThan( firstPeriod ) )
                    .and( WAYBILLS.WAYBILLDATE.lessThan( secondPeriod ) )
                    .groupBy( WAYBILLPOSITION.PRICE, WAYBILLS.ORGANIZATION )
                    .fetch();
            System.out.println( result );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  //  String sql = "select Organization, avg(price) as avgPrice  from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID WHERE WaybillDate BETWEEN "+firstPeriod+"AND "+secondPeriod+" GROUP BY waybills.Organization, waybillPosition.Price";
