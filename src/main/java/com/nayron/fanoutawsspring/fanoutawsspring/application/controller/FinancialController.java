package com.nayron.fanoutawsspring.fanoutawsspring.application.controller;

import com.nayron.fanoutawsspring.fanoutawsspring.domain.entity.Financial;
import com.nayron.fanoutawsspring.fanoutawsspring.domain.service.FinancialService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("financial")
@AllArgsConstructor
public class FinancialController {
    private FinancialService financialService;

    @GetMapping
    public ResponseEntity<List<Financial>> getAll () {
        List<Financial> financialList = financialService.getAll();
        return ResponseEntity.ok(financialList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Financial> getById(@PathVariable String id) {
        Financial financial = financialService.getById(id);
        return ResponseEntity.ok(financial);
    }
}
