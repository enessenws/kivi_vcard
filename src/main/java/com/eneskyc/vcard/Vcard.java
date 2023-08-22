package com.eneskyc.vcard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Vcard  {

    @GetMapping
    String getVcard(Model model) {
        model.addAttribute("something", "Vcard icin ilk yazi");
        return "vcard" ;
    }
}
