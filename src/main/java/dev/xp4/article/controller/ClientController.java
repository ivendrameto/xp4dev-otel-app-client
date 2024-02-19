package dev.xp4.article.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import dev.xp4.article.dto.ClientDTO;
import dev.xp4.article.service.ClientService;

@RestController
@RequestMapping("/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientDTO> find(@RequestParam Map<String, String> allFilters) {
        return service.find(allFilters);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

}
