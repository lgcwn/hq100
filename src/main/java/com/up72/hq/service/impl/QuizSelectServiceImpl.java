/*
 * Powered By [up72-framework]
 * Web Site: http://www.up72.com
 * Since 2006 - 2016
 */

package com.up72.hq.service.impl;

import java.util.*;

import com.up72.hq.model.*;
import com.up72.hq.dao.*;
import com.up72.hq.service.*;

import com.up72.framework.util.page.PageBounds;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.up72.hq.service.IQuizSelectService;
import com.up72.framework.util.page.PageList;
import com.up72.framework.util.page.Page;

/**
 * 竞猜选项DAO实现
 * 
 * @author liuguicheng
 * @version 1.0
 * @since 1.0
 */
@Service
@Transactional
public class QuizSelectServiceImpl implements  IQuizSelectService{
	
	@Autowired
	private QuizSelectMapper quizSelectMapper;
	
	public void save(QuizSelect quizSelect){
		quizSelectMapper.insert(quizSelect);
	}

    public void update(QuizSelect quizSelect){
		quizSelectMapper.update(quizSelect);
	}
	
    public void delete(java.lang.Long id){
		quizSelectMapper.delete(id);
	}
    
    @Transactional(readOnly=true)
    public QuizSelect getById(java.lang.Long id){
		return quizSelectMapper.findById(id);
	}

    @Transactional(readOnly=true)
    public Page<QuizSelect> getPage(Map params, PageBounds rowBounds){
        PageList list = quizSelectMapper.findPage(params, rowBounds);
		return new Page<QuizSelect>(list,list.getPagination());
	}

	@Override
	public List<QuizSelect> getList(Map params) {
		return quizSelectMapper.findList(params);
	}


}
