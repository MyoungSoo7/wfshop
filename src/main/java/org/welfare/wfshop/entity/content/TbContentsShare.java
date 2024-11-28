package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_contents_share",
        indexes = {
                @Index(name = "idx_contents_no", columnList = "contents_no"),
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_reg_date", columnList = "reg_date")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsShare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 공유 기록 고유 식별자 (Primary Key)

    @Column(name = "sns_type", length = 20)
    private String snsType; // SNS 유형 (예: Facebook, Twitter)

    @Column(name = "contents_no", length = 25)
    private String contentsNo; // 공유된 콘텐츠 번호

    @Column(name = "member_no", length = 25)
    private String memberNo; // 공유한 회원 번호

    @Column(name = "reg_date")
    private LocalDateTime regDate; // 공유 날짜 및 시간

    @Column(name = "ip_address", length = 30)
    private String ipAddress; // 공유한 사용자의 IP 주소

    @Column(name = "contents_type", length = 30)
    private String contentsType; // 콘텐츠 유형

    @Column(name = "board_type_code", length = 30)
    private String boardTypeCode; // 게시판 유형 코드
}

