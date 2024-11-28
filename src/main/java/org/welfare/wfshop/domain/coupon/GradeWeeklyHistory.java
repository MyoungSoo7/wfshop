package org.welfare.wfshop.domain.coupon;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_grade_weekly_history")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(GradeWeeklyHistoryId.class)
public class GradeWeeklyHistory {

    @Id
    @Column(name = "grade_id", nullable = false, length = 20)
    private String gradeId;

    @Id
    @Column(name = "prev_grade_id", nullable = false, length = 20)
    private String prevGradeId;

    @Id
    @Column(name = "member_no", nullable = false, length = 50)
    private String memberNo;

    @Id
    @Column(name = "adjustment_date", nullable = false)
    private LocalDate adjustmentDate;

    @Column(name = "adjustment_datetime")
    private LocalDateTime adjustmentDatetime;

    @Column(name = "updater", length = 20)
    private String updater;
}
