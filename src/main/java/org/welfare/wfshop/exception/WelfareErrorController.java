package org.welfare.wfshop.exception;

import org.springframework.ui.Model;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

@Controller
public class WelfareErrorController implements ErrorController {

    @RequestMapping("/error")
    public String errorHtml(HttpServletRequest request, Model model) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString()));
        model.addAttribute("code", status.toString());
        model.addAttribute("msg", httpStatus.getReasonPhrase());
        model.addAttribute("date", new Date());
        Exception ex = (Exception) request.getAttribute("jakarta.servlet.error.exception");
        if(ex != null) {
            StringWriter errors = new StringWriter();
            ex.printStackTrace(new PrintWriter(errors));
            model.addAttribute("ex", errors);
        }

        return "error/" + status.toString();
    }

}
