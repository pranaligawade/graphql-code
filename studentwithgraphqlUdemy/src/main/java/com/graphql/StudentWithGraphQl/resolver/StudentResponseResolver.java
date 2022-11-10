package com.graphql.StudentWithGraphQl.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.StudentWithGraphQl.response.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentResponseResolver  implements GraphQLResolver<StudentResponse> {
}
