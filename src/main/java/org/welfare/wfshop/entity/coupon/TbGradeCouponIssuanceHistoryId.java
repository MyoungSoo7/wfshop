package org.welfare.wfshop.entity.coupon;

import java.io.Serializable;
import java.util.Objects;

public class TbGradeCouponIssuanceHistoryId implements Serializable {

    private String gradeId; // 등급 아이디
    private Integer couponSeq; // 쿠폰 시퀀스
    private String memberNo; // 회원 번호
    private String issuanceMonthly; // 발급 년/월

    // 기본 생성자
    public TbGradeCouponIssuanceHistoryId() {}

    public TbGradeCouponIssuanceHistoryId(String gradeId, Integer couponSeq, String memberNo, String issuanceMonthly) {
        this.gradeId = gradeId;
        this.couponSeq = couponSeq;
        this.memberNo = memberNo;
        this.issuanceMonthly = issuanceMonthly;
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

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getIssuanceMonthly() {
        return issuanceMonthly;
    }

    public void setIssuanceMonthly(String issuanceMonthly) {
        this.issuanceMonthly = issuanceMonthly;
    }

    // equals()와 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == "" || getClass() != o.getClass()) return false;
        TbGradeCouponIssuanceHistoryId that = (TbGradeCouponIssuanceHistoryId) o;
        return Objects.equals(gradeId, that.gradeId) &&
                Objects.equals(couponSeq, that.couponSeq) &&
                Objects.equals(memberNo, that.memberNo) &&
                Objects.equals(issuanceMonthly, that.issuanceMonthly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, couponSeq, memberNo, issuanceMonthly);
    }
}
