package com.wise.DAO;

import java.util.List;

import com.wise.DTO.Board;

public interface BoardDAO {

	// 게시글 가져오기
	public List list() throws Exception;

	// 게시글 작성
	public void write(Board vo) throws Exception;

	// 게시물 조회
	public Board view(int bno) throws Exception;

	// 게시물 수정
	public void modify(Board vo) throws Exception;

	// 게시뮬 삭제
	public void delete(int bno) throws Exception;

	// 게시물 총 갯수
	public int count() throws Exception;

	// 게시물 목록 + 페이징
	public List<Board> listPage(int displayPost, int postNum) throws Exception;

	// 게시물 목록 + 페이징 + 검색
	public List<Board> listPageSearch(int displayPost, int postNum, String searchType, String keyword) throws Exception;

	// 게시물 총 갯수 + 검색 적용
	public int searchCount(String searchType, String keyword) throws Exception;
}
