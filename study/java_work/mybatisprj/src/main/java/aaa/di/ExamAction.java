package aaa.di;

import aaa.model.ExamDTO;

public interface ExamAction {

	Object execute(ExamDTO dto, PageInfo pInfo);
}
