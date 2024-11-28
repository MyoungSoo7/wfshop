package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_event_comment", indexes = {
        @Index(name = "ix_tb_event_comment_board_no", columnList = "board_no"),
        @Index(name = "ix_tb_event_comment_member_no", columnList = "member_no")
})
public class TbEventComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 고유 식별자 (Primary Key)

    @Column(name = "id", length = 30, nullable = false)
    private String id; // 작성자 ID

    @Column(name = "member_no", length = 20, nullable = false)
    private String memberNo; // 회원 번호

    @Column(name = "board_no", length = 20, nullable = false)
    private String boardNo; // 이벤트 번호

    @Column(name = "reg_date", nullable = false)
    private java.sql.Date regDate; // 등록 일시

    @Column(name = "contents", nullable = false, columnDefinition = "TEXT")
    private String contents; // 댓글 내용

    @Column(name = "use_yn", length = 2, nullable = false)
    private String useYn; // 사용 여부 (Y/N)

    @Column(name = "delete_yn", length = 2)
    private String deleteYn; // 삭제 여부 (Y/N)
}

