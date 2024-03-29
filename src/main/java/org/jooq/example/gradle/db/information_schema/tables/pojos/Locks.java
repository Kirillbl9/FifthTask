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
public class Locks implements Serializable {

    private static final long serialVersionUID = 800941894;

    private String  tableSchema;
    private String  tableName;
    private Integer sessionId;
    private String  lockType;

    public Locks() {}

    public Locks(Locks value) {
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.sessionId = value.sessionId;
        this.lockType = value.lockType;
    }

    public Locks(
        String  tableSchema,
        String  tableName,
        Integer sessionId,
        String  lockType
    ) {
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.sessionId = sessionId;
        this.lockType = lockType;
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

    public Integer getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getLockType() {
        return this.lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Locks (");

        sb.append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(lockType);

        sb.append(")");
        return sb.toString();
    }
}
