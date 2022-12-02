package com.example.model1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentTO {

	private String seq;
	private String writer;
	private String password;
	private String content;
	private String datetime;

}