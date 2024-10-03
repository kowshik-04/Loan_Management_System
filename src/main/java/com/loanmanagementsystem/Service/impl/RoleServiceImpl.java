package com.loanmanagementsystem.Service.impl;

import com.loanmanagementsystem.Entity.Role;
import com.loanmanagementsystem.Repository.RoleRepository;
import com.loanmanagementsystem.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
