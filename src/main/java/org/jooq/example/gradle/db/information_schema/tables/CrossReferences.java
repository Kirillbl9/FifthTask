/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.gradle.db.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.information_schema.InformationSchema;
import org.jooq.example.gradle.db.information_schema.tables.records.CrossReferencesRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrossReferences extends TableImpl<CrossReferencesRecord> {

    private static final long serialVersionUID = -440341734;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code>
     */
    public static final CrossReferences CROSS_REFERENCES = new CrossReferences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrossReferencesRecord> getRecordType() {
        return CrossReferencesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
     */
    public final TableField<CrossReferencesRecord, String> PKTABLE_CATALOG = createField("PKTABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
     */
    public final TableField<CrossReferencesRecord, String> PKTABLE_SCHEMA = createField("PKTABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> PKTABLE_NAME = createField("PKTABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> PKCOLUMN_NAME = createField("PKCOLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
     */
    public final TableField<CrossReferencesRecord, String> FKTABLE_CATALOG = createField("FKTABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
     */
    public final TableField<CrossReferencesRecord, String> FKTABLE_SCHEMA = createField("FKTABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> FKTABLE_NAME = createField("FKTABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> FKCOLUMN_NAME = createField("FKCOLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
     */
    public final TableField<CrossReferencesRecord, Short> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
     */
    public final TableField<CrossReferencesRecord, Short> UPDATE_RULE = createField("UPDATE_RULE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
     */
    public final TableField<CrossReferencesRecord, Short> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> FK_NAME = createField("FK_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
     */
    public final TableField<CrossReferencesRecord, String> PK_NAME = createField("PK_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
     */
    public final TableField<CrossReferencesRecord, Short> DEFERRABILITY = createField("DEFERRABILITY", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code> table reference
     */
    public CrossReferences() {
        this(DSL.name("CROSS_REFERENCES"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code> table reference
     */
    public CrossReferences(String alias) {
        this(DSL.name(alias), CROSS_REFERENCES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code> table reference
     */
    public CrossReferences(Name alias) {
        this(alias, CROSS_REFERENCES);
    }

    private CrossReferences(Name alias, Table<CrossReferencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private CrossReferences(Name alias, Table<CrossReferencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CrossReferences(Table<O> child, ForeignKey<O, CrossReferencesRecord> key) {
        super(child, key, CROSS_REFERENCES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossReferences as(String alias) {
        return new CrossReferences(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossReferences as(Name alias) {
        return new CrossReferences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CrossReferences rename(String name) {
        return new CrossReferences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CrossReferences rename(Name name) {
        return new CrossReferences(name, null);
    }
}
