package com.plachkovskyy.controller;

import com.plachkovskyy.dao.CalculatorDAO;
import com.plachkovskyy.model.CalculatorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

        @Autowired
        private CalculatorDAO dao;
        private int result;

        @RequestMapping(value="/showResult", method = RequestMethod.GET)
        public ModelAndView showResult(int operation) {
            result = dao.result(operation);
            return new ModelAndView("showResult", "studentsList", result);
        }

}
