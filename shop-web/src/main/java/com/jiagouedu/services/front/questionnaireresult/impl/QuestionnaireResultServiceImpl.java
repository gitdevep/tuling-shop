package com.jiagouedu.services.front.questionnaireresult.impl;import com.jiagouedu.core.ServersManager;import com.jiagouedu.services.front.questionnaireresult.QuestionnaireResultService;import com.jiagouedu.services.front.questionnaireresult.bean.QuestionnaireResult;import com.jiagouedu.services.front.questionnaireresult.dao.QuestionnaireResultDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Servicepublic class QuestionnaireResultServiceImpl extends        ServersManager<QuestionnaireResult, QuestionnaireResultDao> implements		QuestionnaireResultService {     @Resource    @Override    public void setDao(QuestionnaireResultDao questionnaireResultDao) {        this.dao = questionnaireResultDao;    }}