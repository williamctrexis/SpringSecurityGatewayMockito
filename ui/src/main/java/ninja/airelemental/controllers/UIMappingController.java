package ninja.airelemental.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@Controller
public class UIMappingController {

  @GetMapping(value = "/{path:[^\\.]*}")
  public String redirect() {
    return "forward:/";   // forwards to the url from the MVC URI pattern captured in @GetMapping? What does the ^ do?
  }

  @RequestMapping("/user")
  @ResponseBody
  public Map<String, String> user(Principal user) {
    return Collections.singletonMap("name", user.getName());
  }

}
