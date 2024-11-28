package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_keyword")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false)
    private Integer idx;

    @Column(name = "keyword", length = 300)
    private String keyword;

    @Column(name = "keyword_sub", columnDefinition = "TEXT")
    private String keywordSub;

    @Column(name = "Column3", length = 50)
    private String column3;

    @Column(name = "Column4", length = 50)
    private String column4;

    @Column(name = "Column5", length = 50)
    private String column5;

    @Column(name = "Column6", length = 50)
    private String column6;

    @Column(name = "Column7", length = 50)
    private String column7;
}
