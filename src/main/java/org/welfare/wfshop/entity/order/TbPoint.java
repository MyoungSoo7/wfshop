package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_point", indexes = {
        @Index(name = "idx_member_no", columnList = "member_no")
})
public class TbPoint {

    @Id
    @Column(name = "point_seq", length = 20, nullable = false)
    private String pointSeq;

    @Column(name = "member_no", length = 20, nullable = false)
    private String memberNo;

    @Column(name = "point_type", length = 6, nullable = false)
    private String pointType;

    @Column(name = "earn_point")
    private Integer earnPoint;

    @Column(name = "earn_code", length = 6)
    private String earnCode;

    @Column(name = "use_point")
    private Integer usePoint;

    @Column(name = "use_code", length = 6)
    private String useCode;

    @Column(name = "now_point", nullable = false)
    private Integer nowPoint;

    @Column(name = "reg_date", nullable = false)
    private LocalDateTime regDate;
}

