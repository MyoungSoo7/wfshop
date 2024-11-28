package org.welfare.wfshop.domain.education;

import jakarta.persistence.*;
import lombok.*;
import org.welfare.wfshop.domain.member.entity.Member;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_like_education")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LikeEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo;

    @Column(name = "education_no", nullable = false, length = 20)
    private String educationNo;

    @Column(name = "reg_date", nullable = false)
    private LocalDateTime regDate;

    @ManyToOne
    @JoinColumn(name = "education_no", referencedColumnName = "education_no", insertable = false, updatable = false)
    private TbEducation education;

    @ManyToOne
    @JoinColumn(name = "member_no", referencedColumnName = "member_no", insertable = false, updatable = false)
    private Member member;
}
