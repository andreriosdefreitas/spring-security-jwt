package com.rios.security.domain.mapper;

import com.rios.security.domain.User;
import com.rios.security.domain.dto.UserView;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserViewMapper {
    UserView toDto(User user, String token);
    User toEntity(UserView userView);
}
