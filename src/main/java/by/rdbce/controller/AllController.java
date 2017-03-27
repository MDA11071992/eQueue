package by.rdbce.controller;

/**
 * Created by malabar on 3/26/17.
 */
import by.rdbce.domain.*;
import by.rdbce.repository.AllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AllController {

    @RequestMapping(value = "/")
    public String Terminal() {
        return "index";
    }

    private AllRepository listRepository;

    @Autowired
    public AllController(AllRepository listRepository){
        this.listRepository = listRepository;
    }

    @RequestMapping(value = "tickets", method = RequestMethod.GET)
    public String getListAddonpc(Model model) {
        List<tickets> ticketsListl = this.listRepository.listTickets();
        model.addAttribute("ticketsListl", ticketsListl);

        return "tickets";
    }

}
