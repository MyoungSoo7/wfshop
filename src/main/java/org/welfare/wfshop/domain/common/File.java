package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_file", indexes = {
        @Index(name = "ix_tb_file_master_code", columnList = "file_master_code"),
        @Index(name = "ix_tb_file_product_id", columnList = "product_id")
})
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_no", nullable = false)
    private Integer fileNo; // 고유 식별자 (Primary Key)

    @Column(name = "file_master_code", length = 100)
    private String fileMasterCode; // 파일 마스터 코드

    @Column(name = "original_file_name", length = 200, nullable = false)
    private String originalFileName; // 원본 파일명

    @Column(name = "change_file_name", length = 200, nullable = false)
    private String changeFileName; // 변경된 파일명

    @Column(name = "file_path", length = 200, nullable = false)
    private String filePath; // 파일 경로

    @Column(name = "file_description", nullable = false, columnDefinition = "TEXT")
    private String fileDescription; // 파일 설명

    @Column(name = "reg_date")
    private java.sql.Timestamp regDate; // 등록 일시

    @Column(name = "delete_yn", length = 1, nullable = false)
    private String deleteYn; // 삭제 여부 (Y/N)

    @Column(name = "delete_date")
    private java.sql.Timestamp deleteDate; // 삭제 일시

    @Column(name = "product_id")
    private Integer productId; // 연관된 상품 ID

    @Column(name = "use_yn", length = 2, nullable = false, columnDefinition = "CHAR(2) DEFAULT 'Y'")
    private String useYn; // 사용 여부 (Y/N)
}
