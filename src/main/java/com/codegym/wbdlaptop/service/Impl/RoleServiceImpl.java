package com.codegym.wbdlaptop.service.Impl;

import com.codegym.wbdlaptop.model.Role;
import com.codegym.wbdlaptop.model.RoleName;
import com.codegym.wbdlaptop.repository.IRoleRepository;
import com.codegym.wbdlaptop.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository repository;

    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return repository.findByName(roleName);
    }
}
