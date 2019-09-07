package com.tzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tzh.utils.StringUtils;

@Controller
public class WebController {
	
	
	@RequestMapping("toAdd.do")
	public String toAdd() {
		return "add";
	}
	@RequestMapping("add.do")
	@ResponseBody
	public int add(String str) {
		if(StringUtils.isBlank(str)) {
			String replaceStr = StringUtils.replaceStr(str);
			System.out.println(replaceStr);
			return 1;
		}else {
			return 0;
		}
	}

}
