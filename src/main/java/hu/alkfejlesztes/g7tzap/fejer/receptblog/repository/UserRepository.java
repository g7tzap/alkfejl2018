package hu.alkfejlesztes.g7tzap.fejer.receptblog.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
