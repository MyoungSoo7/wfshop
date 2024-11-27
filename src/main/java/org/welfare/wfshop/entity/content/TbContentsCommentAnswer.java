package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_contents_comment_answer",
        indexes = {
                @Index(name = "idx_comment_no", columnList = "comment_no"),
                @Index(name = "idx_contents_no", columnList = "contents_no"),
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_reg_date", columnList = "reg_date"),
                @Index(name = "idx_use_yn", columnList = "use_yn")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsCommentAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_seq", nullable = false)
    private Integer answerSeq; // 답변 고유 식별자 (Primary Key)

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo; // 답변 작성자 회원 번호

    @Column(name = "comment_no", nullable = false, length = 20)
    private String commentNo; // 답변이 달린 코멘트 번호

    // TbContentsComment와의 관계 설정 (N:1)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contents_no", referencedColumnName = "contents_no", foreignKey = @ForeignKey(name = "fk_contents_no"), nullable = false)
    private TbContentsComment tbContentsComment; // 외래 키 관계 (contents_no)

    @Column(name = "id", nullable = false, length = 30)
    private String id; // 답변 작성자 ID

    @Column(name = "reg_date", nullable = false)
    private LocalDate regDate; // 답변 등록 날짜

    @Column(name = "use_yn", nullable = false, length = 2)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "delete_yn", length = 2)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "answer_contents", nullable = false, columnDefinition = "MEDIUMTEXT")
    private String answerContents; // 답변 내용

    @Column(name = "class_code", length = 6)
    private String classCode; // 콘텐츠 분류 코드

    @Column(name = "board_type_code", length = 6)
    private String boardTypeCode; // 게시판 유형 코드

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제된 날짜


}
