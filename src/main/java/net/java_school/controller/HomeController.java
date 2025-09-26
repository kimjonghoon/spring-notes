package net.java_school.controller;

import net.java_school.user.UserForm;
import net.java_school.user.Preferences;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		UserForm user = new UserForm();
		user.setFirstName("john");
		Preferences preferences = new Preferences();
		user.setPreferences(preferences);
		model.addAttribute("user", user);
		return "index";
	}
}
