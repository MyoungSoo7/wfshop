package org.welfare.wfshop.entity.coupon;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_grade_member_history", indexes = {
        @Index(name = "idx_grade_id", columnList = "grade_id"),
        @Index(name = "idx_member_no", columnList = "member_no")
})
public class TbGradeMemberHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 시퀀스

    @Column(name = "grade_id", nullable = false, length = 20)
    private String gradeId; // 등급 아이디

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo; // 멤버 아이디

    @Column(name = "prev_grade_id", length = 20)
    private String prevGradeId; // 기존 등급 아이디

    @Column(name = "updater", length = 20)
    private String updater; // 변경자(관리자/시스템)

    @Column(name = "update_date")
    private java.time.LocalDateTime updateDate; // 등급 조정일

    @Column(name = "maintain_date")
    private java.time.LocalDateTime maintainDate; // 유지기간
}

