package com.wise.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wise.DAO.BoardDAO;
import com.wise.DTO.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	// 게시글 가져오기
	@Override
	public List list() throws Exception {
		return dao.list();
	}

	// 게시글 작성
	@Override
	public void write(Board vo) throws Exception {
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public Board view(int bno) throws Exception {
		return dao.view(bno);
	}

	// 게시물 수정
	@Override
	public void modify(Board vo) throws Exception {
		dao.modify(vo);
	}

	// 게시물 삭제
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

	// 게시물 총 갯수
	@Override
	public int count() throws Exception {
		return dao.count();
	}

	// 게시물 목록 + 페이징
	@Override
	public List<Board> listPage(int displayPost, int postNum) throws Exception {
		return dao.listPage(displayPost, postNum);
	}

	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<Board> listPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception {
		return dao.listPageSearch(displayPost, postNum, searchType, keyword);
	}

	// 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		return dao.searchCount(searchType, keyword);
	}

}
