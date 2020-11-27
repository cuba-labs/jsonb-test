package com.company.jsonb.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.jsonb.entity.Person;

@UiController("jsonb_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}