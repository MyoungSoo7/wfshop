package org.welfare.wfshop.entity.member;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_member_log",
        indexes = {
                @Index(name = "idx_member_no", columnList = "member_no")
        })
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스 (Primary Key)'")
    private Integer seq;

    @Column(name = "member_no", length = 20, nullable = false, columnDefinition = "VARCHAR(20) COMMENT '회원 고유 번호'")
    private String memberNo;

    @Column(name = "login_date", nullable = false, columnDefinition = "DATETIME COMMENT '로그인 날짜'")
    private LocalDateTime loginDate;
}
