package com.movietheater.repository;

import com.movietheater.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, String> {

        Account findAccountByUserName( String userName);
}
