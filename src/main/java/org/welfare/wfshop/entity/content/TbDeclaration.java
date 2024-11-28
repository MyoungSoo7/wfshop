package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_declaration", indexes = {
        @Index(name = "idx_board_type_code", columnList = "board_type_code"),
        @Index(name = "idx_contents_no", columnList = "contents_no"),
        @Index(name = "idx_decl_code", columnList = "decl_code"),
        @Index(name = "idx_reg_date", columnList = "reg_date"),
        @Index(name = "idx_process_yn", columnList = "process_yn")
})
public class TbDeclaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 신고 고유 식별자 (Primary Key)

    @Column(name = "board_type_code", nullable = false, length = 6)
    private String boardTypeCode; // 게시판 분류 코드

    @Column(name = "board", nullable = false, length = 20)
    private String board; // 신고당한 게시판 이름

    @Column(name = "contents_no", nullable = false, length = 30)
    private String contentsNo; // 신고당한 콘텐츠 번호

    @Column(name = "category", length = 10)
    private String category; // 신고 카테고리

    @Column(name = "decl_code", length = 6)
    private String declCode; // 신고 사유 코드

    @Column(name = "decl_contents", columnDefinition = "TEXT")
    private String declContents; // 신고 내용

    @Column(name = "contents", columnDefinition = "TEXT")
    private String contents; // 댓글 내용

    @Column(name = "decl_id", nullable = false, length = 40)
    private String declId; // 신고된 게시글 작성자 ID

    @Column(name = "decl_me_id", nullable = false, length = 40)
    private String declMeId; // 신고한 사람 ID

    @Column(name = "reg_date", nullable = false)
    private java.sql.Date regDate; // 신고 날짜

    @Column(name = "write_date")
    private java.sql.Date writeDate; // 작성 일시

    @Column(name = "delete_yn", length = 2)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "delete_date")
    private java.sql.Date deleteDate; // 삭제 일시

    @Column(name = "process_yn", length = 2)
    private String processYn; // 처리 완료 여부 (Y: 처리 완료, N: 미처리)

    @Column(name = "comment_seq", length = 20)
    private String commentSeq; // 댓글 고유 식별자
}
