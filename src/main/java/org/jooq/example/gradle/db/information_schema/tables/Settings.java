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
import org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord;
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
public class Settings extends TableImpl<SettingsRecord> {

    private static final long serialVersionUID = -1059074621;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SETTINGS</code>
     */
    public static final Settings SETTINGS = new Settings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SettingsRecord> getRecordType() {
        return SettingsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
     */
    public final TableField<SettingsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
     */
    public final TableField<SettingsRecord, String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
     */
    public Settings() {
        this(DSL.name("SETTINGS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
     */
    public Settings(String alias) {
        this(DSL.name(alias), SETTINGS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
     */
    public Settings(Name alias) {
        this(alias, SETTINGS);
    }

    private Settings(Name alias, Table<SettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Settings(Name alias, Table<SettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Settings(Table<O> child, ForeignKey<O, SettingsRecord> key) {
        super(child, key, SETTINGS);
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
    public Settings as(String alias) {
        return new Settings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Settings as(Name alias) {
        return new Settings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(String name) {
        return new Settings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Settings rename(Name name) {
        return new Settings(name, null);
    }
}
