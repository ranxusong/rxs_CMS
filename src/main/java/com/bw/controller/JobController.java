package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.entity.Job;
import com.bw.service.JobService;

@Controller
public class JobController {

	@Resource
	private JobService service;
	@RequestMapping("list.do")
	public String queryAllJob(Model model){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Job> list = service.queryAllJob(map);
		System.out.println(list);
		model.addAttribute("list", list);
		return "list";
	}
}
