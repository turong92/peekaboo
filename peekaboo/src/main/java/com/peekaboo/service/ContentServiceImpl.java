package com.peekaboo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.peekaboo.domain.Content;
import com.peekaboo.mapper.ContentMapper;

public class ContentServiceImpl implements ContentService{
	@Autowired
	private ContentMapper contentMapper;
	
	
	@Override
	public boolean insertContent(Content content) {
		int queryResult = 0;
		queryResult = contentMapper.insertContent(content);
		System.out.println(queryResult);
		return (queryResult == 1) ? true : false;
	}

	@Override
	public boolean deleteContent(Long contentId) {
		int queryResult = 0;
		queryResult = contentMapper.deleteContent(contentId);
		System.out.println(queryResult);
		return (queryResult == 1) ? true : false;
	}

	@Override
	public boolean updateContent(Content content) {
		int queryResult = 0;
		queryResult = contentMapper.updateContent(content);
		System.out.println(queryResult);
		return (queryResult == 1) ? true : false;
	}

	@Override
	public List<Content> getMainContentByUserId(String userId) {
		return contentMapper.getMainContentByUserId(userId);
	}

	@Override
	public Content getContentByContentId(Long contentId) {
		return contentMapper.getContentByContentId(contentId);
	}

}