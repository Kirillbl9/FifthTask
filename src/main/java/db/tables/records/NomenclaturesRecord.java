/*
 * This file is generated by jOOQ.
 */
package db.tables.records;


import db.tables.Nomenclatures;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class NomenclaturesRecord extends TableRecordImpl<NomenclaturesRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -602701484;

    /**
     * Setter for <code>public.nomenclatures.title</code>.
     */
    public NomenclaturesRecord setTitle(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.nomenclatures.title</code>.
     */
    public String getTitle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.nomenclatures.internalcode</code>.
     */
    public NomenclaturesRecord setInternalcode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.nomenclatures.internalcode</code>.
     */
    public String getInternalcode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.nomenclatures.nomenclature</code>.
     */
    public NomenclaturesRecord setNomenclature(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.nomenclatures.nomenclature</code>.
     */
    public String getNomenclature() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Nomenclatures.NOMENCLATURES.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Nomenclatures.NOMENCLATURES.INTERNALCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Nomenclatures.NOMENCLATURES.NOMENCLATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getInternalcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNomenclature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getInternalcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNomenclature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclaturesRecord value1(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclaturesRecord value2(String value) {
        setInternalcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclaturesRecord value3(String value) {
        setNomenclature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NomenclaturesRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NomenclaturesRecord
     */
    public NomenclaturesRecord() {
        super(Nomenclatures.NOMENCLATURES);
    }

    /**
     * Create a detached, initialised NomenclaturesRecord
     */
    public NomenclaturesRecord(String title, String internalcode, String nomenclature) {
        super(Nomenclatures.NOMENCLATURES);

        set(0, title);
        set(1, internalcode);
        set(2, nomenclature);
    }
}
