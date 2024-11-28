package org.welfare.wfshop.entity.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_review", indexes = {
        @Index(name = "ix_tb_education_review_member_no", columnList = "member_no"),
        @Index(name = "ix_tb_education_review_education_no", columnList = "education_no")
})
public class TbEducationReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_seq", nullable = false)
    private Integer reviewSeq; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", nullable = false, length = 20)
    private String educationNo; // 강좌 코드 (tb_education.education_no 참조)

    @Column(name = "order_no", nullable = false, length = 20)
    private String orderNo; // 주문 번호

    @Column(name = "shopping_no", nullable = false, length = 20)
    private String shoppingNo; // 쇼핑 번호

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content; // 리뷰 내용

    @Column(name = "score", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer score; // 리뷰 점수

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo; // 회원 번호

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시

    @Column(name = "mod_date")
    private java.sql.Timestamp modDate; // 수정 일시

    @Column(name = "modify_no", length = 15)
    private String modifyNo; // 수정자 회원 번호

    @Column(name = "file_master_code", length = 20)
    private String fileMasterCode; // 첨부 파일 코드

    @Column(name = "delete_yn", nullable = false, length = 1)
    private String deleteYn; // 삭제 여부 (Y/N)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제 일시

    @Column(name = "use_yn", nullable = false, length = 1)
    private String useYn; // 사용 여부 (Y/N)

    @Column(name = "lecture_type", nullable = false, length = 6)
    private String lectureType; // 강좌 유형 (온/오프)

    @Column(name = "best_product_yn", nullable = false, length = 1)
    private String bestProductYn; // 베스트 리뷰 여부 (Y/N)

    @Column(name = "answer_yn", length = 2)
    private String answerYn; // 답변 여부 (Y/N)
}
