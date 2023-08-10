package com.pcwk.ehr.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pcwk.ehr.domain.BoardVO;
import com.pcwk.ehr.cmn.WorkDiv;

public interface BoardDao extends WorkDiv<BoardVO>  {

	int doRetrieveCount(BoardVO inVO) throws SQLException;



	
}
