package br.com.anaisateodoro.todolist.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * Public
 * Private
 * Protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * String (texto)
     * Integer (int) números inteiros
     * Double (double) Números 0.0000
     * Float (float) Números 0.000
     * Char (charecter)
     * Date (data)
     * void (não quer retorno no método)
     */
    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());

    }
    
}
