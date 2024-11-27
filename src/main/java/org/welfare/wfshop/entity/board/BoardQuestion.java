package org.welfare.wfshop.entity.board;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "tb_board_question",
        indexes = {
                @Index(name = "ix_tb_board_question_board_type_code", columnList = "board_type_code"),
                @Index(name = "ix_tb_board_question_member_no", columnList = "member_no"),
                @Index(name = "ix_tb_board_question_query_type", columnList = "query_type")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class BoardQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no", nullable = false, columnDefinition = "INT COMMENT '질문 게시글 고유 번호 (Primary Key)'")
    private Integer boardNo;

    @Column(name = "board_type_code", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '게시판 유형 코드 (예: 문의, 제안 등)'")
    private String boardTypeCode;

    @Column(name = "member_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호 (문의 작성자)'")
    private String memberNo;

    @Column(name = "query_type", nullable = false, length = 6, columnDefinition = "VARCHAR(6) COMMENT '문의 유형 코드 (예: 제품 문의, 서비스 문의 등)'")
    private String queryType;

    @Column(name = "name", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '문의 작성자 이름'")
    private String name;

    @Column(name = "file_master_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '첨부 파일 코드'")
    private String fileMasterCode;

    @Column(name = "hospital_name", nullable = false, length = 50, columnDefinition = "VARCHAR(50) COMMENT '병원 이름'")
    private String hospitalName;

    @Column(name = "hospital_address", nullable = false, length = 100, columnDefinition = "VARCHAR(100) COMMENT '병원 주소'")
    private String hospitalAddress;

    @Column(name = "hospital_detail_address", nullable = false, length = 60, columnDefinition = "VARCHAR(60) COMMENT '병원 상세 주소'")
    private String hospitalDetailAddress;

    @Column(name = "zip", length = 5, columnDefinition = "VARCHAR(5) COMMENT '우편번호'")
    private String zip;

    @Lob
    @Column(name = "content", columnDefinition = "TEXT COMMENT '문의 내용'")
    private String content;

    @Lob
    @Column(name = "answer_content", columnDefinition = "TEXT COMMENT '답변 내용'")
    private String answerContent;

    @Column(name = "reg_date", columnDefinition = "TIMESTAMP COMMENT '문의 등록 시간'")
    private LocalDateTime regDate;

    @Column(name = "answer_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '답변 여부 (Y: 답변 완료, N: 답변 대기)'")
    private String answerYn;

    @Column(name = "delete_yn", nullable = false, length = 1, columnDefinition = "CHAR(1) COMMENT '삭제 여부 (Y: 삭제됨, N: 삭제되지 않음)'")
    private String deleteYn;

    @Column(name = "delete_date", columnDefinition = "TIMESTAMP NULL COMMENT '삭제 시간'")
    private LocalDateTime deleteDate;

    @Column(name = "query_product_code", length = 20, columnDefinition = "VARCHAR(20) COMMENT '문의 관련 제품 코드'")
    private String queryProductCode;

    @Column(name = "title", length = 40, columnDefinition = "VARCHAR(40) COMMENT '문의 제목'")
    private String title;

    @Column(name = "job_type", length = 6, columnDefinition = "VARCHAR(6) COMMENT '직업 유형 코드'")
    private String jobType;

    @Column(name = "query_telephone", length = 11, columnDefinition = "VARCHAR(11) COMMENT '문의자 전화번호'")
    private String queryTelephone;

    @Column(name = "area_type", length = 6, columnDefinition = "VARCHAR(6) COMMENT '지역 유형 코드'")
    private String areaType;

    @Column(name = "opening_date", length = 6, columnDefinition = "VARCHAR(6) COMMENT '개원 예정일'")
    private String openingDate;

    @Column(name = "opening_form", length = 6, columnDefinition = "VARCHAR(6) COMMENT '개원 형태 코드'")
    private String openingForm;

    @Column(name = "mail", length = 40, columnDefinition = "VARCHAR(40) COMMENT '문의자 이메일'")
    private String mail;

    @Column(name = "opening_field", length = 6, columnDefinition = "VARCHAR(6) COMMENT '개원 분야 코드'")
    private String openingField;

    @Column(name = "product_code", length = 40, columnDefinition = "VARCHAR(40) COMMENT '제품 코드'")
    private String productCode;

    @Column(name = "order_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '주문 번호'")
    private String orderNo;

    @Column(name = "shopping_no", length = 20, columnDefinition = "VARCHAR(20) COMMENT '쇼핑몰 번호'")
    private String shoppingNo;

    @Column(name = "con_code", length = 6, columnDefinition = "VARCHAR(6) COMMENT '상담 코드'")
    private String conCode;


}

