package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_review_answer", indexes = {
        @Index(name = "ix_tb_education_review_answer_writer_no", columnList = "writer_no")
})
public class TbEducationReviewAnswer {

    @Id
    @Column(name = "review_seq", nullable = false)
    private Integer reviewSeq; // 리뷰 고유 번호 (tb_education_review.review_seq 참조)

    @OneToOne
    @JoinColumn(name = "review_seq", referencedColumnName = "review_seq", foreignKey = @ForeignKey(name = "fk_review_seq"))
    private TbEducationReview tbEducationReview; // tb_education_review와의 관계

    @Column(name = "answer_type", length = 25)
    private String answerType; // 답변 유형

    @Column(name = "answer_id", length = 45)
    private String answerId; // 답변 작성자 ID

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content; // 답변 내용

    @Column(name = "writer_no", length = 15, nullable = false)
    private String writerNo; // 작성자 회원 번호

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시


}
