package org.welfare.wfshop.domain.market;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_product_hits", indexes = {
        @Index(name = "idx_product_id", columnList = "product_id"),
        @Index(name = "idx_member_no", columnList = "member_no"),
        @Index(name = "idx_obtain_date", columnList = "obtain_date")
})
public class TbProductHits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "member_no", length = 20)
    private String memberNo;

    @Column(name = "job_type", length = 6)
    private String jobType;

    @Column(name = "obtain_date", length = 10)
    private String obtainDate;

    @Column(name = "ip_address", length = 30)
    private String ipAddress;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
}
