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
@Table(name = "tb_order_api_log", indexes = {
        @Index(name = "idx_server_name", columnList = "server_name")
})
public class TbOrderApiLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false)
    private Integer idx;

    @Column(name = "server_name", length = 200)
    private String serverName;

    @Column(name = "ip", length = 200)
    private String ip;

    @Column(name = "host", length = 200)
    private String host;

    @Column(name = "parameter", length = 1000)
    private String parameter;

    @Column(name = "result", columnDefinition = "TEXT")
    private String result;

    @Column(name = "reg_date", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regDate;
}

