package com.interviewpanel.bean;

import java.io.Serializable;
import java.util.List;
import  com.interviewpanel.bean.GivenAnswers;
import lombok.Data;

@Data
public class QuestionAnswers {
	private String qId;
	private String technology;
	private String questionAsked;
	//private List<GivenAnswers> givenAnswers;
	private String givenAnswer;
	public String getqId() {
		return qId;
	}
	public void setqId(String qId) {
		this.qId = qId;
	}

}
