package com.deportivo.clubDeportivo.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Integer> {
    // This interface extends JpaRepository, which provides CRUD operations for UserModel entities.
    // You can add custom query methods here if needed.
    
}
