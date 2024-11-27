package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "tb_calendar",
        indexes = {
                @Index(name = "ix_tb_calendar_year_month", columnList = "YEAR, MONTH"),
                @Index(name = "ix_tb_calendar_year_month_day", columnList = "YEAR, MONTH, DAY"),
                @Index(name = "ix_tb_calendar_date", columnList = "DATE")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT COMMENT '달력 데이터 고유 ID (Primary Key)'")
    private Long id;

    @Column(name = "YEAR", nullable = false, columnDefinition = "INT COMMENT '연도 (예: 2024)'")
    private Integer year;

    @Column(name = "MONTH", nullable = false, columnDefinition = "TINYINT COMMENT '월 (1~12)'")
    private Integer month;

    @Column(name = "DAY", nullable = false, columnDefinition = "TINYINT COMMENT '일 (1~31)'")
    private Integer day;

    @Column(name = "DATE", nullable = false, unique = true, length = 255, columnDefinition = "VARCHAR(255) COMMENT '날짜 문자열 (예: 2024-11-26)'")
    private String date;
}

