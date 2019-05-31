package com.abao.ordersystem.repository;

import com.abao.ordersystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by DC on 2019/5/17.
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
