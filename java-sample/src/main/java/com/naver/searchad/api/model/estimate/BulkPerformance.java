package com.naver.searchad.api.model.estimate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkPerformance {
	private String keyword;
	private Integer bid;
	private Boolean keywordplus;
	private Device device;
	private Long clicks;
	private Long impressions;
	private Long cost;
}
