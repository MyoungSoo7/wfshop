package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_file_sequence", indexes = {
        @Index(name = "ix_tb_file_sequence_file_no", columnList = "file_no"),
        @Index(name = "ix_tb_file_sequence_product_id", columnList = "product_id")
})
public class TbFileSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false)
    private Integer idx; // 고유 식별자 (Primary Key)

    @Column(name = "file_no")
    private Integer fileNo; // 파일 번호 (tb_file.file_no 참조)

    @Column(name = "product_id")
    private Integer productId; // 상품 ID

    @Column(name = "sequence_num")
    private Integer sequenceNum; // 파일 순서 번호

    @ManyToOne
    @JoinColumn(name = "file_no", referencedColumnName = "file_no", foreignKey = @ForeignKey(name = "fk_tb_file_sequence_file_no"), insertable = false, updatable = false)
    private File tbFile; // tb_file 테이블과의 관계
}
