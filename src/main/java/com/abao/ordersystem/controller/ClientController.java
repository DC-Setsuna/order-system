package com.abao.ordersystem.controller;

import com.abao.ordersystem.entity.Client;
import com.abao.ordersystem.repository.ClientRepository;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by DC on 2019/5/17.
 */

@RestController
@Api(value = "Client管理")
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping(path = "/add")
    @ApiOperation(value = "添加Client", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "client_name", value = "客户名", dataType = "String", required = true),
            @ApiImplicitParam(name = "group_name", value = "所在分组名", dataType = "String", required = true),
            @ApiImplicitParam(name = "org_name", value = "组织名", dataType = "String", required = true),
            @ApiImplicitParam(name = "client_name", value = "客户名", dataType = "String"),
    })
    public ResponseEntity addNewClient() {
//        Client client = new Client();
//        client.setClient_name(client_name);
//        client.setGroup_name(group_name);
//        client.setOrg_name(org_name);
//        client.setRemark(remark);

//        clientRepository.save(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "所有client信息", httpMethod = "GET")
    public Iterable<Client> getAllClient() {
//        System.out.println(requestJson);
//        System.out.println(requestJson.getJSONObject("hahahahah").getInteger("opop"));
        Iterable<Client> c = clientRepository.findAll();
        System.out.println(c);
        return c;
    }
}
