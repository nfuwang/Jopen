package org.cloud.core.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.core.service.impl.UsersServiceImpl;
import org.cloud.utils.SpringUtil;
import org.cloud.utils.SystemParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {

	@Autowired
    private UsersServiceImpl usersService ;
    

	//登录动作执行
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public Map login(@RequestParam String username,@RequestParam String password,HttpServletRequest request){
    	String userPasswd = usersService.getPasswdByName(username);
    	Map map = new HashMap();
    	map.put("row1","hello");
    	map.put("row2","world");
    	if(userPasswd.equals(password)){
    		HttpSession session = request.getSession();
    		session.setAttribute(SystemParameter.LOGIN_SESSION_NAME, username);
    		return map;
    	}
		return null;
    }
    
    //获取人员信息
    @RequestMapping(value="/getPersonData.do" ,method = RequestMethod.POST)
    @ResponseBody //添加该注释后，返回值将由转换器进行转换，转换器为Jackson，所以会转换成json格式
    public Map<String,Object> getPersonData(){
        Map<String,Object> personMap = new HashMap<String,Object>();
        personMap.put("rows","hello");
        
        return personMap;
        
    }

}