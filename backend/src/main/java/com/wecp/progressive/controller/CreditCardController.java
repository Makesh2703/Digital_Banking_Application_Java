// package com.wecp.progressive.controller;


// import com.wecp.progressive.entity.CreditCard;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// public class CreditCardController {

//     public ResponseEntity<List<CreditCard>> getAllCreditCards() {
//         return null;
//     }

//     public ResponseEntity<CreditCard> getCreditCardById(Long id) {
//         return null;
//     }

//     public ResponseEntity<CreditCard> createCreditCard(CreditCard creditCard) {
//         return null;
//     }

//     public ResponseEntity<Void> updateCreditCard(Long id, CreditCard creditCard) {
//         return null;
//     }

//     public ResponseEntity<Void> deleteCreditCard(Long id) {
//         return null;
//     }
// }
package com.wecp.progressive.controller;


import com.wecp.progressive.entity.CreditCard;
import com.wecp.progressive.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit-cards")
public class CreditCardController {
    private final CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @GetMapping
    public ResponseEntity<List<CreditCard>> getAllCreditCards() {
        List<CreditCard> creditCards = creditCardService.getAllCreditCards();
        return new ResponseEntity<>(creditCards, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CreditCard> getCreditCardById(@PathVariable Long id) {
        CreditCard creditCard = creditCardService.getCreditCardById(id);
        if (creditCard != null) {
            return new ResponseEntity<>(creditCard, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<CreditCard> createCreditCard(@RequestBody CreditCard creditCard) {
        CreditCard createdCreditCard = creditCardService.createCreditCard(creditCard);
        return new ResponseEntity<>(createdCreditCard, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCreditCard(@PathVariable Long id, @RequestBody CreditCard creditCard) {
        CreditCard existingCreditCard = creditCardService.getCreditCardById(id);
        if (existingCreditCard != null) {
            creditCard.setId(id);
            creditCardService.updateCreditCard(creditCard);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCreditCard(@PathVariable Long id) {
        CreditCard existingCreditCard = creditCardService.getCreditCardById(id);
        if (existingCreditCard != null) {
            creditCardService.deleteCreditCard(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
