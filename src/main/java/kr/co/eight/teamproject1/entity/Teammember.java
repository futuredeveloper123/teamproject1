package kr.co.eight.teamproject1.entity;
//동호회테이블
public class Teammember extends BaseEntity{

    private String Teammember_NICKNAME;  //VARCHAR(30) PRIMARY KEY,
    private Long Teammember_FEE; //INT DEFAULT 0,
    private String Teammember_LOCATION; //VARCHAR(600),
    private String Teammember_BOOKINGID; //VARCHAR(30),

    //    @ManyToOne(fetch = FetchType.LAZY)
    //    private Member MEMBER_ID;
}
