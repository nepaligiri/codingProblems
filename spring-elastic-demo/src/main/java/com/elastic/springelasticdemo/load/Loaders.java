package com.elastic.springelasticdemo.load;

import com.elastic.springelasticdemo.model.Users;
import com.elastic.springelasticdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {
    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Users.class);
        System.out.println("Loading Data");
        userRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<Users> getData() {
        List<Users> userses = new ArrayList<>();
        userses.add(new Users("Ajay",123L, "Accounting", 12000L));
        userses.add(new Users("Jaga",1234L, "Finance", 22000L));
        userses.add(new Users("Thiru",1235L, "Accounting", 12000L));
        return userses;
    }
}
