package com.company.jsonb.web.screens.address;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.screen.*;
import com.company.jsonb.entity.Address;

import javax.inject.Inject;

@UiController("jsonb_Address.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {

    @Inject
    private UniqueNumbersService uniqueNumbersService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Address> event) {
        event.getEntity().setId(Long.valueOf(uniqueNumbersService.getNextNumber("app")).intValue());
    }



}