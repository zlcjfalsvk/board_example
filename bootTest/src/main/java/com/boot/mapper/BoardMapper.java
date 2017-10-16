package com.boot.mapper;

import java.util.List;

import com.boot.domain.BoardVO;

public interface BoardMapper {
	
	//�� �ۼ�
	public void boardinsert(BoardVO vo) throws Exception;

	//�� ���
	public List<BoardVO>boardList()throws Exception;
	
	//�� ����
	public BoardVO boardView(int bno) throws Exception;
	
	//��ȸ�� ����
	public void hitPlus(int bno) throws Exception;
	
	//�� ����
	public void boardUpdate(BoardVO vo) throws Exception;
	
	//�� ����
	public void boardDelete(int bno) throws Exception;
	
	//increment ����
	public void boardIncrement() throws Exception;
}
