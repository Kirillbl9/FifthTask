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
public class Tables implements Serializable {

    private static final long serialVersionUID = 1965964882;

    private String  tableCatalog;
    private String  tableSchema;
    private String  tableName;
    private String  tableType;
    private String  storageType;
    private String  sql;
    private String  remarks;
    private Long    lastModification;
    private Integer id;
    private String  typeName;
    private String  tableClass;
    private Long    rowCountEstimate;

    public Tables() {}

    public Tables(Tables value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.tableType = value.tableType;
        this.storageType = value.storageType;
        this.sql = value.sql;
        this.remarks = value.remarks;
        this.lastModification = value.lastModification;
        this.id = value.id;
        this.typeName = value.typeName;
        this.tableClass = value.tableClass;
        this.rowCountEstimate = value.rowCountEstimate;
    }

    public Tables(
        String  tableCatalog,
        String  tableSchema,
        String  tableName,
        String  tableType,
        String  storageType,
        String  sql,
        String  remarks,
        Long    lastModification,
        Integer id,
        String  typeName,
        String  tableClass,
        Long    rowCountEstimate
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.tableType = tableType;
        this.storageType = storageType;
        this.sql = sql;
        this.remarks = remarks;
        this.lastModification = lastModification;
        this.id = id;
        this.typeName = typeName;
        this.tableClass = tableClass;
        this.rowCountEstimate = rowCountEstimate;
    }

    public String getTableCatalog() {
        return this.tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return this.tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return this.tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getSql() {
        return this.sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getLastModification() {
        return this.lastModification;
    }

    public void setLastModification(Long lastModification) {
        this.lastModification = lastModification;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTableClass() {
        return this.tableClass;
    }

    public void setTableClass(String tableClass) {
        this.tableClass = tableClass;
    }

    public Long getRowCountEstimate() {
        return this.rowCountEstimate;
    }

    public void setRowCountEstimate(Long rowCountEstimate) {
        this.rowCountEstimate = rowCountEstimate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tables (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(tableType);
        sb.append(", ").append(storageType);
        sb.append(", ").append(sql);
        sb.append(", ").append(remarks);
        sb.append(", ").append(lastModification);
        sb.append(", ").append(id);
        sb.append(", ").append(typeName);
        sb.append(", ").append(tableClass);
        sb.append(", ").append(rowCountEstimate);

        sb.append(")");
        return sb.toString();
    }
}
