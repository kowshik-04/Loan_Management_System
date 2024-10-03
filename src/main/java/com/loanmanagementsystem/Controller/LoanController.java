package com.loanmanagementsystem.Controller;

import com.loanmanagementsystem.Entity.Loan;
import com.loanmanagementsystem.Service.LoanService;
import com.loanmanagementsystem.Service.impl.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoanController {
    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        super();
        this.loanService = loanService;
    }
    @RequestMapping(path = {"/","log"})
    public String home1(Loan loan, Model model, String keyword) {
        if(keyword != null) {
            List<Loan> list = loanService.getByKeyword(keyword);
            model.addAttribute("list", list);
        } else {
            List<Loan> list = loanService.getAllLoan();
            model.addAttribute("list", list);
        }
        return "home";
    }
    @RequestMapping(path = {"/user"})
    public String createLoanForm1(Model model) {
        Loan loan = new Loan();
        model.addAttribute("loan", loan);
        return "create_loan";
    }
    @RequestMapping(path = {"/search"})
    public String home(Loan loan, Model model, String keyword) {
        if(keyword != null) {
            List<Loan> list = loanService.getByKeyword(keyword);
            model.addAttribute("list", list);
        } else {
            List<Loan> list = loanService.getAllLoan();
            model.addAttribute("list", list);
        }
        return "loan_list";
    }
    @RequestMapping(path = {"/customer"})
    public String home4(Loan loan, Model model, String keyword) {
        if(keyword != null) {
            List<Loan> list = loanService.getByKeyword(keyword);
            model.addAttribute("list", list);
        } else {
            List<Loan> list = loanService.getAllLoan();
            model.addAttribute("list", list);
        }
        return "loan_list";
    }

    @GetMapping("/loan")
    public String listLoan(Model model) {
        model.addAttribute("loans", loanService.getAllLoan());
        return "loan";
    }

    @GetMapping("/loan/new")
    public String createLoanForm(Model model) {
        Loan loan = new Loan();
        model.addAttribute("loan", loan);
        return "create_loan";
    }

    @PostMapping("/loan")
    public String saveLoan(@ModelAttribute("loan") Loan loan) {
        loanService.saveLoan(loan);
        return "redirect:/loan";
    }

    @GetMapping("/loan/edit/{id}")
    public String editLoanForm(@PathVariable Long id, Model model) {
        model.addAttribute("loan", loanService.getLoanById(id));
        return "edit_loan";
    }

    @PostMapping("/loan/{id}")
    public String updateLoan(@PathVariable Long id,
                             @ModelAttribute("loan") Loan loan,
                             Model model) {
        Loan existingLoan = loanService.getLoanById(id);
        existingLoan.setId(id);
        existingLoan.setFirstName(loan.getFirstName());
        existingLoan.setLastName(loan.getLastName());
        existingLoan.setEmail(loan.getEmail());
        existingLoan.setAmount(loan.getAmount());
        existingLoan.setInterest(loan.getInterest());
        existingLoan.setTerm(loan.getTerm());

        loanService.updateLoan(existingLoan);
        return "redirect:/loan";
    }

    @GetMapping("/loan/{id}")
    public String deleteLoan(@PathVariable Long id) {
        loanService.deleteLoantById(id);
        return "redirect:/loan";
    }
    
    // New method for Loan Calculator
    @GetMapping("/loan-calculator")
    public String loanCalculator() {
        return "loan-calculator";  // Return the loan-calculator.html page
    }
}

