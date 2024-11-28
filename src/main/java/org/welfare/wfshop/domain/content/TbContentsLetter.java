package org.welfare.wfshop.domain.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_contents_letter",
        indexes = {
                @Index(name = "idx_contents_no", columnList = "contents_no"),
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_reg_date", columnList = "reg_date"),
                @Index(name = "idx_letter_yn", columnList = "letter_yn")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 발송 정보 고유 식별자 (Primary Key)

    @Column(name = "contents_no", length = 15)
    private String contentsNo; // 발송 대상 콘텐츠 번호

    @Column(name = "letter_code", length = 30)
    private String letterCode; // 발송 코드

    @Column(name = "member_no", length = 20)
    private String memberNo; // 발송 요청 회원 번호

    @Column(name = "letter_name", length = 100)
    private String letterName; // 수신자 이름

    @Column(name = "letter_telephone_no", length = 30)
    private String letterTelephoneNo; // 수신자 전화번호

    @Column(name = "letter_phone_no", length = 30)
    private String letterPhoneNo; // 수신자 휴대폰 번호

    @Column(name = "letter_postcode", length = 6)
    private String letterPostcode; // 수신자 우편번호

    @Column(name = "letter_address", length = 200)
    private String letterAddress; // 수신자 주소

    @Column(name = "letter_detail_address", length = 200)
    private String letterDetailAddress; // 수신자 상세 주소

    @Column(name = "letter_yn", length = 1, nullable = false)
    private String letterYn; // 발송 여부 (Y: 발송, N: 미발송)

    @Column(name = "reg_date")
    private LocalDateTime regDate; // 발송 요청 날짜 및 시간
}
