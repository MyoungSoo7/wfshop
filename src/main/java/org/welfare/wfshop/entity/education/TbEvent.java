package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_event", indexes = {
        @Index(name = "ix_tb_event_start_date", columnList = "start_date"),
        @Index(name = "ix_tb_event_end_date", columnList = "end_date"),
        @Index(name = "ix_tb_event_use_yn", columnList = "use_yn")
})
public class TbEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no", nullable = false)
    private Integer boardNo; // 고유 식별자 (Primary Key)

    @Column(name = "title", length = 40, nullable = false)
    private String title; // 이벤트 제목

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content; // 이벤트 내용

    @Column(name = "registrant_no", length = 15, nullable = false)
    private String registrantNo; // 등록자 회원 번호

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시

    @Column(name = "modify_no", length = 15)
    private String modifyNo; // 수정자 회원 번호

    @Column(name = "mod_date")
    private java.sql.Timestamp modDate; // 수정 일시

    @Column(name = "delete_yn", length = 1, nullable = false)
    private String deleteYn; // 삭제 여부 (Y/N)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제 일시

    @Column(name = "start_date", nullable = false)
    private java.sql.Date startDate; // 이벤트 시작일

    @Column(name = "end_date", nullable = false)
    private java.sql.Date endDate; // 이벤트 종료일

    @Column(name = "url", length = 300)
    private String url; // 이벤트 URL

    @Column(name = "event_type", length = 6)
    private String eventType; // 이벤트 유형

    @Column(name = "use_yn", length = 1)
    private String useYn; // 사용 여부 (Y/N)

    @Column(name = "summary", length = 40)
    private String summary; // 이벤트 요약

    @Column(name = "main_yn", length = 2)
    private String mainYn; // 메인 노출 여부 (Y/N)

    @Column(name = "file_master_code", length = 20)
    private String fileMasterCode; // 파일 마스터 코드

    @Column(name = "new_yn", length = 2)
    private String newYn; // 신규 여부 (Y/N)

    @Column(name = "seo_keyword", length = 300)
    private String seoKeyword; // SEO 키워드

    @Column(name = "seo_exp", length = 300)
    private String seoExp; // SEO 설명

    @Column(name = "seo_image_code", length = 30)
    private String seoImageCode; // SEO 이미지 코드
}
