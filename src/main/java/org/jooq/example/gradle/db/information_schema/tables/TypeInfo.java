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
import org.jooq.example.gradle.db.information_schema.tables.records.TypeInfoRecord;
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
public class TypeInfo extends TableImpl<TypeInfoRecord> {

    private static final long serialVersionUID = -1087335446;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TYPE_INFO</code>
     */
    public static final TypeInfo TYPE_INFO = new TypeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TypeInfoRecord> getRecordType() {
        return TypeInfoRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.TYPE_NAME</code>.
     */
    public final TableField<TypeInfoRecord, String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.DATA_TYPE</code>.
     */
    public final TableField<TypeInfoRecord, Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PRECISION</code>.
     */
    public final TableField<TypeInfoRecord, Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PREFIX</code>.
     */
    public final TableField<TypeInfoRecord, String> PREFIX = createField("PREFIX", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SUFFIX</code>.
     */
    public final TableField<TypeInfoRecord, String> SUFFIX = createField("SUFFIX", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.PARAMS</code>.
     */
    public final TableField<TypeInfoRecord, String> PARAMS = createField("PARAMS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.AUTO_INCREMENT</code>.
     */
    public final TableField<TypeInfoRecord, Boolean> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MINIMUM_SCALE</code>.
     */
    public final TableField<TypeInfoRecord, Short> MINIMUM_SCALE = createField("MINIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.MAXIMUM_SCALE</code>.
     */
    public final TableField<TypeInfoRecord, Short> MAXIMUM_SCALE = createField("MAXIMUM_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.RADIX</code>.
     */
    public final TableField<TypeInfoRecord, Integer> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.POS</code>.
     */
    public final TableField<TypeInfoRecord, Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.CASE_SENSITIVE</code>.
     */
    public final TableField<TypeInfoRecord, Boolean> CASE_SENSITIVE = createField("CASE_SENSITIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.NULLABLE</code>.
     */
    public final TableField<TypeInfoRecord, Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TYPE_INFO.SEARCHABLE</code>.
     */
    public final TableField<TypeInfoRecord, Short> SEARCHABLE = createField("SEARCHABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.TYPE_INFO</code> table reference
     */
    public TypeInfo() {
        this(DSL.name("TYPE_INFO"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TYPE_INFO</code> table reference
     */
    public TypeInfo(String alias) {
        this(DSL.name(alias), TYPE_INFO);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TYPE_INFO</code> table reference
     */
    public TypeInfo(Name alias) {
        this(alias, TYPE_INFO);
    }

    private TypeInfo(Name alias, Table<TypeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TypeInfo(Name alias, Table<TypeInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TypeInfo(Table<O> child, ForeignKey<O, TypeInfoRecord> key) {
        super(child, key, TYPE_INFO);
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
    public TypeInfo as(String alias) {
        return new TypeInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeInfo as(Name alias) {
        return new TypeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TypeInfo rename(String name) {
        return new TypeInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TypeInfo rename(Name name) {
        return new TypeInfo(name, null);
    }
}
