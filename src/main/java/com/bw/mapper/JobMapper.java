package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Job;

public interface JobMapper {

	public List<Job> queryAllJob(Map<String,Object> map);
}
