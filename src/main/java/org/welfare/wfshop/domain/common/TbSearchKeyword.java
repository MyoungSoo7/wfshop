package org.welfare.wfshop.domain.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tb_search_keyword", indexes = {
        @Index(name = "idx_type", columnList = "type"),
        @Index(name = "idx_no", columnList = "no"),
        @Index(name = "idx_keyword", columnList = "keyword")
})
public class TbSearchKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "type", length = 100, nullable = false)
    private String type;

    @Column(name = "no", length = 100, nullable = false)
    private String no;

    @Column(name = "keyword", length = 100, nullable = false)
    private String keyword;
}
