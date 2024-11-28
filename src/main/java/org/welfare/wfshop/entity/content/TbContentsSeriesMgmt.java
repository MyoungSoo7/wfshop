package org.welfare.wfshop.entity.content;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_contents_series_mgmt",
        indexes = {
                @Index(name = "idx_series_code", columnList = "series_code"),
                @Index(name = "idx_series_type", columnList = "series_type"),
                @Index(name = "idx_category_type", columnList = "category_type"),
                @Index(name = "idx_use_yn", columnList = "use_yn")
        }
)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class TbContentsSeriesMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq; // 시리즈 고유 식별자 (Primary Key)

    @Column(name = "series_code", length = 45)
    private String seriesCode; // 시리즈 코드

    @Column(name = "series_type", length = 30)
    private String seriesType; // 시리즈 유형

    @Column(name = "category_type", length = 30)
    private String categoryType; // 카테고리 유형

    @Column(name = "series_name", length = 200)
    private String seriesName; // 시리즈 이름

    @Column(name = "series_detail_name", length = 200)
    private String seriesDetailName; // 시리즈 상세 이름

    @Column(name = "doctor_yn", length = 1, nullable = false)
    private String doctorYn; // 의사 여부 (Y: 의사, N: 비의사)

    @Column(name = "step_yn", length = 1, nullable = false)
    private String stepYn; // 단계 여부 (Y: 단계 있음, N: 없음)

    @Column(name = "of_original_yn", length = 1, nullable = false)
    private String ofOriginalYn; // 원본 여부 (Y: 원본, N: 비원본)

    @Column(name = "hot_yn", length = 1, nullable = false)
    private String hotYn; // 인기 여부 (Y: 인기, N: 비인기)

    @Column(name = "use_yn", length = 45)
    private String useYn; // 사용 여부 (Y: 사용, N: 미사용)

    @Column(name = "sort")
    private Integer sort; // 정렬 순서

    @Column(name = "file_master_code", length = 30)
    private String fileMasterCode; // 파일 마스터 코드

    @Column(name = "file_master_code2", length = 30)
    private String fileMasterCode2; // 파일 마스터 코드 2

    @Column(name = "reg_date")
    private LocalDateTime regDate; // 등록일
}
