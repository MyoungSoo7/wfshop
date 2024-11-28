package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_education_survey", indexes = {
        @Index(name = "ix_tb_education_survey_education_no", columnList = "education_no"),
        @Index(name = "ix_tb_education_survey_member_no", columnList = "member_no")
})
public class TbEducationSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 고유 식별자 (Primary Key)

    @Column(name = "education_no", length = 50, nullable = false)
    private String educationNo; // 강의 번호

    @Column(name = "education_name", length = 500, nullable = false)
    private String educationName; // 강의명

    @Column(name = "member_no", length = 50, nullable = false)
    private String memberNo; // 회원 번호

    @Column(name = "pay_price")
    private Integer payPrice; // 결제 금액

    @Column(name = "survey_question_1", nullable = false)
    private Integer surveyQuestion1; // 설문 문항 1

    @Column(name = "survey_question_2", nullable = false)
    private Integer surveyQuestion2; // 설문 문항 2

    @Column(name = "survey_question_3", nullable = false)
    private Integer surveyQuestion3; // 설문 문항 3

    @Column(name = "survey_question_4")
    private Integer surveyQuestion4; // 설문 문항 4

    @Column(name = "survey_question_5", nullable = false)
    private Integer surveyQuestion5; // 설문 문항 5

    @Column(name = "survey_question_6", nullable = false)
    private Integer surveyQuestion6; // 설문 문항 6

    @Column(name = "survey_question_7", nullable = false)
    private Integer surveyQuestion7; // 설문 문항 7

    @Column(name = "survey_question_8", nullable = false, columnDefinition = "TEXT")
    private String surveyQuestion8; // 설문 문항 8 (주관식)

    @Column(name = "reg_date", nullable = false)
    private java.sql.Timestamp regDate; // 설문조사 등록일
}

