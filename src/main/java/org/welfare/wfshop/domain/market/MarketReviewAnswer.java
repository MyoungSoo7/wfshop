package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_market_review_answer"
      )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketReviewAnswer {

    @Id
    @Column(name = "review_seq", nullable = false, columnDefinition = "INT COMMENT '리뷰 시퀀스 (tb_market_review 참조)'")
    private Integer reviewSeq;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT COMMENT '답변 내용'")
    private String content;

    @Column(name = "writer_no", length = 15, nullable = false, columnDefinition = "VARCHAR(15) COMMENT '작성자 번호'")
    private String writerNo;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '등록일'")
    private LocalDateTime regDate;

    @OneToOne
    @JoinColumn(name = "review_seq", referencedColumnName = "review_seq", foreignKey = @ForeignKey(name = "fk_review_answer_review"))
    private MarketReview marketReview;
}
