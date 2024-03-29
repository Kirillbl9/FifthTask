/*
 * This file is generated by jOOQ.
 */
package db;


import db.tables.Authors;
import db.tables.Nomenclatures;
import db.tables.Organizations;
import db.tables.Waybillposition;
import db.tables.Waybills;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.AUTHORS</code>.
     */
    public static final Authors AUTHORS = db.tables.Authors.AUTHORS;

    /**
     * The table <code>public.nomenclatures</code>.
     */
    public static final Nomenclatures NOMENCLATURES = db.tables.Nomenclatures.NOMENCLATURES;

    /**
     * The table <code>public.organizations</code>.
     */
    public static final Organizations ORGANIZATIONS = db.tables.Organizations.ORGANIZATIONS;

    /**
     * The table <code>public.waybillposition</code>.
     */
    public static final Waybillposition WAYBILLPOSITION = db.tables.Waybillposition.WAYBILLPOSITION;

    /**
     * The table <code>public.waybills</code>.
     */
    public static final Waybills WAYBILLS = db.tables.Waybills.WAYBILLS;
}
