package org.welfare.wfshop.entity.order;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_point_setting", indexes = {
        @Index(name = "idx_setting_key", columnList = "setting_key"),
        @Index(name = "idx_type", columnList = "type")
})
public class TbPointSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setting_id", nullable = false)
    private Integer settingId;

    @Column(name = "setting_key", length = 20, nullable = false)
    private String settingKey;

    @Column(name = "setting_value1", length = 50)
    private String settingValue1;

    @Column(name = "setting_value2", length = 50)
    private String settingValue2;

    @Column(name = "setting_value3", length = 50)
    private String settingValue3;

    @Column(name = "comment", length = 30, nullable = false)
    private String comment;

    @Column(name = "type", length = 255)
    private String type;
}
