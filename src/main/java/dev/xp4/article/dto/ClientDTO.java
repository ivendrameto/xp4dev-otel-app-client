package dev.xp4.article.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDTO implements Serializable {

    private Long id;
    private String name;
    private String document;
    private Boolean active;

}
