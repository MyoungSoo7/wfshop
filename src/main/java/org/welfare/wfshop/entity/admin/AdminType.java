package org.welfare.wfshop.entity.admin;

public enum AdminType {
    SUPER_ADMIN("1"),
    GENERAL_ADMIN("2"),
    ETC("3");

    private final String code;

    AdminType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
