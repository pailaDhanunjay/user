package com.Dhanu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Dhanu.model.Marks;
import com.Dhanu.repo.MarksRepo;

@Controller
public class MarksController 
{
	@Autowired
	private MarksRepo marRepo;
	@RequestMapping("/")
	public String home()
	{
	return "check";	
	}
	@RequestMapping(value="/details",method=RequestMethod.POST)
	public String studentDetails(@RequestParam int sid,@RequestParam String fname,@RequestParam String lname,@RequestParam double sub1,@RequestParam double sub2,@RequestParam double sub3,Marks mark,Model model)
	{
		
		String fname1=fname;
		String lname1=lname;
		 String fullname = fname1+lname1;
		 mark.setFullname(fullname);
		double total=0,percentage=0;
		 String grade=" ";
		total=total+mark.getSub1()+mark.getSub2()+mark.getSub3();
		mark.setTotal(total);
		
		percentage=percentage+(total/3);
		mark.setPercentage(percentage);
		{
		if(percentage>=70)
		{
		grade=grade+"A grade";
		}
		else if(percentage>=60&&percentage<70)
		{
			grade=grade+"B grade";
		}
		else if(percentage>=50&&percentage<60)
		{
			grade=grade+"C grade";
		}
		else
		{
			grade=grade+"Fail";
		}
		}
	mark.setGrade(grade);
	marRepo.save(mark);
	return "verified";
	}
	@RequestMapping(value="/views",method=RequestMethod.GET)
	public String viewStudent(Marks marks,Model model)
	{
	model.addAttribute("marks",marRepo.findAll());
	return "resultview";
	}
	@RequestMapping(value="/delete/{sid}",method=RequestMethod.GET)
	public String deleteStudent(@PathVariable int sid)
	{
	marRepo.deleteById(sid);
	return "deleted";	
	}
	@RequestMapping(value="/update/{sid}")
	public String edit(@PathVariable int sid,Model model)
	{
		Marks mark=marRepo.findById(sid).get();
	    model.addAttribute("command",mark);
	    return "editmarks";	
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String editSave(@RequestParam String firstName,@RequestParam String lastName,@RequestParam double sub1,@RequestParam double sub2,@RequestParam double sub3,Marks mark,Model model)
	{
		
		 String fname=mark.getFirstName();
		String lname=mark.getLastName();
		 String fullname = fname+lname;
		 mark.setFullname(fullname);
		double total=0,percentage=0;
		 String grade=" ";
		total=total+mark.getSub1()+mark.getSub2()+mark.getSub3();
		mark.setTotal(total);
		percentage=percentage+(total/3);
		mark.setPercentage(percentage);
		{ 
		if(percentage>=70)
		{
		grade=grade+"A grade";
		}
		else if(percentage>=60&&percentage<70)
		{
			grade=grade+"B grade";
		}
		else if(percentage>=50&&percentage<60)
		{
			grade=grade+"C grade";
		}
		else
		{
			grade=grade+"Fail";
		}
	}
		mark.setGrade(grade);
		marRepo.save(mark); 
	return "updated";
	}
}
