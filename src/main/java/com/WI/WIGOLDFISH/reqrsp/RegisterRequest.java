package com.WI.WIGOLDFISH.reqrsp;

import com.WI.WIGOLDFISH.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class RegisterRequest {
    private  String username;
    private String email;
    private String password;
    private String profilePicture;
    private Role role;
}
