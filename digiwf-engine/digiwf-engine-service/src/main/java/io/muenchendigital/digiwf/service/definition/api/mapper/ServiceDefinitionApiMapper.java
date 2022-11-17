package io.muenchendigital.digiwf.service.definition.api.mapper;

import io.muenchendigital.digiwf.legacy.form.api.mapper.FormFieldTOMapper;
import io.muenchendigital.digiwf.service.definition.api.transport.ServiceDefinitionDetailTO;
import io.muenchendigital.digiwf.service.definition.api.transport.ServiceDefinitionTO;
import io.muenchendigital.digiwf.service.definition.domain.model.ServiceDefinition;
import io.muenchendigital.digiwf.service.definition.domain.model.ServiceDefinitionDetail;
import org.mapstruct.Mapper;

import java.util.List;

//TODO remove if from is deprecated
@Mapper(uses = FormFieldTOMapper.class)
public interface ServiceDefinitionApiMapper {

    List<ServiceDefinitionTO> map2TO(List<ServiceDefinition> list);

    ServiceDefinitionDetailTO map2TO(ServiceDefinitionDetail obj);

}