package com.itemmania.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "board")
public class BoardEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  게시판 번호
    private int boardNum;

    @ManyToOne
    @JoinColumn(name = "userNum")
    // 회원 번호
    private UserEntity userNum;

    @Column
    // 게임 번호
    private int gameNum;

    @Column
    // 서버명
    private String gameServer;

    @Column
    // 게시글 작성 시간
    private LocalDate boardTime;

    @Column
    // 게시판 제목, 물품 제목
    private String boardTitle;

    @Column
    // 물건 수량
    private int saleUnit;

    @Column
    // 판매 금액
    private int salePrice;

    @Column
    // 거래하는 본인 캐릭터 명
    private String saleNickName;

    @Column
    // 게시판 상세 -> 상세설명
    private String saleAria;

    @Column
    // 게시판 상세 -> 판매 스크린샷 (최대5장)
    private String salePhoto;

    @Column
    // 판매 물품 수량  타입 (일반[value:0], 분할[value:1])
    private boolean saleType;

    @Column
    // 거래 현황  (진행중 [value:0], 거래완료 [value:1])
    private boolean boardTradeStatus;

    @Column
    // 프리미엄 서비스 우뮤
    private boolean salePremium;
}
