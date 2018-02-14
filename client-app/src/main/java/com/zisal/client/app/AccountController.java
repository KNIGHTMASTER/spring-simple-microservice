package com.zisal.client.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created on 2/14/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/accountList")
    public String accountList(Model model) {
        model.addAttribute("accounts", accountRepository.getAllAccounts());
        return "account-list";
    }

    @RequestMapping("/accountDetails")
    public String accountDetails(@RequestParam("number") String id, Model model) {
        model.addAttribute("account", accountRepository.getAccount(id));
        return "account-details";
    }
}
