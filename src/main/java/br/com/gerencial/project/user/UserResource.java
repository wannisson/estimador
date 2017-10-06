package br.com.gerencial.project.user;

import br.com.gerencial.project.utils.GenericService;
import br.com.gerencial.project.utils.ResourcePaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourcePaths.USER_PATH)
public class UserResource extends GenericService<User, Long> {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User insert(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return super.insert(user);
    }

}
