package com.example.demo.service;

import com.example.demo.input.BookInput;
import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLResponse;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

@Service
public class
ClientService {
    @Autowired()
    GraphQLWebClient  graphQLWebClient;
    public Book getBook(Integer id){
        Map<String,Object> vari=new HashMap<>();
          vari.put("id",id);
      String queryStr=" query getBook($id:Int)\n" +
        "{\n" +
        "  getBook(id:$id ) {\n" +
        "    id\n" +
        "    title\n" +
        "    author\n" +
        "    price\n" +
        "  }\n" +
        "}\n";

        GraphQLRequest request=GraphQLRequest.builder().query(queryStr).variables(vari).build();
GraphQLResponse graphQLResponse=graphQLWebClient.post(request).block();
//        assert graphQLResponse != null;
        assert graphQLResponse != null;
        return  graphQLResponse.get("getBook", Book.class);
    }
    public Book create_book(BookInput bookInput){
        Map<String,Object> varible=new HashMap<>();
        varible.put("$book",bookInput);
        String mutationStr="\n" +
                "mutation createBook1($book:BookInput) {\n" +
                "  createBook1(book:$book) {\n" +
                "    id\n" +
                "    title\n" +
                "    author\n" +
                "    price\n" +
                "  }\n" +
                "}\n";
        GraphQLRequest request=GraphQLRequest.builder().query(mutationStr).variables(varible).build();
        GraphQLResponse graphQLResponse=graphQLWebClient.post(request).block();
//        assert graphQLResponse != null;
        assert graphQLResponse != null;
        return  graphQLResponse.get("createBook1", Book.class);

    }

}
