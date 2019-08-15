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
import org.jooq.example.gradle.db.information_schema.tables.records.LocksRecord;
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
public class Locks extends TableImpl<LocksRecord> {

    private static final long serialVersionUID = -1126072963;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.LOCKS</code>
     */
    public static final Locks LOCKS = new Locks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocksRecord> getRecordType() {
        return LocksRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.TABLE_SCHEMA</code>.
     */
    public final TableField<LocksRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.TABLE_NAME</code>.
     */
    public final TableField<LocksRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.SESSION_ID</code>.
     */
    public final TableField<LocksRecord, Integer> SESSION_ID = createField("SESSION_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.LOCKS.LOCK_TYPE</code>.
     */
    public final TableField<LocksRecord, String> LOCK_TYPE = createField("LOCK_TYPE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks() {
        this(DSL.name("LOCKS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks(String alias) {
        this(DSL.name(alias), LOCKS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.LOCKS</code> table reference
     */
    public Locks(Name alias) {
        this(alias, LOCKS);
    }

    private Locks(Name alias, Table<LocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locks(Name alias, Table<LocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Locks(Table<O> child, ForeignKey<O, LocksRecord> key) {
        super(child, key, LOCKS);
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
    public Locks as(String alias) {
        return new Locks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locks as(Name alias) {
        return new Locks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locks rename(String name) {
        return new Locks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locks rename(Name name) {
        return new Locks(name, null);
    }
}
