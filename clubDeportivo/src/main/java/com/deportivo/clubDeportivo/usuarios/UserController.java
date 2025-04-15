package com.deportivo.clubDeportivo.usuarios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    // Define endpoints for user-related operations here
    // For example:
    // @PostMapping
    // public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
    //     UserModel createdUser = userService.createUser(user);
    //     return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    // }
    // @GetMapping("/{id}")
    // public ResponseEntity<UserModel> getUserById(@PathVariable Integer id) {
    //     UserModel user = userService.getUserById(id);
    //     if (user != null) {
    //         return ResponseEntity.ok(user);
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
    //     userService.deleteUser(id);
    //     return ResponseEntity.noContent().build();
    // }
    // Add more endpoints as needed
    // Example: Get all users
    @GetMapping
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }
    // Example: Update user
    // @PutMapping("/{id}")
    // public ResponseEntity<UserModel> updateUser(@PathVariable Integer id, @RequestBody UserModel user) {
    //     UserModel updatedUser = userService.updateUser(id, user);
    //     if (updatedUser != null) {
    //         return ResponseEntity.ok(updatedUser);
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }
}

