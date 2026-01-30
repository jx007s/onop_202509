package aaa.di;

import lombok.Data;

@Data
public class PageInfo {

	String service;
	int  cnt = 5, pCnt = 4;
	int pNo;
	int start,total;
	int pStart, pEnd;
}
