package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Job;
import com.bw.mapper.JobMapper;
@Service
public class JobServiceImpl implements JobService{

	@Resource
	private JobMapper mapper;
	public List<Job> queryAllJob(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.queryAllJob(map);
	}

}
