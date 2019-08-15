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
public class Domains implements Serializable {

    private static final long serialVersionUID = -1958975262;

    private String  domainCatalog;
    private String  domainSchema;
    private String  domainName;
    private String  columnDefault;
    private String  isNullable;
    private Integer dataType;
    private Integer precision;
    private Integer scale;
    private String  typeName;
    private Integer selectivity;
    private String  checkConstraint;
    private String  remarks;
    private String  sql;
    private Integer id;

    public Domains() {}

    public Domains(Domains value) {
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.precision = value.precision;
        this.scale = value.scale;
        this.typeName = value.typeName;
        this.selectivity = value.selectivity;
        this.checkConstraint = value.checkConstraint;
        this.remarks = value.remarks;
        this.sql = value.sql;
        this.id = value.id;
    }

    public Domains(
        String  domainCatalog,
        String  domainSchema,
        String  domainName,
        String  columnDefault,
        String  isNullable,
        Integer dataType,
        Integer precision,
        Integer scale,
        String  typeName,
        Integer selectivity,
        String  checkConstraint,
        String  remarks,
        String  sql,
        Integer id
    ) {
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.precision = precision;
        this.scale = scale;
        this.typeName = typeName;
        this.selectivity = selectivity;
        this.checkConstraint = checkConstraint;
        this.remarks = remarks;
        this.sql = sql;
        this.id = id;
    }

    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    public void setDomainCatalog(String domainCatalog) {
        this.domainCatalog = domainCatalog;
    }

    public String getDomainSchema() {
        return this.domainSchema;
    }

    public void setDomainSchema(String domainSchema) {
        this.domainSchema = domainSchema;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getColumnDefault() {
        return this.columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return this.isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getSelectivity() {
        return this.selectivity;
    }

    public void setSelectivity(Integer selectivity) {
        this.selectivity = selectivity;
    }

    public String getCheckConstraint() {
        return this.checkConstraint;
    }

    public void setCheckConstraint(String checkConstraint) {
        this.checkConstraint = checkConstraint;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSql() {
        return this.sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Domains (");

        sb.append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(precision);
        sb.append(", ").append(scale);
        sb.append(", ").append(typeName);
        sb.append(", ").append(selectivity);
        sb.append(", ").append(checkConstraint);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sql);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
