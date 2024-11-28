package org.welfare.wfshop.entity.common;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_like")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq", nullable = false)
    private Integer seq;

    @Column(name = "member_no", nullable = false, length = 20)
    private String memberNo;

    @Column(name = "contents_no", nullable = false, length = 30)
    private String contentsNo;

    @Column(name = "contents_type", nullable = false, length = 6)
    private String contentsType;

    @Column(name = "board_type_code", nullable = false, length = 6)
    private String boardTypeCode;

    @Column(name = "reg_date", nullable = false)
    private LocalDate regDate;

    @Column(name = "story_post_num", length = 40)
    private String storyPostNum;

    @Column(name = "page")
    private Integer page;
}
