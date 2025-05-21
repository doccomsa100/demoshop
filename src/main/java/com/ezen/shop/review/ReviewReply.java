package com.ezen.shop.review;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReviewReply {

	// 테이블의 primary key 컬럼연결
	private Long reply_id;
	
    // 참조키
	private Long rev_code;
    
    private String manager_id;
    private String reply_text;
    private LocalDateTime reply_date;
    

}
