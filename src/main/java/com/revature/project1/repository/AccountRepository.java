
package com.revature.project1.repository;

import com.revature.project1.repository.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
