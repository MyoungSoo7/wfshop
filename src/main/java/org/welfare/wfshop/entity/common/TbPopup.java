package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_popup", indexes = {
        @Index(name = "idx_admin_no", columnList = "admin_no"),
        @Index(name = "idx_use_yn", columnList = "use_yn"),
        @Index(name = "idx_delete_yn", columnList = "delete_yn"),
        @Index(name = "idx_start_date", columnList = "start_date"),
        @Index(name = "idx_end_date", columnList = "end_date")
})
public class TbPopup {

    @Id
    @Column(name = "board_no", nullable = false)
    private Integer boardNo;

    @Column(name = "admin_no", length = 20, nullable = false)
    private String adminNo;

    @Column(name = "file_master_code", length = 20, nullable = false)
    private String fileMasterCode;

    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "use_yn", length = 2, nullable = false)
    private String useYn;

    @Column(name = "url", length = 300)
    private String url;

    @Column(name = "delete_yn", length = 2)
    private String deleteYn;

    @Column(name = "delete_date")
    private LocalDateTime deleteDate;

    @Column(name = "modify_no", length = 20)
    private String modifyNo;

    @Column(name = "mod_date")
    private LocalDateTime modDate;

    @Column(name = "new_yn", length = 2)
    private String newYn;

    @Column(name = "title", length = 80)
    private String title;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;
}
