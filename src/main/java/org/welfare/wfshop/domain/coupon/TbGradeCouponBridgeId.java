package org.welfare.wfshop.domain.coupon;

import java.io.Serializable;
import java.util.Objects;

public class TbGradeCouponBridgeId implements Serializable {

    private String gradeId; // 등급 아이디
    private Integer couponSeq; // 쿠폰 시퀀스

    // 기본 생성자
    public TbGradeCouponBridgeId() {}

    public TbGradeCouponBridgeId(String gradeId, Integer couponSeq) {
        this.gradeId = gradeId;
        this.couponSeq = couponSeq;
    }

    // Getter, Setter
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getCouponSeq() {
        return couponSeq;
    }

    public void setCouponSeq(Integer couponSeq) {
        this.couponSeq = couponSeq;
    }

    // equals()와 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == "" || getClass() != o.getClass()) return false;
        TbGradeCouponBridgeId that = (TbGradeCouponBridgeId) o;
        return Objects.equals(gradeId, that.gradeId) && Objects.equals(couponSeq, that.couponSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, couponSeq);
    }
}
