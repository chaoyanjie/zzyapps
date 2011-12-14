package cn.com.widemex.action.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 范例
 * @author 张中原
 *
 */
@Controller
@RequestMapping("demo")
public class DemoController {
	
	/**
	 * 初始化demo列表界面
	 * @return
	 */
	@RequestMapping
	public String initDemo(){
		return "demo/demo";
	}
	
	
	/**
	 * 初始化treegrid
	 * @return
	 */
	@RequestMapping("initTreeGrid")
	public String initTreeGrid(){
		return "demo/treegrid/treegrid";
	}
	
	/**
	 * TreeGrid查询
	 * @param id key
	 * @return
	 */
	@RequestMapping("listTreeGrid")
	public @ResponseBody Object listTreeGrid(){//@RequestParam String id
		String json = "{'total':7,'rows':[ "+
					  "		{'id':1,'name':'All Tasks','begin':'3/4/2010','end':'3/20/2010','progress':60,'iconCls':'icon-ok'},"+
					  "		{'id':2,'name':'Designing','begin':'3/4/2010','end':'3/10/2010','progress':100,'_parentId':1,'state':'closed'},"+
					  "  	{'id':21,'name':'Database','persons':2,'begin':'3/4/2010','end':'3/6/2010','progress':100,'_parentId':2},"+
					  "		{'id':22,'name':'UML','persons':1,'begin':'3/7/2010','end':'3/8/2010','progress':100,'_parentId':2},"+
					  "		{'id':23,'name':'Export Document','persons':1,'begin':'3/9/2010','end':'3/10/2010','progress':100,'_parentId':2},"+
					  "		{'id':3,'name':'Coding','persons':2,'begin':'3/11/2010','end':'3/18/2010','progress':80},"+
				      "		{'id':4,'name':'Testing','persons':1,'begin':'3/19/2010','end':'3/20/2010','progress':20}"+
					  "	],'footer':["+
					  "		{'name':'Total Persons:','persons':7,'iconCls':'icon-sum'}"+
					  "	]} ";
		
		return json;
	}
	
	@RequestMapping("listTreeGrid2")
	public @ResponseBody Object listTreeGrid2(@RequestParam String id){
		System.out.println("主键：：" + id);
		
		String json = "{'total':7,'rows':[ "+
					  "		{'id':1,'name':'All Tasks','begin':'3/4/2010','end':'3/20/2010','progress':60,'iconCls':'icon-ok' ,'state':'closed'},"+
					  "		{'id':2,'name':'Designing','begin':'3/4/2010','end':'3/10/2010','progress':100,'state':'closed'}"+
					  "	]} ";
		
//		if("1".equals(id))
		
		
		return json;
	}
	
}
