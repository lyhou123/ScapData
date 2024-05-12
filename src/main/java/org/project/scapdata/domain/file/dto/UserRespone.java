package org.project.scapdata.domain.file.dto;

import lombok.Builder;
import lombok.Data;

@Builder

public record UserRespone (
        String name,
        String email,
        String phone,
        String address,
        String personal,
        String education,
        String project,
        String awards,
        String contact,
        String skills,
        String language,
        String reference
){
}
