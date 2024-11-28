package org.welfare.wfshop.domain.content;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_contents_related",
        indexes = {
                @Index(name = "idx_contents_no", columnList = "contents_no"),
                @Index(name = "idx_related_contents_no", columnList = "related_contents_no")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsRelated {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDX", nullable = false)
    private Integer idx; // 연관 관계 고유 식별자 (Primary Key)

    @Column(name = "contents_no", length = 20)
    private String contentsNo; // 기준 콘텐츠 번호

    @Column(name = "related_contents_no", length = 20)
    private String relatedContentsNo; // 연관된 콘텐츠 번호
}
