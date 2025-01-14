/*
 * Copyright (c): it@M - Dienstleister für Informations- und Telekommunikationstechnik der Landeshauptstadt München, 2020
 */
package de.muenchen.oss.digiwf.legacy.dms.muc.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@Component
@Validated
@ConfigurationProperties(prefix = "digiwf.dms")
public class DmsProperties {

    @NotBlank
    private String address;

    @NotBlank
    private String username;

    @NotBlank
    private String uiurl;

    private String password;

    private String defaultUser;

    private String businessapp;

}
