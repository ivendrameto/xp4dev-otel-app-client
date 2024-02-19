package dev.xp4.article.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import dev.xp4.article.dto.ClientDTO;
import dev.xp4.article.persistence.entity.Client;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ClientMapper {

    List<ClientDTO> toListDTO(List<Client> entity);
    ClientDTO toDTO(Client entity);

}
