package org.welfare.wfshop.entity.biztalk;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_biztalk_list",
        indexes = {
                @Index(name = "idx_telephone_no", columnList = "telephone_no"),
                @Index(name = "idx_reg_date", columnList = "reg_date")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BiztalkList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT COMMENT '비즈톡 리스트 시퀀스 (고유 ID)'")
    private Long id;

    @Column(name = "telephone_no", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '사용자 핸드폰 번호 (수신자 전화번호)'")
    private String telephoneNo;

    @Lob
    @Column(name = "talk_content", columnDefinition = "TEXT COMMENT '발송 내용 (비즈톡 메시지 본문)'")
    private String talkContent;

    @Column(name = "talk_result", length = 50, columnDefinition = "VARCHAR(50) COMMENT '전송 결과 (예: 성공, 실패, 대기 중)'")
    private String talkResult;

    @Column(name = "talk_status", length = 50, columnDefinition = "VARCHAR(50) COMMENT '발송 상황 (예: 발송 요청, 발송 완료, 발송 실패)'")
    private String talkStatus;

    @Column(name = "reg_date", columnDefinition = "DATETIME COMMENT '발송 요청 시간 (메시지 발송 요청이 생성된 시간)'")
    private LocalDateTime regDate;
}
