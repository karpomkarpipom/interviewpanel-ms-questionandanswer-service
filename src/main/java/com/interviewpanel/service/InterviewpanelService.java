package com.interviewpanel.service;

import java.util.List;

import com.interviewpanel.bean.InterviewQARequest;

public interface InterviewpanelService {
	
	InterviewQARequest addInterviewQA(InterviewQARequest interviewqaRequest);
	InterviewQARequest updateInterviewQA(InterviewQARequest interviewqaRequest);
	void deleteInterviewQA(String _id);
	List<InterviewQARequest> retrieveAllQAs();

}
