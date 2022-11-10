package com.graphql.StudentWithGraphQl.Repo;

import com.graphql.StudentWithGraphQl.entity.SAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<SAddress,Integer> {
}
