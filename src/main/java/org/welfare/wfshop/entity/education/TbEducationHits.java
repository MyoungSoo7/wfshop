package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_hits", indexes = {
        @Index(name = "ix_tb_education_hits_education_no", columnList = "education_no"),
        @Index(name = "ix_tb_education_hits_member_no", columnList = "member_no"),
        @Index(name = "ix_tb_education_hits_reg_date", columnList = "reg_date")
})
public class TbEducationHits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", length = 20)
    private String educationNo; // 강좌 고유 번호 (tb_education.education_no 참조)

    @Column(name = "member_no", length = 20)
    private String memberNo; // 회원 번호

    @Column(name = "ip_address", length = 30)
    private String ipAddress; // 조회한 사용자의 IP 주소

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 조회 일시
}
