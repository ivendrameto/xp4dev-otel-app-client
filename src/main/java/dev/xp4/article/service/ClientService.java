package dev.xp4.article.service;

import java.util.List;
import java.util.Map;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import dev.xp4.article.dto.ClientDTO;
import dev.xp4.article.mapper.ClientMapper;
import dev.xp4.article.persistence.entity.Client;
import dev.xp4.article.persistence.repository.ClientRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository repository;
    private final ClientMapper mapper;

    public List<ClientDTO> find(Map<String, String> allFilters) {
        List<Client> list = repository.findAll();
        return mapper.toListDTO(list);
    }

    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException(String.format("Client id [%s] not found!", id)));

        return mapper.toDTO(entity);
    }

}
