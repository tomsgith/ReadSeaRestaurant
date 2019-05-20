package com.ea.redsea.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ea.redsea.domain.Hotel;



@Controller
@RequestMapping({"/user"})
public class UserController {
	
	@RequestMapping({"/hotellist"})
	public String Hotellist(Model model) {
		model.addAttribute("hotels", "Redae");
		return "listHotel";
	}
	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public String getAddBookForm(@ModelAttribute("newBooking") Hotel hotel) {
	   return "reservation";
	}
	@RequestMapping(value = "/reservation", method = RequestMethod.POST)
	public String processAddBookForm(@ModelAttribute("newBooking") @Valid Hotel hotel, BindingResult result) 
	{
		if(result.hasErrors()) {
			return "reservation";
		}

 		try {
			//hotelService.save(hotel);
		} catch (Exception up) {
	      System.out.println("Transaction Failed!!!");
 
		}
		
	   	return "redirect:/user/success";
	}
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String getSuccess(){
	   return "success";
	}
	
	
	

}
