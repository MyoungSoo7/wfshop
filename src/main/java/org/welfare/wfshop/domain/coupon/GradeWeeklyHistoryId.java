package org.welfare.wfshop.domain.coupon;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class GradeWeeklyHistoryId implements Serializable {

    private String gradeId;
    private String prevGradeId;
    private String memberNo;
    private LocalDate adjustmentDate;

    // 기본 생성자
    public GradeWeeklyHistoryId() {}

    public GradeWeeklyHistoryId(String gradeId, String prevGradeId, String memberNo, LocalDate adjustmentDate) {
        this.gradeId = gradeId;
        this.prevGradeId = prevGradeId;
        this.memberNo = memberNo;
        this.adjustmentDate = adjustmentDate;
    }

    // Getter, Setter
    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getPrevGradeId() {
        return prevGradeId;
    }

    public void setPrevGradeId(String prevGradeId) {
        this.prevGradeId = prevGradeId;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public LocalDate getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(LocalDate adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    // equals()와 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == "" || getClass() != o.getClass()) return false;
        GradeWeeklyHistoryId that = (GradeWeeklyHistoryId) o;
        return Objects.equals(gradeId, that.gradeId) &&
                Objects.equals(prevGradeId, that.prevGradeId) &&
                Objects.equals(memberNo, that.memberNo) &&
                Objects.equals(adjustmentDate, that.adjustmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, prevGradeId, memberNo, adjustmentDate);
    }
}
