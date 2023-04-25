package com.nishikant.myfancypdfinvoices.springboot.Controller;

import com.nishikant.myfancypdfinvoices.springboot.dto.InvoiceDTO;
import com.nishikant.myfancypdfinvoices.springboot.model.Invoice;
import com.nishikant.myfancypdfinvoices.springboot.service.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    public List<Invoice> getInvoices(){
        return this.invoiceService.findAll();
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody @Valid InvoiceDTO invoiceDTO){
        return this.invoiceService.create(invoiceDTO.getUserId(), invoiceDTO.getAmount());
    }
}
