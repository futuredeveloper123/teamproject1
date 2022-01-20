package kr.co.replydto.replydto.replyDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyDTO {
    private Long replyId;
    private Long boardId;
    private String membernickname;
    private String replycontent;
    private LocalDateTime regdate;
    private LocalDateTime updatedate;
    private String memberId;
    private String secretreply;

}
