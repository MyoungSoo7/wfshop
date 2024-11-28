package org.welfare.wfshop.domain.event;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_banner",
        indexes = {
                @Index(name = "ix_tb_banner_board_type_code", columnList = "board_type_code"),
                @Index(name = "ix_tb_banner_delete_yn", columnList = "delete_yn"),
                @Index(name = "ix_tb_banner_title", columnList = "title"),
                @Index(name = "ix_tb_banner_use_yn", columnList = "use_yn")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '배너 고유 번호 (Primary Key, 자동 증가 값)'")
    private Integer seq;

    @Column(name = "board_type_code", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드 (배너가 속한 게시판의 구분 코드)'")
    private String boardTypeCode;

    @Column(name = "title", nullable = false, length = 500, columnDefinition = "VARCHAR(500) COMMENT '배너 제목 (최대 500자)'")
    private String title;

    @Column(name = "url", length = 500, columnDefinition = "VARCHAR(500) COMMENT '배너 클릭 시 이동할 URL (선택 사항)'")
    private String url;

    @Column(name = "sort", columnDefinition = "INT COMMENT '배너 정렬 순서 (숫자가 작을수록 우선순위가 높음)'")
    private Integer sort;

    @Column(name = "file_master_code", nullable = false, length = 20, columnDefinition = "VARCHAR(20) COMMENT '배너에 연결된 파일의 마스터 코드 (대표 이미지)'")
    private String fileMasterCode;

    @Column(name = "use_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '배너 사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "delete_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '배너 삭제 여부 (Y: 삭제됨, N: 삭제되지 않음)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '배너 삭제 일시 (삭제된 경우에만 값이 있음)'")
    private LocalDateTime deleteDate;

    @Column(name = "mod_date", columnDefinition = "TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP COMMENT '배너 등록 일시 (최초 생성 시간)'")
    private LocalDateTime modDate;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '배너 수정 일시 (마지막 수정 시간)'")
    private LocalDateTime regDate;

    @Column(name = "type_text", length = 20, columnDefinition = "VARCHAR(20) COMMENT '배너에 연결된 두 번째 파일의 마스터 코드 (보조 이미지)'")
    private String typeText;

    @Column(name = "file_master_code2", length = 20, columnDefinition = "VARCHAR(20) COMMENT '배너에 연결된 두 번째 파일의 마스터 코드'")
    private String fileMasterCode2;
}

