import org.jooq.*;
import org.jooq.impl.DSL;
import java.sql.Date;
import static db.Tables.NOMENCLATURES;
import static db.Tables.WAYBILLPOSITION;
import static db.Tables.WAYBILLS;

public final class ThirdTask_3_5 {
    public static void thirdTask_3_5(Date firstPeriod,Date secondPeriod){
        try {
            DSLContext create = DSL.using( JDBC.con, SQLDialect.POSTGRES_10);
            Result<Record2<String, String>> result=create.select( WAYBILLS.ORGANIZATION, NOMENCLATURES.TITLE )
                    .from( WAYBILLS )
                    .join( WAYBILLPOSITION )
                    .on( WAYBILLS.WAYBILLSID.eq( WAYBILLPOSITION.WAYBILLSID ) )
                    .join(NOMENCLATURES)
                    .on(NOMENCLATURES.NOMENCLATURE.eq(WAYBILLPOSITION.NOMENCLATURE))
                    .where( WAYBILLS.WAYBILLDATE.greaterThan( firstPeriod ) )
                    .and( WAYBILLS.WAYBILLDATE.lessThan( secondPeriod ) )
                    .groupBy(WAYBILLS.ORGANIZATION,NOMENCLATURES.TITLE)
                    .fetch();

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 //   String sql = "select  Organization,Title from waybills join  waybillPosition on waybills.WaybillsID  = waybillPosition.WaybillsID join nomenclatures on waybillPosition.Nomenclature = nomenclatures.Nomenclature WHERE WaybillDate BETWEEN "+firstPeriod+" AND "+secondPeriod+" GROUP BY nomenclatures.Title, waybills.Organization\n";
