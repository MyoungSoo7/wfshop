package org.welfare.wfshop.domain.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_contents_hits",
        indexes = {
                @Index(name = "idx_contents_no", columnList = "contents_no"),
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_reg_date", columnList = "reg_date"),
                @Index(name = "idx_contents_type", columnList = "contents_type")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsHits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 조회 기록 고유 식별자 (Primary Key)

    @Column(name = "contents_no", length = 25)
    private String contentsNo; // 조회된 콘텐츠 번호

    @Column(name = "member_no", length = 25)
    private String memberNo; // 조회한 회원 번호

    @Column(name = "reg_date")
    private LocalDateTime regDate; // 조회 날짜 및 시간

    @Column(name = "ip_address", length = 30)
    private String ipAddress; // 조회한 사용자의 IP 주소

    @Column(name = "contents_type", length = 30)
    private String contentsType; // 콘텐츠 유형

    @Column(name = "board_type_code", length = 30)
    private String boardTypeCode; // 게시판 유형 코드
}

