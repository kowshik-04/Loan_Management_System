package com.loanmanagementsystem.Service;

import com.loanmanagementsystem.Entity.Role;

public interface RoleService {
    Role findByName(String name);
}
