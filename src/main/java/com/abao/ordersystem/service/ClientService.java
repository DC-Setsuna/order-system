package com.abao.ordersystem.service;

import com.abao.ordersystem.entity.Client;
import com.abao.ordersystem.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by DC on 2019/5/31.
 */

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    @Async
    public Client searchClient() {

        return new Client();
    }
}
