package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_ip_log")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IpLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cno", length = 50)
    private String cno;

    @Column(name = "ip_address", length = 25)
    private String ipAddress;

    @Column(name = "ip_id", length = 50)
    private String ipId;

    @Column(name = "reg_date")
    private LocalDateTime regDate;
}
