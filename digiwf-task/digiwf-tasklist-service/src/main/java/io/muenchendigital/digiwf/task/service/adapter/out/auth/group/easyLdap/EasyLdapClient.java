package io.muenchendigital.digiwf.task.service.adapter.out.auth.group.easyLdap;

import io.muenchendigital.digiwf.task.service.adapter.out.auth.group.easyLdap.model.UserInfoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        name = "easyldap",
        url = "${easyldap.client.url}"
)
public interface EasyLdapClient {

    @RequestMapping(value = "/v1/ldap/user/{lhmObjectId}", method = {RequestMethod.GET}, produces = {"application/json"})
    UserInfoResponse getUserById(@PathVariable("lhmObjectId") String lhmObjectId);

}