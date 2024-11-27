package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_content_original_custom_sort")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentOriginalCustomSort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false, columnDefinition = "INT COMMENT '고유 시퀀스 ID (Primary Key)'")
    private Integer seq;

    @Column(name = "contents_no", length = 15, columnDefinition = "VARCHAR(15) COMMENT '콘텐츠 번호'")
    private String contentsNo;

    @Column(name = "sort", columnDefinition = "INT COMMENT '정렬 순서'")
    private Integer sort;

    @Column(name = "use_yn", length = 2, nullable = false, columnDefinition = "CHAR(2) DEFAULT 'Y' COMMENT '사용 여부 (Y: 사용, N: 미사용)'")
    private String useYn;

    @Column(name = "reg_date", columnDefinition = "DATETIME COMMENT '등록일'")
    private LocalDateTime regDate;
}
