package kr.co.eight.teamproject1.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MM extends BaseEntity{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long  MM_NUM; //INT PRIMARY KEY,
    private String MM_NAME; //VARCHAR(15) NOT NULL,
    private String MM_TEAMNAME; // VARCHAR(30) NOT NULL

    //TEAMmember_NICKNAME
}
