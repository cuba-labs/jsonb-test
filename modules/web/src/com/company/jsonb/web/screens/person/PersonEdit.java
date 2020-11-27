package com.company.jsonb.web.screens.person;

import com.company.jsonb.entity.Address;
import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.screen.*;
import com.company.jsonb.entity.Person;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("jsonb_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {

    @Inject
    private DataManager dataManager;
    @Inject
    private UniqueNumbersService uniqueNumbersService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Person> event) {

        final Address address = dataManager.create(Address.class);
        address.setId(Long.valueOf(uniqueNumbersService.getNextNumber("app")).intValue());
        address.setCountry("TestCountry");
        address.setCity("TestCity");
        address.setAddress(String.format("Test Address, %d", address.getId()));
        event.getEntity().setAddress(address);

    }
}