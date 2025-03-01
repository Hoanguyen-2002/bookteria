package com.devteria.identity.mapper;

import com.devteria.identity.dto.request.ProfileCreationRequest;
import com.devteria.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Profile;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
