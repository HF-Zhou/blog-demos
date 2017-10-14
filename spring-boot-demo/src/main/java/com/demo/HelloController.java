package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController表示使用Spring MVC来处请网络请求
// @RestController 是@Controller与@ResponseBody，表示返回数据，而不是返回一个View
public class HelloController {
	// @RequestMapping("/")表示映射路径 /，使用index()方法处理
	// 也就是访问 "localhost:8080/" 返回一个String
	@RequestMapping("/")
	public String index() {
		return "Hello, world";
	}
}
