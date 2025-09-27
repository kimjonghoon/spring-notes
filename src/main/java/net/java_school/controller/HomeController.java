package net.java_school.controller;

import net.java_school.user.UserForm;
import net.java_school.user.Preferences;
import net.java_school.user.Country;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		UserForm user = new UserForm();
		user.setFirstName("john");
		Preferences preferences = new Preferences();
		user.setPreferences(preferences);
		List<String> mySkills = new ArrayList<String>();
		mySkills.add("potions");
		user.setSkills(mySkills);
		String myCountry = "AT";
		user.setCountry(myCountry);
		model.addAttribute("user", user);
		List<String> list = new ArrayList<String>();
		list.add("Quidditch");
		list.add("Herbology");
		list.add("Defence Against the Dark Arts");
		model.addAttribute("interestList", list);
		Map<String,String> skills = new HashMap<String,String>();
		skills.put("potions","Potions");
		skills.put("herbology","Herbology");
		skills.put("quidditch","Quidditch");
		model.addAttribute("skills",skills);	
		List<Country> countryList = new ArrayList<Country>();
		Country country = new Country("AT", "Austria");
		countryList.add(country);
		country = new Country("UK", "United Kingdom");
		countryList.add(country);
		country = new Country("US", "United States");
		countryList.add(country);
		model.addAttribute("countryList",countryList);
		return "index";
	}
}
