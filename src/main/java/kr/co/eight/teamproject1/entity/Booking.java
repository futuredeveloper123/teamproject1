package kr.co.eight.teamproject1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Booking extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BOOKING_ID;  //INT(100),
    private String BOOKING_PAYMENT; //CHAR(3) NOT NULL DEFAULT 'X' CHECK(BOOKING_PAYMENT IN ('O', 'X')),
    private String BOOKING_PLACE_NAME; //VARCHAR(60) NOT NULL,
    private String BOOKING_PLACE_ADDRESS; //VARCHAR(600) NOT NULL,
    private Long BOOKING_TEAMMEMBER; //INT(20) NOT NULL,
    private String BOOKING_NAME; //VARCHAR(30)

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Member MEMBER_ID;

    //TEAMmember_NICKNAME
}
