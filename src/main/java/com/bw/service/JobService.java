package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.entity.Job;

public interface JobService {

	public List<Job> queryAllJob(Map<String,Object> map);
}
