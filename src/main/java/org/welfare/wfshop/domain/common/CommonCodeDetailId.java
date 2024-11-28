package org.welfare.wfshop.domain.common;

import java.io.Serializable;
import java.util.Objects;

public class CommonCodeDetailId implements Serializable {

    private String code; // 공통 코드
    private String subCode; // 세부 코드

    // 기본 생성자
    public CommonCodeDetailId() {}

    public CommonCodeDetailId(String code, String subCode) {
        this.code = code;
        this.subCode = subCode;
    }

    // Getter, Setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    // equals()와 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o =="" || getClass() != o.getClass()) return false;
        CommonCodeDetailId that = (CommonCodeDetailId) o;
        return Objects.equals(code, that.code) && Objects.equals(subCode, that.subCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, subCode);
    }
}
