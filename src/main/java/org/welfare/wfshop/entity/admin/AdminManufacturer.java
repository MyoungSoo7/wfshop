package org.welfare.wfshop.entity.admin;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_admin_manufacturer")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class AdminManufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '관리자-제조사 매핑 고유 번호 (Primary Key)'")
    private Integer seq;

    @Column(name = "admin_no", nullable = false, length = 15, columnDefinition = "VARCHAR(15) COMMENT '관리자 고유 번호 (tb_admin.admin_no 참조)'")
    private String adminNo;

    @Column(name = "MANUFACTURER_NO", nullable = false, length = 30, columnDefinition = "VARCHAR(30) COMMENT '제조사 고유 번호'")
    private String manufacturerNo;

    @Column(name = "MANUFACTURER_SECOND_NO", length = 30, columnDefinition = "VARCHAR(30) DEFAULT NULL COMMENT '하위 제조사 고유 번호 (옵션)'")
    private String manufacturerSecondNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "admin_no",
            referencedColumnName = "admin_no",
            insertable = false,
            updatable = false,
            foreignKey = @ForeignKey(name = "fk_admin_seq")
    )
    private Admin admin;
}
