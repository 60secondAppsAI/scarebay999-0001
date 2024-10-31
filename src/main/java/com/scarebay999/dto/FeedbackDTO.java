package com.scarebay999.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class FeedbackDTO {

	private Integer feedbackId;

	private String content;

	private int rating;

	private Date createdDate;






}
