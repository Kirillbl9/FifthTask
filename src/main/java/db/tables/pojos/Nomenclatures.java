/*
 * This file is generated by jOOQ.
 */
package db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Nomenclatures implements Serializable {

    private static final long serialVersionUID = -1804564636;

    private final String title;
    private final String internalcode;
    private final String nomenclature;

    public Nomenclatures(Nomenclatures value) {
        this.title = value.title;
        this.internalcode = value.internalcode;
        this.nomenclature = value.nomenclature;
    }

    public Nomenclatures(
        String title,
        String internalcode,
        String nomenclature
    ) {
        this.title = title;
        this.internalcode = internalcode;
        this.nomenclature = nomenclature;
    }

    public String getTitle() {
        return this.title;
    }

    public String getInternalcode() {
        return this.internalcode;
    }

    public String getNomenclature() {
        return this.nomenclature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Nomenclatures (");

        sb.append(title);
        sb.append(", ").append(internalcode);
        sb.append(", ").append(nomenclature);

        sb.append(")");
        return sb.toString();
    }
}