/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.gradle.db.information_schema.tables.pojos;


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
public class CrossReferences implements Serializable {

    private static final long serialVersionUID = 49323976;

    private String pktableCatalog;
    private String pktableSchema;
    private String pktableName;
    private String pkcolumnName;
    private String fktableCatalog;
    private String fktableSchema;
    private String fktableName;
    private String fkcolumnName;
    private Short  ordinalPosition;
    private Short  updateRule;
    private Short  deleteRule;
    private String fkName;
    private String pkName;
    private Short  deferrability;

    public CrossReferences() {}

    public CrossReferences(CrossReferences value) {
        this.pktableCatalog = value.pktableCatalog;
        this.pktableSchema = value.pktableSchema;
        this.pktableName = value.pktableName;
        this.pkcolumnName = value.pkcolumnName;
        this.fktableCatalog = value.fktableCatalog;
        this.fktableSchema = value.fktableSchema;
        this.fktableName = value.fktableName;
        this.fkcolumnName = value.fkcolumnName;
        this.ordinalPosition = value.ordinalPosition;
        this.updateRule = value.updateRule;
        this.deleteRule = value.deleteRule;
        this.fkName = value.fkName;
        this.pkName = value.pkName;
        this.deferrability = value.deferrability;
    }

    public CrossReferences(
        String pktableCatalog,
        String pktableSchema,
        String pktableName,
        String pkcolumnName,
        String fktableCatalog,
        String fktableSchema,
        String fktableName,
        String fkcolumnName,
        Short  ordinalPosition,
        Short  updateRule,
        Short  deleteRule,
        String fkName,
        String pkName,
        Short  deferrability
    ) {
        this.pktableCatalog = pktableCatalog;
        this.pktableSchema = pktableSchema;
        this.pktableName = pktableName;
        this.pkcolumnName = pkcolumnName;
        this.fktableCatalog = fktableCatalog;
        this.fktableSchema = fktableSchema;
        this.fktableName = fktableName;
        this.fkcolumnName = fkcolumnName;
        this.ordinalPosition = ordinalPosition;
        this.updateRule = updateRule;
        this.deleteRule = deleteRule;
        this.fkName = fkName;
        this.pkName = pkName;
        this.deferrability = deferrability;
    }

    public String getPktableCatalog() {
        return this.pktableCatalog;
    }

    public void setPktableCatalog(String pktableCatalog) {
        this.pktableCatalog = pktableCatalog;
    }

    public String getPktableSchema() {
        return this.pktableSchema;
    }

    public void setPktableSchema(String pktableSchema) {
        this.pktableSchema = pktableSchema;
    }

    public String getPktableName() {
        return this.pktableName;
    }

    public void setPktableName(String pktableName) {
        this.pktableName = pktableName;
    }

    public String getPkcolumnName() {
        return this.pkcolumnName;
    }

    public void setPkcolumnName(String pkcolumnName) {
        this.pkcolumnName = pkcolumnName;
    }

    public String getFktableCatalog() {
        return this.fktableCatalog;
    }

    public void setFktableCatalog(String fktableCatalog) {
        this.fktableCatalog = fktableCatalog;
    }

    public String getFktableSchema() {
        return this.fktableSchema;
    }

    public void setFktableSchema(String fktableSchema) {
        this.fktableSchema = fktableSchema;
    }

    public String getFktableName() {
        return this.fktableName;
    }

    public void setFktableName(String fktableName) {
        this.fktableName = fktableName;
    }

    public String getFkcolumnName() {
        return this.fkcolumnName;
    }

    public void setFkcolumnName(String fkcolumnName) {
        this.fkcolumnName = fkcolumnName;
    }

    public Short getOrdinalPosition() {
        return this.ordinalPosition;
    }

    public void setOrdinalPosition(Short ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public Short getUpdateRule() {
        return this.updateRule;
    }

    public void setUpdateRule(Short updateRule) {
        this.updateRule = updateRule;
    }

    public Short getDeleteRule() {
        return this.deleteRule;
    }

    public void setDeleteRule(Short deleteRule) {
        this.deleteRule = deleteRule;
    }

    public String getFkName() {
        return this.fkName;
    }

    public void setFkName(String fkName) {
        this.fkName = fkName;
    }

    public String getPkName() {
        return this.pkName;
    }

    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    public Short getDeferrability() {
        return this.deferrability;
    }

    public void setDeferrability(Short deferrability) {
        this.deferrability = deferrability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CrossReferences (");

        sb.append(pktableCatalog);
        sb.append(", ").append(pktableSchema);
        sb.append(", ").append(pktableName);
        sb.append(", ").append(pkcolumnName);
        sb.append(", ").append(fktableCatalog);
        sb.append(", ").append(fktableSchema);
        sb.append(", ").append(fktableName);
        sb.append(", ").append(fkcolumnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(updateRule);
        sb.append(", ").append(deleteRule);
        sb.append(", ").append(fkName);
        sb.append(", ").append(pkName);
        sb.append(", ").append(deferrability);

        sb.append(")");
        return sb.toString();
    }
}
