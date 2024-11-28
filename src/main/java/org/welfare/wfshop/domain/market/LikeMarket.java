package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_like_market",
        indexes = {
                @Index(name = "idx_member_no", columnList = "member_no"),
                @Index(name = "idx_product_id", columnList = "product_id")
        }
        )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LikeMarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '시퀀스'")
    private Integer seq;

    @Column(name = "member_no", nullable = false, length = 20, columnDefinition = "VARCHAR(20) COMMENT '회원 번호'")
    private String memberNo;

    @Column(name = "reg_date", nullable = false, columnDefinition = "DATETIME COMMENT '등록일'")
    private LocalDateTime regDate;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", foreignKey = @ForeignKey(name = "fk_product_like_id"))
    private Market market;
}
