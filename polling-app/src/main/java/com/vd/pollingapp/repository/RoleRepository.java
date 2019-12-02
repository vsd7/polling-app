/**
 * 
 */
package com.vd.pollingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vd.pollingapp.model.Role;
import com.vd.pollingapp.model.RoleName;

/**
 * @author Hp
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(RoleName roleName);
}
