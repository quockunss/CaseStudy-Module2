package com.codegym.cms.controller;


import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasFieldErrors()){
            return new ModelAndView("/customer/create");
        }
        customerService.save(customer);
        return new ModelAndView("redirect:/customers");





//        customerService.save(customer);
//        ModelAndView modelAndView = new ModelAndView("/customer/create");
//        modelAndView.addObject("customer",new Customer());
//        modelAndView.addObject("message", "New customer created successfully");
//        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers(@RequestParam("s")Optional<String> keyword, @RequestParam("page") Optional<Integer> page){
        Page<Customer> customers;
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        int pageNumb = 0;
        if (page.isPresent() && page.get() > 1){
            pageNumb = page.get() - 1;
        }

        PageRequest pageRequest = new PageRequest(pageNumb,8,new Sort("firstName"));
        if (keyword.isPresent()){
            customers = customerService.findAllByFirstNameContaining(keyword.get(), pageRequest);
            modelAndView.addObject("keyword",keyword.get());
        } else {
            customers = customerService.findAll(pageRequest);
        }

        modelAndView.addObject("customers", customers);
        return modelAndView;

//        Iterable<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/customer/list");
//        modelAndView.addObject("customers",customers);
//        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Customer customer = customerService.findById(id);
        if (customer != null){
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
        }

//    @GetMapping("/delete-customer/{id}")
//    public String deleteCustomer(@PathVariable("id") Long id){
//    customerService.remove(id);
//    return "redirect:/customers";
//    }

    @PostMapping("/customer/delete")
    public String deleteCustomer(@RequestParam("id") Long id){
        customerService.remove(id);
        return "redirect:/customers";
    }

}
