package org.welfare.wfshop.entity.board;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(
        name = "tb_board_common",
        indexes = {
                @Index(name = "ix_tb_common_board_board_type_code", columnList = "board_type_code"),
                @Index(name = "ix_tb_common_board_category_code", columnList = "category_code"),
                @Index(name = "ix_tb_common_board_admin_no", columnList = "admin_no")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BoardCommon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no", nullable = false, columnDefinition = "INT COMMENT '게시글 고유 번호 (Primary Key)'")
    private Integer boardNo;

    @Column(name = "board_type_code", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드 (예: 공지사항, FAQ 등)'")
    private String boardTypeCode;

    @Column(name = "title", nullable = false, length = 80, columnDefinition = "VARCHAR(80) COMMENT '게시글 제목'")
    private String title;

    @Lob
    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '게시글 등록 시간'")
    private LocalDateTime regDate;

    @Column(name = "mod_date", columnDefinition = "TIMESTAMP NULL COMMENT '게시글 수정 시간'")
    private LocalDateTime modDate;

    @Column(name = "delete_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '게시글 삭제 여부 (Y: 삭제됨, N: 삭제되지 않음)'")
    private String deleteYn;

    @Column(name = "modify_no", length = 15, columnDefinition = "VARCHAR(15) COMMENT '게시글 수정자 번호'")
    private String modifyNo;

    @Column(name = "category_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '게시글 카테고리 코드'")
    private String categoryCode;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '게시글 삭제 시간'")
    private LocalDateTime deleteDate;

    @Column(name = "admin_no", nullable = false, length = 15, columnDefinition = "VARCHAR(15) COMMENT '게시글 관리자의 고유 번호'")
    private String adminNo;

    @Column(name = "search_count", columnDefinition = "BIGINT COMMENT '게시글 조회 수'")
    private Long searchCount;

    @Column(name = "main_yn", length = 2, columnDefinition = "CHAR(2) COMMENT '메인 화면 표시 여부 (Y: 표시, N: 표시 안 함)'")
    private String mainYn;

    @Column(name = "seo_keyword", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 키워드 (검색 엔진 최적화용)'")
    private String seoKeyword;

    @Column(name = "seo_exp", length = 300, columnDefinition = "VARCHAR(300) COMMENT 'SEO 설명 (검색 엔진 최적화용)'")
    private String seoExp;

    @Column(name = "seo_image_code", length = 30, columnDefinition = "VARCHAR(30) COMMENT 'SEO 이미지 코드'")
    private String seoImageCode;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BoardAnswer> answers; // BoardAnswer와의 1:N 관계
}
