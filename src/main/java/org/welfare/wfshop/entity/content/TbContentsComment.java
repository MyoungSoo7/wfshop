package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_contents_comment",
        indexes = {
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
public class TbContentsComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 코멘트 고유 식별자 (Primary Key)

    @Column(name = "id", nullable = false, length = 30)
    private String id; // 작성자 ID

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo; // 작성자 회원 번호

    @Column(name = "contents_no", nullable = false, length = 20)
    private String contentsNo; // 코멘트가 달린 콘텐츠 번호

    @Column(name = "class_code", nullable = false, length = 20)
    private String classCode; // 콘텐츠 분류 코드

    @Column(name = "reg_date", nullable = false)
    private LocalDate regDate; // 코멘트 등록 날짜

    @Column(name = "contents", nullable = false, columnDefinition = "MEDIUMTEXT")
    private String contents; // 코멘트 내용

    @Column(name = "use_yn", nullable = false, length = 2)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "delete_yn", length = 2)
    private String deleteYn; // 삭제 여부 (Y: 삭제, N: 미삭제)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제된 날짜

    @Column(name = "board_type_code", length = 6)
    private String boardTypeCode; // 게시판 유형 코드

    // TbContentsCommentAnswer와의 관계 설정 (1:N)
    @OneToMany(mappedBy = "tbContentsComment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TbContentsCommentAnswer> answers; // 코멘트에 달린 답변 리스트
}
