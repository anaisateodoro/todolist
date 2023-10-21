package br.com.anaisateodoro.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
                //Pegar a autenticação (usuário e senha)
               var authoritzation = request.getHeader("Authoritzation");
               System.out.println("Authorization");
               System.out.println(authoritzation);

                //Validar usuário

                //Validar senha

                //Segue viagem

            filterChain.doFilter(request, response);


    }
/* Código abaixo dá apenas um servelet request
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

                //Executar alguma ação
        
        System.out.println("Chegou no filtro");
        chain.doFilter(request,response);
        

    }*/
    
}
