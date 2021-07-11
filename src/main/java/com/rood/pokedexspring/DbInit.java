//package com.rood.pokedexspring;
//
//import com.rood.pokedexspring.pokemon.PokemonRepository;
//import com.rood.pokedexspring.user.User;
//import com.rood.pokedexspring.user.UserRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DbInit implements InitializingBean {
//    private final static Logger LOGGER = LoggerFactory.getLogger(DbInit.class);
//
//    private UserRepository userRepository;
//    private PasswordEncoder passwordEncoder;
//    private PokemonRepository placeRepository;
//
//    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder, PokemonRepository placeRepository) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.placeRepository = placeRepository;
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        LOGGER.info("Kod wykonywany po inicjalizacji beana");
//
//        User admin1 = new User("admin1", passwordEncoder.encode("pass1"), "ROLE_ADMIN");
//        userRepository.save(admin1);
//        User user1 = new User("user1", passwordEncoder.encode("pass1"), "ROLE_USER");
//        userRepository.save(user1);
//
//
//
//    }
//}
