package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.User;
import com.demo.repository.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {
	@Autowired // 自动注入
	private UserRepository userRepository;

	@GetMapping(path = "/add") // 只响应GET请求
	public @ResponseBody String addUser(@RequestParam String username, @RequestParam String password) {
		// @ResponBody表示返回String类型数据
		// @RequestParam表示GET或POST请求的参数
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		User savedUser = userRepository.save(user);
		if (savedUser == null) {
			return "error";
		} else {
			return "add success!";
		}
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// 返回Json格式或xml格式
		return userRepository.findAll();
	}
}
