package nl.midasvo.ideatj.controller;

import nl.midasvo.ideatj.dto.IdeatjDTO;
import nl.midasvo.ideatj.service.IdeatjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/ideatj")
public class IdeatjController {

    @Autowired
    private IdeatjService ideatjService;

    @GetMapping("/list")
    public ResponseEntity<List<IdeatjDTO>> listIdeatj() {
        List<IdeatjDTO> ideatjs = ideatjService.listIdeatj();
        return ResponseEntity.ok(ideatjs);
    }

}
