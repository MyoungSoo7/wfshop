package org.welfare.wfshop.domain.board;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_board_answer",
        indexes = {
                @Index(name = "ix_tb_board_answer_board_no", columnList = "board_no"),
                @Index(name = "ix_tb_board_answer_member_no", columnList = "member_no"),
                @Index(name = "ix_tb_board_answer_writer_no", columnList = "writer_no")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BoardAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '답변 고유 식별자'")
    private Integer seq;

    @ManyToOne(fetch = FetchType.LAZY) // 다대일 관계 설정
    @JoinColumn(
            name = "board_no", // 외래 키 컬럼 이름
            referencedColumnName = "board_no", // 참조하는 컬럼 이름
            foreignKey = @ForeignKey(name = "fk_board_no") // 외래 키 제약 조건 이름
    )
    private BoardCommon board; // 참조하는 엔티티

    @Lob
    @Column(name = "answer_content", nullable = false, columnDefinition = "TEXT")
    private String answerContent;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록 시간'")
    private LocalDateTime regDate;

    @Column(name = "writer_no", length = 15, columnDefinition = "VARCHAR(15) COMMENT '작성자 번호'")
    private String writerNo;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "file_master_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '파일 마스터 코드'")
    private String fileMasterCode;

    @Column(name = "board_type_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드'")
    private String boardTypeCode;
}
