package com.loanmanagementsystem.Service;

import com.loanmanagementsystem.Entity.User;

public interface UserService {
    User findByUsername(String username);
    void saveUser(User user);
}
